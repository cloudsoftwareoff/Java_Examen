package com.exam.ex1;

import com.exam.ex1.EnterpriseId;
import com.exam.ex1.PersonneId;

public class TestProbleme {
public static void main(String[] args) {

PersonneId p1=new PersonneId("Vitoria","Justice");
PersonneId p2=new PersonneId("Mark","zuckerberg");
PersonneId p3=new PersonneId("Mark","zuckerberg");

EnterpriseId e1=new EnterpriseId("Nickelodeon",p1);

EnterpriseId e3=new EnterpriseId("Nickelodeon",p1);

EnterpriseId e2=new EnterpriseId("Facebook",p2);

//Output : True 
System.out.println(e1.equals(e3));
//Output : False
System.out.println(e1.equals(e2));
//Output : Falae
System.out.println(p1.equals(p2));
//Output : True
System.out.println(p2.equals(p3));


  }

}
