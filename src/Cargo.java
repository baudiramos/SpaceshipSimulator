public class Cargo  extends  SpaceShip{
    private  int cargaMaxima;

    public int  load(int cargaMaxima) {
        cargaMaxima = cargaMaxima;
        if (cargaMaxima >= 1) {
            System.out.println("Hay espacio para intrudicir carga en la bodea");
        } else {
            System.out.println("No hay espacio para introducir más carga en la bodega");
        }
    }


    public Cargo(String nombreNave, String matriculaNave, int aceleracion, float velocidadX, float coordenadaX, float direccionX) {
        super(nombreNave, matriculaNave, aceleracion, velocidadX, coordenadaX, direccionX);
    }
}
