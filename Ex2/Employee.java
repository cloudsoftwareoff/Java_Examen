package com.ex2cheat;

public abstract class Employee {
protected int numEmployee;
protected String nom;
public void Employee (int numEmployee,String nom){
  this.numEmployee=numEmployee;
  this.nom=nom;
  
  
}
public String ResumePaye(){
  
   return String.valueOf(this.numEmployee)+nom+String.valueOf(getSalaire());
}
public abstract double getSalaire();
}
