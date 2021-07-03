package com.ex2cheat;

public class Echelon {
final int ASSISTANT=1;
final int CHEF_DE_SERVICE=2;
final int  CHEF_DE_CLINIQUE=3;
public int getSalaire(int echelon){
  int x=0;
  switch (echelon){
    
    case 1:x= 1000; break;
    case 2: x=1500; break;
    case 3: x= 2000;break;
  //  default: return 0;
  }
  return x;
}
}
