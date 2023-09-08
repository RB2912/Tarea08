package Especialidades;
import Base.Pizza;
import Base.Topping;

public class PizzaPesto extends Pizza {
    public PizzaPesto(String size) {
        super("Pizza de Pesto", 14.99, size,
                new Topping("Pesto", 2.0),
                new Topping("Tomates Cherry", 1.5),
                new Topping("Queso Parmesano", 1.0));
    }


}
