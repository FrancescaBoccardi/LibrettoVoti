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


	public String toString() {
		String s = "";
		for(Voto v : this.voti) {
			s += v.toString()+"\n";
		}
		return s;
	}
	
	
}
