public class Autobus extends MedioDeTransporteMecanico {
    private boolean encendido;

    public Autobus(String nombre, String identificador, int anioCreacion) {
        super(nombre, identificador, anioCreacion);
        this.encendido = false;
    }

    @Override
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("El autobus esta encendido.");
        } else {
            System.out.println("El autobús ya está encendido.");
        }
    }

    @Override
    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("El autobus esta apagado.");
        } else {
            System.out.println("El autobus ya esta apagado.");
        }
    }

    public boolean isEncendido() {
        return encendido;
    }

    @Override
    public void avanzar() {
        if (encendido) {
            System.out.println("El autobus avanza.");
        } else {
            System.out.println("El autobus debe estar encendido para avanzar.");
        }
    }

    @Override
    public void retroceder() {
        if (encendido) {
            System.out.println("El autobus retrocede.");
        } else {
            System.out.println("El autobus debe estar encendido para retroceder.");
        }
    }

    @Override
    public void virar() {
        if (encendido) {
            System.out.println("El autobus vira.");
        } else {
            System.out.println("El autobus debe estar encendido para virar.");
        }
    }
}
