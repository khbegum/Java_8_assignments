package com.training.myapp.tests;

import static org.junit.Assert.*;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.myapp.model.Patient;

public class PatientTest {
	//lambdaExpression
//private PriorityQueue<Patient> patients=new PriorityQueue<Patient>((p1,p2)->Integer.compare(p1.getPatientStatus(),p2.getPatientStatus()));
	//Method Reference
	private PriorityQueue<Patient> patients=new PriorityQueue<Patient>(Comparator.comparing(Patient::getPatientStatus));
@Before
public void setUp() {
	patients.add(new Patient("Sundharam",4));
	patients.add(new Patient("Minion",2));
	patients.add(new Patient("Agni",3));
	patients.add(new Patient("Lenovo",1));
	patients.add(new Patient("Camlin",5));
	patients.add(new Patient("Vivo",1));
}

@Test

	public void testPatientsOrder() {
	
	Patient[] expected = {new Patient("Lenovo",1),new Patient("Vivo",1),new Patient("Minion",2),new Patient("Agni",3),new Patient("Sundharam",4),new Patient("Camlin",5)};
	int i = 0;

	for (Patient patient : patients) {
		assertEquals(expected[i++], patient);
	}
//	Iterator<Patient>patient=patients.iterator();
//	
//	assertEquals(new Patient("Lenovo",1), patient.next());
//	
//	assertEquals(new Patient("Vivo",1), patient.next());
		
		
	}
@After
public void tearDown() {
	patients=null;
}

}
