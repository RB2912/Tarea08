package Interfaces;

import Base.Pizza;

public class PizzaBase implements IPreparable{    private String nombre;
    private double precio;
    public PizzaBase
            (String n, double p){
        this.nombre = n;
        this.precio = p;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override    public void prepare(){
        System.out.println("Preparando la pizza....");        System.out.println("La pizza esta lista!!!");
    }
}

