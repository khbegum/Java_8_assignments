package com.training.myapp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.training.myapp.model.Order;

public class OrderMain {
public static void main(String[] args) {
	ArrayList<Order> orders=new ArrayList<Order>();
	orders.add(new Order(1, "Mobile", 70000, "pending"));
	orders.add(new Order(2,"PowerBank",20000,"Accepted"));
	orders.add(new Order(3,"Tshirt",500,"Completed"));
	orders.add(new Order(4, "Slippers", 90, "Completed"));
	orders.add(new Order(5, "PhoneCase", 100, "Completed"));
	orders.add(new Order(6,"DressingTable",7000,"Pending"));
	orders.add(new Order(7, "SofaSet",50000, "Completed"));
	orders.add(new Order(8, "PopUpButton", 50, "Pending"));
	orders.add(new Order(9, "WildCraftBag", 15000, "Accepted"));
	//--------------------display all details----------------------------------
//	for (Order order : orders) {
//		System.out.println(order);
//	}
	//----------------------displaying all details using functional interfaces----------------
	//----------Consumer functional interface,accept(T) abstract method
//	public interface Consumer<T>{
//		public void accept(T t);
//		
//	}
//	@Override
//	public void accept(T t) {
//		System.out.println(t);
//	}
	//---------------------------function interface using lambda expression-------------------------
	//Consumer<Order> order=(o)->System.out.println(o);
//	orders.forEach(order);
	List<Order> ListOfOrdersGreaterThanThousand=new ArrayList<Order>();
//	for(Order order:orders) {
//		if((order.getOrderPrice()>10000)&&(order.getOrderStatus().equals("Completed"))){
//			ListOfOrdersGreaterThanThousand.add(order);
//		}
//		
//	}
//	for(Order order:ListOfOrdersGreaterThanThousand)
//		System.out.println(order);	
	//--------------using Predicate functional interfaces,test() abstract method and lambda expressions
//	public interface Predicate<T> {
//	public boolean test(T t);
//}

//public class MyPredicate implements Predicate<Employee> {
//	@Override
//	public boolean test(Employee e) {
//		return e.getEmployeeDepartment().equals("Completed");
//	}
//}
	Predicate<Order> greater=(o)->o.getOrderPrice()>10000;
	Predicate<Order> statusCheck=(o)->o.getOrderStatus().equals("Completed")||o.getOrderStatus().equals("Accepted");
	ListOfOrdersGreaterThanThousand=orders.stream()
				   .filter(greater)
				   .filter(statusCheck)
				   .collect(Collectors.toList());
	ListOfOrdersGreaterThanThousand.forEach(o->System.out.println(o));
	//----------------Supplier functional interface which has get() abstract method---
//	public interface Supplier<T>{
//		public T get() {
//			return T;
//		}
//	}
	
//		Supplier<Order> newOrder=()->new Order(10, "Laptop", 90000, "Pending");
//		System.out.println(newOrder.get());
	//-------------Function<T,R> functional Interface ,apply(T) abstract method
//	public interface Function<T, R> {
//	public R apply(T t);
//}
//
//public MyFunction implements Function<Employee, String> {
//	@Override
//	public String apply(Employee e) {
//		return e.getEmployeeName();
//	}
//}
	Function<Order, String> Ordernames=(e)->e.getOrderNAme();
	List<String> completedStatusOrderNames=orders.stream().filter((o)->o.getOrderStatus().equals("Completed"))
														.map(Ordernames)
														.collect(Collectors.toList());
	completedStatusOrderNames.forEach(o->System.out.println(o));
	
		
	
}
}
