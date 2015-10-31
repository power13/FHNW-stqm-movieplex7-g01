package org.javaee7.movieplex7.booking;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookingTest {
	Booking b;
	
	@Before
	public void setUp() {
		b = new Booking();
	}
	
	@After
	public void tearDown() {
		b = null;
    }

	@Test
	public void setMovieIdTest() {
		b.setMovieId(10);
		assertEquals(10, b.getMovieId());
	}
	
	@Test
	public void getMovieIdTest() {
		b.setMovieId(10);
		assertEquals(10, b.getMovieId());
		b.setMovieId(20);
		assertEquals(20, b.getMovieId());
	}
	
	@Test
	public void getNameTest() {
		assertEquals("Booking", b.getName());
	}
	
	@Test
	public void getStartTimeIdTest() {
		b.setStartTime("8,45");
		assertEquals(8, b.getStartTimeId());
	}

}
