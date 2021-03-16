package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class TestLibretto {
	
	public static void main(String[] args) {
	
		System.out.println("Test metodi di Libretto");
		Libretto libretto = new Libretto();
	
		Voto voto1 = new Voto("Analisi 1", 30, LocalDate.of(2019, 2, 15));
		
		libretto.add(voto1);
		libretto.add(new Voto ("Chimica", 25, LocalDate.of(2019, 9, 15)));
		libretto.add(new Voto ("Fisica 1", 28, LocalDate.of(2019, 7, 15)));
		libretto.add(new Voto ("Informatica", 24, LocalDate.of(2019, 9, 15)));
		
		System.out.println(libretto);
		
		//List<Voto> venticinque = libretto.listaVotiUguali(25);
		
		Libretto librettoVenticinque = libretto.votiUguali(25);
		System.out.println(librettoVenticinque);
		
		Voto analisi = libretto.ricercaCorso("Analisi 1");
		System.out.println(analisi);
		Voto analisi3 = libretto.ricercaCorso("Analisi 3");
		System.out.println(analisi3);
		
		Voto chimica = libretto.ricercaCorso("Chimica");
		Voto chimicaDoppio = new Voto ("Chimica", 25, LocalDate.of(2019, 9, 15));
		Voto chimicaConflitto = new Voto ("Chimica", 29, LocalDate.of(2019, 9, 15));
		
		System.out.println(chimica+" doppione di "+ chimicaDoppio+"? -->"+
				libretto.esisteDuplicato(chimicaDoppio));
		System.out.println(chimica+" doppione di "+ chimicaConflitto+"? -->"+
				libretto.esisteDuplicato(chimicaConflitto));
		System.out.println(chimica+" conflitto di "+ chimicaDoppio+"? -->"+
				libretto.esisteConflitto(chimicaDoppio));
		System.out.println(chimica+" conflitto di "+ chimicaConflitto+"? -->"+
				libretto.esisteConflitto(chimicaConflitto));
	}
	
}
