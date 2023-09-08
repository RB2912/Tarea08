package Especialidades;
import Base.Pizza;
import Base.Topping;

public class PizzaHawaiana extends Pizza {
    public PizzaHawaiana(String size) {
        super("Pizza Hawaiana", 12.99, size,
                new Topping("Ham", 2.0),
                new Topping("Pineapple", 1.5));
    }
}


