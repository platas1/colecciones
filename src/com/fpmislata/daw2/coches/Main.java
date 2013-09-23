// Utilizaremos en redmine y en la documentación la Sintaxis de markdown para los readme (.md)

package com.fpmislata.daw2.coches;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    
    public static Scanner stdin = new Scanner(System.in);

   
   public static void main(String[] args){
    
        Coche Coche1 = new Coche("Leon",Marca.Seat,1800,"44867353g");
        Coche Coche2 = new Coche("Megane",Marca.Renault,1200,"12345678z");
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
   

Map<String,Coche> mapCoches=new HashMap<String,Coche>();

mapCoches.put(Coche1.getDniPropietario(),Coche1);
mapCoches.put(Coche2.getDniPropietario(),Coche2);
mapCoches.put(Coche3.getDniPropietario(),Coche3);
mapCoches.put(Coche4.getDniPropietario(),Coche4);
mapCoches.put(Coche5.getDniPropietario(),Coche5);
  

Coche cocheBuscado=mapCoches.get("12345678z");
System.out.println(cocheBuscado.getModelo());
System.out.println(cocheBuscado.getDniPropietario());
System.out.println(cocheBuscado.getCilindrada());
System.out.println(cocheBuscado.getMarca());

for(String Coche:coches){    
Coche coche=mapCoches.get(DniPropietario);

System.out.println(""+coche.getMarca());
}





// Listas dentro de clases 

             Persona persona1 = new Persona("Pepe","Garcia","448678452G");    // Creo el objeto persona
 
             //Persona1 es de tipo Persona donde esta creado un arrayList de coches con sus correspondientes elementos
             
             Coche Coche6 = new Coche("MondeoPersona",Marca.Ford,2100,"33867353g"); // Creo el objeto coche6
             Coche Coche7 = new Coche("MondeoPersonita",Marca.Ford,2100,"22867353g"); // Creo el objeto coche7

             Coche6.setPropietario(persona1); //La propiedad persona de propietario apunta a la clasepersona
                                              //donde se guardan todos los datos pertinentes.
             Coche7.setPropietario(persona1); // Idem de lo anterior el coche7 tendra el mismo propietario
               
             List<Coche> cochesLista=persona1.getCoches();                       
             cochesLista.add(Coche6);
             cochesLista.add(Coche7);               

             persona1.setCoches(coches);


    }
   
}
