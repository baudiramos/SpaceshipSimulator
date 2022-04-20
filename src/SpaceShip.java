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


    public SpaceShip() {
    }


    // Método speedUp
    public void speedUp(int aceleracion) {
        velocidadX = velocidadX + aceleracion;
        coordenadaX = coordenadaX + velocidadX;
    }

    // Método brake()

    public void brake(int aceleracion) {
        velocidadX = velocidadX - aceleracion;
        coordenadaX = coordenadaX - velocidadX;
    }

// Método emergencyStop

    public void emergencyStop() {
        velocidadX = 0;
    }

    @Override
    public String toString() {
        String output;
        output = "                    /~~~~~|\n" +
                "               .__./''''''|\n" +
                "._____________/   |/^^^^^^^\\\n" +
                "|             `===\"\\_______/\n" +
                "`.             .___/^^^^^^^^\\\n" +
                "  `------------'~~~\\________/   FRM\n" +
                "                  `........\\\n" +
                "                    `-------'\n" ;
        return output;
    }
}