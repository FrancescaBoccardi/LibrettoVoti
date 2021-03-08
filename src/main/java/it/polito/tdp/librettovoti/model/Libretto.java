package it.polito.tdp.librettovoti.model;

import java.util.*;

public class Libretto {
	
	private List<Voto> voti; //generico 
	
	public Libretto() {
		voti = new ArrayList<Voto>(); //quando inizializzo devo scegliere l'oggetto specifico
	}
	
	public void add(Voto v) {
		voti.add(v);
	}

	/*
	public String votiUguali(int punteggio) {
		//calcola una stringa che contiene i voti
		//sarà poi il chiamante a stamparli
	}
	
	public List<Voto> listaVotiUguali(int punteggio){
		List<Voto> risultato = new ArrayList<>();
		for(Voto v : this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
	}
	*/
	
	
	public Libretto votiUguali(int punteggio) {
		Libretto risultato = new Libretto();
		for(Voto v : this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
	}

	public String toString() {
		String s = "";
		for(Voto v : this.voti) {
			s += v.toString()+"\n";
		}
		return s;
	}
	
	
}
