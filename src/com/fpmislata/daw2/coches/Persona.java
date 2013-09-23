package com.fpmislata.daw2.coches;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    
    //Propiedades siempre privadas
    private String Nombre;
    private String Apellido1;
    //private Sexo sexo;
    private String DNI;
    private String NombreCompleto;
    
    // Añado lista de coches que me servira luego para acceder a el
    private List<Coche> coches=new ArrayList();  //coches apunta a un arrayList
   
    
    //Constructor
 public Persona (String nombre, String apellido1,/* Sexo sexo,*/ String dni){
         this.Nombre=nombre;
         this.Apellido1=apellido1;
      //   this.sexo=sexo;
         this.DNI=dni;
  }  
    
  
 //Metodos accesores
 
    public String getNombre(){      
        return Nombre;
    }

    public void setNombre(String nombre){
       Nombre=nombre;
    }
    
    public String getApellido1(){      
        return Apellido1;
    }

    public void setApellido1(String apellido1){
       Apellido1=apellido1; //this.nombre(propiedad privada)=nombre(parametro);
    }


    /*public Sexo getSexo() {
        return sexo;
    }

      public void setSexo(Sexo sexo) {
        this.sexo = sexo;
      }*/
      
      
   public String getNombreCompleto(){      
        return Nombre+" "+Apellido1;
    }
   
     public void setNombreCompleto(String NombreCompleto){      
        this.NombreCompleto= NombreCompleto;        
    }
    
    //Metodos accesores
    public String getDNI(){      
        return DNI;
    }

    public void setDNI(String dni){
       DNI=dni;
    }

    
    //Metodos accesores de Coches
    /**
     * @return the coches
     */
    public List<Coche> getCoches() {
        return coches;
    }

    /**
     * @param coches the coches to set
     */
    public void setCoches(List<Coche> coches) {
        this.coches = coches;
    }
    
    
}