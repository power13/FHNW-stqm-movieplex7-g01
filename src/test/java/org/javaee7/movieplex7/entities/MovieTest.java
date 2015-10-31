package org.javaee7.movieplex7.entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MovieTest {
	Movie m1;
	Movie m2;
	Movie m3;
	
	@Before
	public void setUp() {
		m1 = new Movie(1);
		m2 = new Movie(1);
		m3 = new Movie(2);
	}
	
	@After
	public void tearDown() {
		m1 = null;
		m2 = null;
	}
	
	@Test
	public void SalesIdTest() {
		assertTrue(1 == m1.getId());
	}
	
	@Test
	public void SalesHashCodeTest() {
		Integer hash = 1;
		assertEquals(m1.hashCode(), hash.hashCode());
	}
	
	@Test
	public void SalesEqualsTest() {
		assertTrue(m1.equals(m2));
		assertFalse(m1.equals(m3));
	}	
	
	@Test
	public void SalesToStringTest() {
		m1.setName("James Bond - Spectre");
		String string = "James Bond - Spectre";
		assertTrue(string.equals(m1.toString()));
	}		
}
