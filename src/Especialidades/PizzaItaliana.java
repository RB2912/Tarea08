package Especialidades;
import Base.Pizza;
import Base.Topping;

import java.util.Arrays;

public class PizzaItaliana extends Pizza {
    private String salsa;

    public  PizzaItaliana(String name, double price, String salsa, Topping... toppings){
        super(name, price, Arrays.toString(toppings));
        this.salsa=salsa;

    }


    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }
}
