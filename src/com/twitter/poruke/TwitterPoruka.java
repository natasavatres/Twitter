package com.twitter.poruke;

/**
 * public klasa TwitterPoruka koja predstavlja poruke na Twitteru
 * 
 * @author Natasa Vatres
 */

public class TwitterPoruka {

	/** privatni atribut korisnik koji prestavlja ime korisnika na Twitteru */
	private String korisnik;
	/**
	 * privatni atribut poruka koji predstavlja poruku koju ce korisnik objaviti
	 * na Twitteru
	 */
	private String poruka;

	/**
	 * public metoda getKorisnik koja vraca ime korisnika
	 * 
	 * @return korisnik
	 */
	public String getKorisnik() {
		return korisnik;
	}

	/**
	 * public metoda setKorisnik koja dodeljuje ime korisniku
	 * 
	 * @param korisnik
	 *            zeljeno ime korisnika
	 * @throws RuntimeException
	 *             metoda baca izuzetak ako je uneto ime korisnika null ili
	 *             prazan String
	 */
	public void setKorisnik(String korisnik) {
		if (korisnik == null || korisnik == "")
			throw new RuntimeException("Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}

	/**
	 * public metoda getPoruka koja vraca poruku korisnika na Twitteru
	 * 
	 * @return poruka
	 */
	public String getPoruka() {
		return poruka;
	}

	/**
	 * public metoda setPoruka koja kreira poruku
	 * 
	 * @param poruka
	 *            tekst koji postavlja korisnik Twittera
	 * @throws RuntimeException
	 *             metoda baca izuzetak ako je poruka null, prazan String ili
	 *             duza od 140 karaktera
	 */
	public void setPoruka(String poruka) {
		if (poruka == null || poruka.length() > 140 || poruka == "")
			throw new RuntimeException("Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}

	/**
	 * redefinisana toString metoda koja ispisuje ime korisnika i njegovu poruku
	 * 
	 * @return korisnik poruka
	 */
	public String toString() {
		return "KORISNIK:" + korisnik + " PORUKA:" + poruka;
	}
}
