package com.fst.challenge.beans;
	import java.text.*;
	import java.util.*;
	
	
	
	
/**
 * 
 * Classe pour l'enregistrement des historiques
 * 
 * enregistrement des historiques 
 * 
 * */
	
	
	
	
	
	
	public class Historique {

	
public Historique() {
		// TODO Auto-generated constructor stub
	}
	


/*Methode pour l'enregistrement des historiques dans la table HISTORIQUE*/
	
public boolean enregistrer(Connecteur sql,String id_equipe, String id_challenge){
	
	Date date = new Date();
	SimpleDateFormat sdf;
	sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String d=sdf.format(date);
	
	if(sql.update("INSERT INTO HISTORIQUE VALUES('"+id_challenge+"','"+id_equipe+"','"+d+"')"))
		
		return true;
	return false;
	
	
	
}

}
