package org.javaee7.movieplex7.client;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MovieBackingBeanTest {
	MovieBackingBean m;

	@Before
	public void setUp() throws Exception {
		m = new MovieBackingBean();
	}

	@After
	public void tearDown() throws Exception {
		m = null;
	}

	@Test
	public void setMovieIdTest() {
		m.setMovieId(10);
		assertEquals(10, m.getMovieId());
	}
	
	@Test
	public void getMovieIdTest() {
		m.setMovieId(10);
		assertEquals(10, m.getMovieId());
		m.setMovieId(20);
		assertEquals(20, m.getMovieId());
	}
	
	@Test
	public void setMovieNameTest() {
		m.setMovieName("Terminator");
		assertEquals("Terminator", m.getMovieName());
	}
	
	@Test
	public void getMovieNameTest() {
		m.setMovieName("Terminator");
		assertEquals("Terminator", m.getMovieName());
		m.setMovieName("Vacation");
		assertEquals("Vacation", m.getMovieName());
	}

}
