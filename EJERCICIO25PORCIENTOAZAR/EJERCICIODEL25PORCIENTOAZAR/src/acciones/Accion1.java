package acciones;

public class Accion1 implements Accion {
    private static Accion1 instance;

    private Accion1() {
    }


    //Implementamos el patrón singleton
    public static Accion1 getInstance() {
        if (instance == null) {
            instance = new Accion1();
        }
        return instance;
    }

    @Override
    public void realizar() {
        System.out.println("\u001B[34mAcción 1 realizada\u001B[0m");
    }

    //Omitimos getters y setters por el momento
}
