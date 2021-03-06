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

                    nave.setVelocidadX(velocidadX);

                    float coordenadaX;

                    System.out.println("Introduce la coordenadaX de la nave");

                    coordenadaX = sc.nextFloat();

                    float direccionX;

                    System.out.println("Introduce la direccionX de la nave");

                    direccionX = sc.nextFloat();

                    sc.nextLine();

                    break;
                case "2":

                    System.out.println("\n");
                    System.out.println(nave.toString());

                    break;

                case "3":

                    System.out.println("\n");
                    System.out.println("Velocidad actual de la nave: " + nave.getVelocidadX());

                    int aceleracion;

                    System.out.println("Introduce la velocidadX de la nave ");

                    aceleracion = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Se va a acelerar la nave...");

                    nave.speedUp(aceleracion);

                    System.out.println("La nueva velocidadX de la nave es: " + nave.getVelocidadX());


                    break;

                case "4":

                    System.out.println("\nSe va a disminuir la velocidad de la nave \n");

                    System.out.println("\nLa velocidadX actual de la nave es: " + nave.getVelocidadX() + "\n");

                    int disminucion;

                    if (nave.getVelocidadX() == 0.0) {
                        System.out.println("Por favor acelera la nave para poder frenar\n");
                    } else {
                        System.out.println("Introduce la velocidad a disminuir de la nave: ");

                        disminucion = sc.nextInt();

                        nave.brake(disminucion);

                        System.out.println("\nLa nueva velocidad de la nave es: " + nave.getVelocidadX() + "\n");
                    }

                    break;
                case "5":

                    System.out.println("\nLa vane se par??\n");

                    nave.emergencyStop();

                    System.out.println("\nLa nueva velocidad de la nave es: " + nave.getVelocidadX() + "\n");

                    break;
            }

        }

    }
}
