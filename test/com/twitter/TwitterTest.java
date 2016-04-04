/**
 * 
 */
package com.twitter;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.poruke.TwitterPoruka;

/**
 * @author Natasa Vatres
 *
 */
public class TwitterTest {

	/**
	 * @throws java.lang.Exception
	 */

	Twitter tvittvit;

	@Before
	public void setUp() throws Exception {
		tvittvit = new Twitter();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		tvittvit = null;
	}

	@Test
	public void testVratiSvePoruke() {
		tvittvit.vratiSvePoruke();
	}

	@Test
	public void testUnesi() {

		tvittvit.unesi("Fonovac", "efikasnost efektivnost departmentalizacija");

		TwitterPoruka tvit = new TwitterPoruka();
		tvit.setKorisnik("Fonovac");
		tvit.setPoruka("efikasnost efektivnost departmentalizacija");

		assertEquals(tvit.toString(), tvittvit.vratiSvePoruke().getLast().toString());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testUnesiNull() {
		tvittvit.unesi(null, null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testUnesiPrazanString() {
		tvittvit.unesi("", "");
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testUnesiPreduguPoruku() {
		String tvit = "";
		for (int i = 0; i < 100; i++) {
			tvit += " daj pare ";
		}
		tvittvit.unesi("FON", tvit);
	}

	@Test
	public void testVratiPoruke() {
		tvittvit.vratiPoruke(10, "fonbg");
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testVratiPorukeTagNull() {
		tvittvit.vratiPoruke(10, null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testVratiPorukeTagPrazanString() {
		tvittvit.vratiPoruke(10, "");
	}

}
