package Base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
    private String name; // Nombre de la pizza
    private double price; // Precio base de la pizza
    private String size; // Tamaño de la pizza (Pequeña, Mediana, Grande)
    private List<Topping> toppings = new ArrayList<>(); // Lista de ingredientes (toppings)

    // Constructor de la clase Pizza
    public Pizza(String name, double price, String size, Topping... toppings) {
        this.name = name;
        this.size = size;
        for (Topping topping : toppings) {
            this.toppings.add(topping);
            this.price += topping.getPrecio(); // Sumar el precio del topping al precio base
        }

        if (!size.equalsIgnoreCase("Pequeña")) { // Verificar si el tamaño no es "Pequeña"
            this.price = calculatePrice(this.price, size);
        }
    }

    // Método privado para calcular el precio de la pizza según el tamaño
    private double calculatePrice(double basePrice, String size) {
        double multiplier;
        switch (size.toLowerCase()) {
            case "mediana":
                multiplier = 1.20;
                break;
            case "grande":
                multiplier = 1.35;
                break;
            default:
                multiplier = 1.0; // Por defecto: Pequeña
        }
        return basePrice * multiplier;
    }

    // Método para agregar un topping a la pizza
    public void addTopping(Topping topping) {
        this.toppings.add(topping);
        this.price += topping.getPrecio(); // Sumar el precio del topping al precio base
    }

    // Método para eliminar un topping de la pizza por índice
    public void removeTopping(int index) {
        Topping removedTopping = this.toppings.remove(index);
        this.price -= removedTopping.getPrecio(); // Restar el precio del topping eliminado
    }

    // Método para obtener la lista de toppings (ingredientes)
    public List<Topping> getToppings() {
        return Collections.unmodifiableList(new ArrayList<>(toppings));
    }

    // Getter para obtener el nombre de la pizza
    public String getName() {
        return name;
    }

    // Getter para obtener el precio total de la pizza
    public double getPrice() {
        return price;
    }

    // Getter para obtener el tamaño de la pizza
    public String getSize() {
        return size;
    }

    // Setter para establecer el tamaño de la pizza
    public void setSize(String size) {
        this.size = size;
        if (!size.equalsIgnoreCase("Pequeña")) { // Verificar si el tamaño no es "Pequeña"
            this.price = calculatePrice(this.price, size);
        }
    }

    // Método para preparar la pizza
    public void prepare() {
        System.out.println("Preparando..... " + name);
        System.out.println("Tamaño: " + size);
        System.out.println("Agregando Toppings:");
        double total = 0;
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre() + "   Precio: " + topping.getPrecio());
            total = total + topping.getPrecio();
            // Pausa de 1 segundo
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        total = total + price;
        System.out.println("La Pizza esta Lista!!!!" + "\nTotal a pagar: " + total);
    }

    // Método toString para representar la pizza como cadena de texto
    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
