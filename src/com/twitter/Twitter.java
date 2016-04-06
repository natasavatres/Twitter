package com.twitter;

import java.util.LinkedList;
import com.twitter.poruke.TwitterPoruka;

/**
 * public klasa Twitter
 * 
 * @author Natasa Vatres
 */

public class Twitter {

	/**
	 * privatni atribut LinkedLista poruka na Twitteru
	 */
	private LinkedList<TwitterPoruka> poruke = new LinkedList<TwitterPoruka>();

	/**
	 * public metoda vratiSvePoruke() koja vraca sve poruke na Twitteru
	 * 
	 * @return metoda vraca listu svih poruka
	 */
	public LinkedList<TwitterPoruka> vratiSvePoruke() {
		return poruke;
	}

	/**
	 * public metoda unesi() koja kreira objekat TwitterPoruka i dodaje na kraj
	 * liste poruka na Twitteru
	 * 
	 * @param korisnik
	 *            ime usera na Twitteru
	 * @param poruka
	 *            tekst koji se objavljuje na Twitter
	 */
	public void unesi(String korisnik, String poruka) {

		TwitterPoruka tp = new TwitterPoruka();
		tp.setKorisnik(korisnik);
		tp.setPoruka(poruka);

		poruke.addLast(tp);
	}

	/**
	 * public metoda vratiPoruke() koja vraca sve poruke sa odredjenim tagom
	 * 
	 * @param tag
	 *            rec koja predstavlja filter za pretragu
	 * @param maxBroj
	 *            najveci broj poruka sa trazenim tagom
	 * @return TwitterPoruka[]
	 * @throws RuntimeException
	 *             metoda baca izuzetak ako je uneti tag null ili prazan String
	 */
	public TwitterPoruka[] vratiPoruke(int maxBroj, String tag) {
		if (tag == null || tag == "")
			throw new RuntimeException("Morate uneti tag");

		if (maxBroj <= 0)
			maxBroj = 100;

		int brojac = 0;

		TwitterPoruka[] rezultat = new TwitterPoruka[maxBroj];

		for (int i = 0; i < poruke.size(); i++)
			if (poruke.get(i).getPoruka().indexOf(tag) != -1)
				if (brojac < maxBroj) {
					rezultat[brojac + 1] = poruke.get(i);
					brojac++;
				} else
					break;
		return rezultat;
	}

}