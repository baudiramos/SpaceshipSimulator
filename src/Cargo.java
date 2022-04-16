public class Cargo  extends  SpaceShip{
    private  int cargaMaxima;
    private  int capacidadBodega;

    public int  load(int cargaMaxima) {
        if (cargaMaxima >= 1) {
            System.out.println("Hay espacio para intrudicir carga en la bodea");
            capacidadBodega = cargaMaxima;
        } else {
            System.out.println("No hay espacio para introducir más carga en la bodega");
        }
    }

    public int unload(int capacidadBodega) {
        if (capacidadBodega >= 1) {
            System.out.println("Hay algun container en la bodega, se va a eliminar");
            capacidadBodega = 0;
        } else {
            System.out.println("No se puede descargar ningun container de  la bodega porque no hay ninguno disponible");
        }
    }






    public Cargo(String nombreNave, String matriculaNave, int aceleracion, float velocidadX, float coordenadaX, float direccionX) {
        super(nombreNave, matriculaNave, aceleracion, velocidadX, coordenadaX, direccionX);
    }
}
