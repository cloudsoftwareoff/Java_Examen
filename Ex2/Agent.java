package com.ex2cheat;

public class Agent extends Employee{
private int nbhour;
private double indice;
public void Agent(int nbhour,double indice){
  this.nbhour=nbhour;
  this.indice=indice;
}
public double getSalaire(){
  return nbhour*indice;
}

}
