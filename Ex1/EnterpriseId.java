package com.exam.ex1;

import com.exam.ex1.PersonneId;


public class EnterpriseId implements Identitie{

private String nom;
//resp
private PersonneId resp=new PersonneId();


public EnterpriseId(String nom,PersonneId id){
 this.nom=nom;
 resp=id;   
  
}
public String toString(){
  return this.nom;
}
public boolean equals(EnterpriseId ep){
  return ep.nom==this.nom;
}
}
