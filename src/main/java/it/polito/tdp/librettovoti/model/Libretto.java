package it.polito.tdp.librettovoti.model;

import java.util.*;

public class Libretto {
	
	private List<Voto> voti; //generico 
	private Map<String, Voto> votiMap; //identity map: nome esame --> oggetto Voto
	
	public Libretto() {
		voti = new ArrayList<Voto>(); //quando inizializzo devo scegliere l'oggetto specifico
		this.votiMap = new HashMap<>();
	}
	
	public void add(Voto v) {
		voti.add(v);
		this.votiMap.put(v.getNome(), v);
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
	
	/**
	 * Ricerca un voto del corso di cui è specificato il nome.
	 * Se il corso non esiste, restituisce null.
	 * @param nomeCorso
	 * @return
	 */
	
	
	public Voto ricercaCorso(String nomeCorso) {
//		Voto risultato = null;
//		for(Voto v : voti) {
//			if(v.getNome().equals(nomeCorso)){
//				risultato = v;
//				break;
//			}
//		}
//		return risultato;
		
		return this.votiMap.get(nomeCorso);
	}
	
	/**
	 * Verifica se nel libretto c'è già un voto con lo stesso esame e la stessa votazione
	 * @param v
	 * @return
	 */
	
	public boolean esisteDuplicato(Voto v) {
//		boolean trovato = false;
//		
//		for(Voto voto : this.voti) {
//			if(voto.getNome().equals(v.getNome()) && voto.getVoto() == v.getVoto()) {
//				trovato = true;
//				break;
//			}
//		}
//		
//		return trovato;
		
		Voto trovato = this.votiMap.get(v.getNome());
		if(trovato == null) {
			return false;
		}
		
		if(trovato.getVoto() == v.getVoto()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Verifica se nel libretto c'è già un voto con lo stesso esame ma votazione diversa
	 * @param v
	 * @return
	 */
	
	public boolean esisteConflitto(Voto v) {
//	boolean trovato = false;
//		
//		for(Voto voto : this.voti) {
//			if(voto.getNome().equals(v.getNome()) && voto.getVoto() != v.getVoto()) {
//				trovato = true;
//				break;
//			}
//		}
//		
//		return trovato;
		
		Voto trovato = this.votiMap.get(v.getNome());
		if(trovato == null) {
			return false;
		}
		
		if(trovato.getVoto() != v.getVoto()) {
			return true;
		}
		else {
			return false;
		}
	}

	public String toString() {
		String s = "";
		for(Voto v : this.voti) {
			s += v.toString()+"\n";
		}
		return s;
	}
	
	
}
