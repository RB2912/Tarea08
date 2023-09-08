package Especialidades;
import Base.Pizza;
import Base.Topping;

public class PizzaPolloBBQ extends Pizza {
    public PizzaPolloBBQ(String size) {
        super("Pizza de Pollo BBQ", 13.99, size,
                new Topping("Pollo BBQ", 2.5),
                new Topping("Cebolla Roja", 1.0),
                new Topping("Salsa Barbacoa", 1.0));
    }

    @Override
    public void prepare() {
        System.out.println("Preparando Pizza de Pollo BBQ...");
        System.out.println("Tamaño: " + getSize());
        System.out.println("Agregando Toppings: Pollo BBQ, Cebolla Roja, Salsa Barbacoa");
        super.prepare(); // Call the base class prepare method
    }
}
