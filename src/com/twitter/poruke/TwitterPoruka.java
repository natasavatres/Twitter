package com.twitter.poruke;

public class TwitterPoruka {

	/** privatni atribut korisnik koji cuva String username-a korisnika */
	private String korisnik;
	/**
	 * privatni atribut poruka koji cuva String sa porukom koju postavlja
	 * korisnik
	 */
	private String poruka;

	/** get() metoda za privatni atribut korisnik */
	public String getKorisnik() {
		return korisnik;
	}

	/** set() metoda za privatni atribut korisnik */
	public void setKorisnik(String korisnik) {
		if (korisnik == null || korisnik == "")
			throw new RuntimeException("Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}

	/** get() metoda za privatni atribut poruka */
	public String getPoruka() {
		return poruka;
	}

	/** set() metoda za privatni atribut poruka */
	public void setPoruka(String poruka) {
		if (poruka == null || poruka.length() > 140 || poruka=="")
			throw new RuntimeException("Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}

	/**
	 * redefinisana toString() metoda koja ispisuje ime korisnika i njegovu
	 * poruku
	 */
	public String toString() {
		return "KORISNIK:" + korisnik + " PORUKA:" + poruka;
	}
}
