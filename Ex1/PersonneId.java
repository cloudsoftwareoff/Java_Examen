package com.exam.ex1;

public class PersonneId implements Identitie{
private String nom;
private String prenom;
public PersonneId(String nom,String prenom){
  this.nom=nom;
  this.prenom=prenom;
}
public PersonneId(){}
public String toString(){
  return nom+prenom;
}
public boolean equals(PersonneId x){
  return x.nom==nom && x.prenom==prenom;
}
}
