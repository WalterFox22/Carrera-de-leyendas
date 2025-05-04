package Hilos;

public class PosicionLlegada {
    public static int lugar = 1;

    public synchronized static int obtenerLugar() {
        return lugar++;
    }

    public static void reiniciar() {
        lugar = 1;
    }
}
