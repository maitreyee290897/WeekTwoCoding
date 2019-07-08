package com.pack.TestingDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {


	static Calculator c1; 
	//Calculator c1 = new Calculator();
	@Before
	public void createObject() {
		c1= new Calculator();
		System.out.println("hii i am executing");
	}
	@After
	//@AfterClass
	//static public void removeObject() {
	 public void removeObject() {
		c1=null;
		System.out.println("Derefrenced");
	}
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		System.out.println("in the add test");
		assertEquals("Addition is not proper",40,c1.add(20,20));
	}
	@Test
	public void testSub() {
		//fail("Not yet implemented");
		System.out.println("in the sub test");
		assertEquals("Subtraction is not proper",0,c1.sub(20,20));
	}

	@Test
	public void isEqual() {
		//fail("Not yet implemented");
		System.out.println("in the comparison test");
		//assertEquals("comparison is not proper",true,c1.compare(20,20));
		assertTrue("they are not equal",c1.compare(20,20));
	}
	@Test
	public void isNotEqual() {
		//fail("Not yet implemented");
		System.out.println("in the not equal test");
		//assertEquals("comparison is not proper",true,c1.compare(20,20));
		assertFalse("t"
				+ ""
				+ "hey are not equal",c1.compare(10,20));
	}
}

