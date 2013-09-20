package com.fpmislata.daw2.coches;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static Scanner stdin = new Scanner(System.in);

   
   public static void main(String[] args){
    
        Coche Coche1 = new Coche("Leon",Marca.Seat,1800,"44867353g");
        Coche Coche2 = new Coche("Megane",Marca.Renault,1200,"98727353g");
        Coche Coche3 = new Coche("Fiesta",Marca.Ford,1100,"351867353g");
        Coche Coche4 = new Coche("Saxo",Marca.Citroen,1900,"21867353g");
        Coche Coche5 = new Coche("Mondeo",Marca.Ford,2100,"11867353g");
        
        
   List<Coche> coches=new ArrayList<>();
  
   coches.add(Coche1);
   coches.add(Coche2);
   coches.add(Coche3);
   coches.add(Coche4);
   coches.add(Coche5);
   
   System.out.println("El coche número 2 es: "+coches.get(2));
        
  for(Coche coche:coches){ 
       System.out.println(coche.getModelo()); 
             
       System.out.println(coche.getMarca());
        
   }
  
//String dnipersona="44867353g";
  System.out.println("Introduce DNI:");
  String dnipersona=stdin.nextLine();

for(Coche coche:coches){
    
    if (dnipersona.equals(coche.getDniPropietario())) // if (coche.getMarca()==Marca.Ford)

       System.out.println("DNI encontrado:"+coche.getModelo()+coche.getMarca());
 
    else
        System.out.println("Persona no encontrada.");
}
   
Marca compruebaMarca=Marca.Ford; 

for(Coche coche:coches){
    
    if (compruebaMarca.equals(coche.getMarca()))

       System.out.println("Coches de la marca Ford:"+coche.getModelo());
 
    else
        System.out.println("No hay coches de esa marca.");
}
   
  
    }
   
}
