import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SpaceShip nave = new SpaceShip();

        boolean condicion = true;
        Scanner sc = new Scanner(System.in);
        String menu;

        while (condicion) {

            System.out.println("Q. Para salir del simulador");

            System.out.println("1. Crear nave");

            System.out.println("2. Mostrar asciiArt de la nave");

            System.out.println("3. Acelerar nave");

            System.out.println("4. Frenar nave");

            System.out.println("5. Parar nave");

            menu = sc.nextLine();

            switch (menu) {

                case  "Q":
                    System.out.println("Has salido del simulador");
                    condicion = false;
                    break;

                case "1":

                    String nombreNave;

                    System.out.println("Introduce el nombre de la nave");

                    nombreNave = sc.nextLine();

                    String matriculaNave;

                    System.out.println("Introduce la matricula de la nave");

                    matriculaNave = sc.nextLine();

                    float velocidadX;

                    System.out.println("Introduce la velocidadX de la nave");

                    velocidadX = sc.nextFloat();

                    float coordenadaX;

                    System.out.println("Introduce la coordenadaX de la nave");

                    coordenadaX = sc.nextFloat();

                    float direccionX;

                    System.out.println("Introduce la direccionX de la nave");

                    direccionX = sc.nextFloat();



                    break;
            }

        }

    }
}
