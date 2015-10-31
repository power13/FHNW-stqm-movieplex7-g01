package org.javaee7.movieplex7.entities;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TimeslotTest {
	Timeslot t;
	
	@Before
	public void setUp() {
		t = new Timeslot();
	}
	
	@After
	public void tearDown() {
		t = null;
    }

	@Test
	public void setStartTime() {
		t.setStartTime("abcdeefg");
		assertEquals("abcdeefg", t.getStartTime());
	}
	
	@Test
	public void getTimeslotIdTest() {
		int id1 = 10;
		int id2 = 20;
		t.setId(id1);
		assertTrue(id1 == t.getId());
		t.setId(20);
		assertTrue(id2 == t.getId());
	}
	
	@Test
	public void getEndTimeTest() {
		t.setEndTime("abcdeefg");
		assertEquals("abcdeefg", t.getEndTime());
	}
	
	@Test
	public void equals() {
		Timeslot t1 = new Timeslot();
		Timeslot t2 = new Timeslot();
		String start = "avbc";
		String end = "efg";
		
		assertTrue(t1.equals(t2));
	}
	
	@Test
	public void testHashCode() {
		Timeslot t1 = new Timeslot();
		Timeslot t2 = new Timeslot();
		String start = "avbc";
		String end = "efg";
		
		assertEquals(t1.hashCode(), t2.hashCode());
	}

}
