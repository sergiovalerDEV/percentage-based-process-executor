package acciones;

public class Accion2 implements Accion {
    private static Accion2 instance;

    private Accion2() {

    }

    //Implementamos el patrón singleton
    public static Accion2 getInstance() {
        if (instance == null) {
            instance = new Accion2();
        }
        return instance;
    }

    @Override
    public void realizar() {
        System.out.println("\u001B[32mAcción 2 realizada\u001B[0m");
    }

    //Omitimos getters y setters por el momento
}
