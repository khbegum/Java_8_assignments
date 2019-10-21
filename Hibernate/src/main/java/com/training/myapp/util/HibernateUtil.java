package com.training.myapp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

//import com.google.protobuf.AbstractMessage.Builder;

public class HibernateUtil {
private static SessionFactory factory;

public static Session getSession() {
	Session session = factory.openSession();
	return session;
}

public static void closeSessionFactory() {
	factory.close();
}

static {
	Configuration configuration=new Configuration().configure();
	//configuration.configure() if .xml file is hibernate.cfg.xml
	//else configuration.configure("jhhgjhhj.xml");
	StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder()
			                                  .applySettings(configuration.getProperties());
	// for mapping column names and table name;
	factory = configuration.buildSessionFactory(builder.build());
	
}


}
