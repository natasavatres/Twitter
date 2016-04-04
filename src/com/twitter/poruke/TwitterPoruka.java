package com.twitter.poruke;

public class TwitterPoruka {

	/** @param korisnik cuva String imena korisnika */
	private String korisnik;
	/**
	 * @param poruka cuva String sa porukom koju postavlja korisnik
	 */
	private String poruka;

	/** @return get metoda koja vraca korisnika */
	public String getKorisnik() {
		return korisnik;
	}

	/** public metoda setKorisnik koja dodeljuje ime korisniku
	 * @param korisnik zeljeno ime korisnika */
	public void setKorisnik(String korisnik) {
		if (korisnik == null || korisnik == "")
			throw new RuntimeException("Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}

	/** @return get metoda koja vraca poruku korisnika Twittera */
	public String getPoruka() {
		return poruka;
	}

	/** public metoda setPoruka koja kreira poruku 
	 * @param poruka tekst koji postavlja korisnik Twittera*/
	public void setPoruka(String poruka) {
		if (poruka == null || poruka.length() > 140 || poruka=="")
			throw new RuntimeException("Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}

	/**
	 * redefinisana toString metoda 
	 * @return ispisuje ime korisnika i njegovu poruku
	 */
	public String toString() {
		return "KORISNIK:" + korisnik + " PORUKA:" + poruka;
	}
}
