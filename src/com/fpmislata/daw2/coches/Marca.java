package com.fpmislata.daw2.coches;

public enum Marca {
    Seat,Renault,Ford,Citroen;
    
    private String Marca;
    
    public String getMarca(){      
        return Marca;
    }

    public void setNombre(String marca){
       Marca=marca;
    }
    
}
