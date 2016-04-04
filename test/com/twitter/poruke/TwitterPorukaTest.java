/**
 * 
 */
package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Natasa Vatres
 *
 */

public class TwitterPorukaTest {

	/**
	 * @throws java.lang.Exception
	 */

	private TwitterPoruka tp;

	@Before
	public void setUp() throws Exception {
		tp = new TwitterPoruka();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		tp = null;
	}

	/**
	 * Test method for
	 * {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	@Test
	public void testSetKorisnik() {

		tp.setKorisnik("Tviteras");
		assertEquals("Tviteras", tp.getKorisnik());

	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikNull() {
		tp.setKorisnik(null);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikPrazanString() {
		tp.setKorisnik("");
	}

	/**
	 * Test method for
	 * {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test
	public void testSetPoruka() {
		tp.setPoruka("porucicicica");
		assertEquals("porucicicica", tp.getPoruka());
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaNull() {
		tp.setPoruka(null);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaPrazanString() {
		tp.setPoruka("");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaPreduga() {
		tp.setPoruka("                                                                "
				+ "                                                                "
				+ "                                                                "
				+ "                                                                "
				+ "                                                                "
				+ "                                                                ");
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#toString()}.
	 */
	@Test
	public void testToString() {
		tp.setKorisnik("Tviteras");
 		tp.setPoruka("Sad ce kolokvijumi #depresija");
 		assertEquals("KORISNIK:" + "Tviteras" + " PORUKA:" + "Sad ce kolokvijumi #depresija", tp.toString());
	}

}
