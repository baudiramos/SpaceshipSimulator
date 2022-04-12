public class SpaceShip {
    private String nombreNave;
    private String matriculaNave;
    private int aceleracion;
    private float velocidadX;
    private float velocidadY;
    private float coordenadaX;
    private float coordenadaY;
    private float direccionX;
    private float direccionY;

    // Iniciamos constructor


    public SpaceShip(String nombreNave, String matriculaNave, int aceleracion, float velocidadX, float coordenadaX, float direccionX) {
        this.nombreNave = nombreNave;
        this.matriculaNave = matriculaNave;
        this.aceleracion = aceleracion;
        this.velocidadX = velocidadX;
        this.coordenadaX = coordenadaX;
        this.direccionX = direccionX;
    }


    // Método speedUp
    public void speedUp(int aceleracion) {
        velocidadX = velocidadX + aceleracion;
        coordenadaX = coordenadaX + velocidadX;
    }