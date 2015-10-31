package org.javaee7.movieplex7.entities;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TheaterTest {
	Theater t;
	
	@Before
	public void setUp() {
		t = new Theater();
		
	}
	
	@After
	public void tearDown() {
		t = null;
    }

	@Test
	public void setTheaterIdTest() {
		t.setId(10);
		assertTrue(10 == t.getId());
	}
	
	@Test
	public void getTheaterIdTest() {
		int id1 = 10;
		int id2 = 20;
		t.setId(id1);
		assertTrue(id1 == t.getId());
		t.setId(20);
		assertTrue(id2 == t.getId());
	}
	
	@Test
	public void getCapacityTest() {
		int capacity = 12;
		t.setCapacity(capacity);
		assertEquals(capacity, t.getCapacity());
	}
	

}
