import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean condicion = true;
        int menu = 0;
        Scanner sc = new Scanner(System.in);
        while (condicion == true) {

            System.out.println("1. Crear nueva nave");

            System.out.println("2. Mostrar Ascii de la nave");

            System.out.println("3. Acelerar nave");

            System.out.println("4. Frenar nave");

            System.out.println("5. Parar nave");

            System.out.println("Q:. Salir del menú");

            switch (menu) {
                case 1:

                    SpaceShip nave = new SpaceShip();

                    String nombreNave;


                    System.out.println("Por favor introduce el nombre de la nave");

                    nombreNave = sc.nextLine();

                    String matriculaNave;

                    System.out.println("Por favor introduce la matrícula de la nave");

                    matriculaNave = sc.nextLine();

                    int aceleracion;

                    System.out.println("Por favor introduce la aceleración de la nave");

                    aceleracion = sc.nextInt();

                    float velocidadX;

                    System.out.println("Por favor introduce la velocidadX de la nave");

                    velocidadX = sc.nextFloat();

                    float coordenadaX;

                    System.out.println("Por favor introduce la coordenadaX de la nave");

                    coordenadaX = sc.nextFloat();

                    float direccionX;

                    System.out.println("Por favor introduce la direccionX de la nave");

                    direccionX = sc.nextFloat();

                    // Creamos la nave

                    nave = new SpaceShip(nombreNave, matriculaNave, aceleracion, velocidadX, coordenadaX, direccionX);

                    break;
            }

        }
    }
}
