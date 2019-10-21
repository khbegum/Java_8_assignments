package com.training.myapp.tests;

//import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.exception.AgeNotWithInRangeException;
import com.training.myapp.exception.NameNotValidException;
import com.training.myapp.model.Student;

public class MyStudentDetailsTest {
@Test
	public void checkIsTheNameIsStrng() throws NameNotValidException {
		assertEquals(true,Student.checkName("Smiley") );
	}
@Test
public void checkIsTheNameIshavigNumbersAndOtherSymbols() throws NameNotValidException {
	assertEquals(false, Student.checkName("jhjhgj4"));
}
@Test
public void checkAge() throws AgeNotWithInRangeException {
	assertEquals(true, Student.checkage(22));
}

	
}
