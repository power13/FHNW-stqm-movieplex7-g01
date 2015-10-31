package org.javaee7.movieplex7.entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SalesTest {
	Sales s1;
	Sales s2;
	Sales s3;
	
	@Before
	public void setUp() {
		s1 = new Sales(1);
		s2 = new Sales(1);
		s3 = new Sales(2);
	}
	
	@After
	public void tearDown() {
		s1 = null;
		s2 = null;
	}
	
	@Test
	public void SalesIdTest() {
		assertTrue(1 == s1.getId());
	}
	
	@Test
	public void SalesHashCodeTest() {
		Integer hash = 1;
		assertEquals(s1.hashCode(), hash.hashCode());
	}
	
	@Test
	public void SalesEqualsTest() {
		assertTrue(s1.equals(s2));
		assertFalse(s1.equals(s3));
	}	
	
	@Test
	public void SalesToStringTest() {
		String string = "foo.Sales[ id=1 ]";
		assertTrue(string.equals(s1.toString()));
	}		
	
}
