package principal;

import modelo.Cocina;
import modelo.Refrigerador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear objetos
        Cocina cocina = new Cocina(500.0, 10, 4, true);
        Refrigerador refrigerador = new Refrigerador(800.0, 5, 'A', 2);

        System.out.println("Bienvenido a la tienda, ¿qué desea comprar?");
        System.out.println("1. Cocina");
        System.out.println("2. Refrigerador");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("¿Desea incluir gas con su cocina? (1: Sí, 2: No)");
                int incluirGas = sc.nextInt();
                if (incluirGas == 1) {
                    cocina.setCantidadDisponible(cocina.getCantidadDisponible() - 1);
                    System.out.println("Cocina comprada con gas. Precio: " + cocina.getPrecio());
                } else {
                    System.out.println("Compra cancelada.");
                }
                break;
            case 2:
                System.out.println("Refrigerador comprado. Precio: " + refrigerador.getPrecio());
                refrigerador.setCantidadDisponible(refrigerador.getCantidadDisponible() - 1);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        sc.close();
    }
}
