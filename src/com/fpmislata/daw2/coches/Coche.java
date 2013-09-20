package com.fpmislata.daw2.coches;


public class Coche {
 
  //Propiedades siempre privadas
    private String modelo;
    private Marca marca;
    private int cilindrada;
    private String DniPropietario;
    
    
 //Constructor
 public Coche (String modelo, Marca marca, int cilindrada, String DniPropietario){
         this.modelo=modelo;
         this.marca=marca;
         this.cilindrada=cilindrada;
         this.DniPropietario=DniPropietario;
 }      

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.modelo = Modelo;
    }

    /**
     * @return the marca
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    /**
     * @return the cilindrada
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * @param cilindrada the cilindrada to set
     */
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    /**
     * @return the DniPropietario
     */
    public String getDniPropietario() {
        return DniPropietario;
    }

    /**
     * @param DniPropietario the DniPropietario to set
     */
    public void setDniPropietario(String DniPropietario) {
        this.DniPropietario = DniPropietario;
    }
     
    

}
