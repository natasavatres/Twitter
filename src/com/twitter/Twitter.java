package com.twitter;

import java.util.LinkedList;
import com.twitter.poruke.TwitterPoruka;

public class Twitter {

	/**
	 * privatni atribut LinkedLista poruka na Twitteru
	 */
	private LinkedList<TwitterPoruka> poruke = new LinkedList<TwitterPoruka>();

	/**
	 * public metoda vratiSvePoruke()
	 * 
	 * @return metoda vraca listu svih poruka na Twitteru
	 */
	public LinkedList<TwitterPoruka> vratiSvePoruke() {
		return poruke;
	}

	/**
	 * public metoda unesi()
	 * 
	 * @param korisnik
	 *            ime korisnika
	 * @param poruka
	 *            tekst koji korisnik objavljuje na Twitteru
	 */
	public void unesi(String korisnik, String poruka) {

		TwitterPoruka tp = new TwitterPoruka();
		tp.setKorisnik(korisnik);
		tp.setPoruka(poruka);

		poruke.addLast(tp);
	}

	/**
	 * public metoda vratiPoruke()
	 * 
	 * @param maxBroj
	 *            najveci broj poruka sa odredjenim tagom
	 * @param tag
	 *            trazeni tag
	 * @return niz poruka sa odredjenim tagom
	 * @throws RuntimeException
	 *             metoda baca exception
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