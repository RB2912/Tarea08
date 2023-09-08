package Especialidades;
import Base.Pizza;
import Base.Topping;

public class PizzaVegetariana extends Pizza {
    public PizzaVegetariana(String size) {
        super("Pizza Vegetariana", 11.99, size,
                new Topping("Bell Peppers", 1.0),
                new Topping("Mushrooms", 1.5),
                new Topping("Olives", 1.0));
    }

}
