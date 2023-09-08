import Base.Pizza;
import Base.Topping;
import Especialidades.*;
import Interfaces.PizzaBase;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la Pizzería");

        // Solicitar al usuario elegir el tamaño de la pizza
        System.out.println("Por favor, elige el tamaño de la pizza (Pequeña, Mediana, Grande):");
        String size = scanner.nextLine();

        // Mostrar opciones de pizza
        System.out.println("Elige una pizza:");
        System.out.println("1. Pizza Margherita");
        System.out.println("2. Pizza Hawaiana");
        System.out.println("3. Pizza Vegetariana");
        System.out.println("4. Pizza de Pollo BBQ");
        System.out.println("5. Pizza de Pesto");

        // Leer la elección del usuario
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente

        Pizza selectedPizza = null;

        // Crear la pizza seleccionada según la elección del usuario
        switch (choice) {
            case 1:
                selectedPizza = new Pizza("Pizza Margherita", 10.99, size,
                        new Topping("Tomato", 1.0),
                        new Topping("Mozzarella", 1.5),
                        new Topping("Basil", 0.75));
                break;
            case 2:
                selectedPizza = new PizzaHawaiana(size);
                break;
            case 3:
                selectedPizza = new PizzaVegetariana(size);
                break;
            case 4:
                selectedPizza = new PizzaPolloBBQ(size);
                break;
            case 5:
                selectedPizza = new PizzaPesto(size);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        // Preparar y mostrar la pizza seleccionada
        if (selectedPizza != null) {
            selectedPizza.prepare();
        }

        scanner.close();
    }
}
