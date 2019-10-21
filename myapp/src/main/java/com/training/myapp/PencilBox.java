package com.training.myapp;

public class PencilBox {
private int sharpner; ///instance variables
private int eraser;
private int scale;
private int pencil;
private static 	int MAX_STORAGE=30;//static variabes
	
//methods
	public int getSharpner() {
	return sharpner;
}

public void setSharpner(int sharpner) {
	this.sharpner = sharpner;
}

public int getEraser() {
	return eraser;
}

public void setEraser(int eraser) {
	this.eraser = eraser;
}

public int getScale() {
	return scale;
}

public void setScale(int scale) {
	this.scale = scale;
}

public int getPencil() {
	return pencil;
}

public void setPencil(int pencil) {
	this.pencil = pencil;
}
//parameterized Constructor
	public PencilBox(int sharpener, int eraser, int scale, int pencil) {
		this.sharpner=sharpener;
		this.eraser=eraser;
		this.scale=scale;
		this.pencil=pencil;
		
		// TODO Auto-generated constructor stub
	}
//default Constructor
	public PencilBox() {
		// TODO Auto-generated constructor stub
	}
//Staicmethod which can be accessible by classes
	public static int countOfThingsInPencilBox(PencilBox pencilBox1, PencilBox pencilBox2) {
		// TODO Auto-generated method stub
		int p1=0,p2=0;//local variables
		
		 p1 += pencilBox1.getPencil()+pencilBox1.getEraser()+pencilBox1.getScale()+pencilBox1.getSharpner();
		p2 +=pencilBox2.getPencil()+pencilBox2.getEraser()+pencilBox2.getScale()+pencilBox2.getSharpner();
		if((p1+p2)<=MAX_STORAGE) {
			System.out.println(p1+p2);
			return p1+p2;}
		else {
			System.out.println("PencilBox is full");
			return 0;
		}
		}
	public static void main(String args[]) {
		PencilBox p1=new PencilBox();//object
		EmployeeInformation e=new EmployeeInformation(10,"hgfghfhgf","fhgfhfh",7657657,"hghgn");
		e.getEmpSalary();
		
		p1.countOfThingsInPencilBox(new PencilBox(1,2,70,4), new PencilBox(6,7,1,0));
		
	}
	
	}


