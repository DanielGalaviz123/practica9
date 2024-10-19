public class Barco extends MedioDeTransporteMecanico {
    private boolean encendido;

    public Barco(String nombre, String identificador, int anioCreacion) {
        super(nombre, identificador, anioCreacion);
        this.encendido = false;
    }

    @Override
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("El barco esta encendido.");
        } else {
            System.out.println("El barco ya esta encendido.");
        }
    }

    @Override
    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("El barco esta apagado.");
        } else {
            System.out.println("El barco ya esta apagado.");
        }
    }

    public boolean isEncendido() {
        return encendido;
    }

    @Override
    public void avanzar() {
        if (encendido) {
            System.out.println("El barco avanza.");
        } else {
            System.out.println("El barco debe estar encendido para avanzar.");
        }
    }

    @Override
    public void retroceder() {
        if (encendido) {
            System.out.println("El barco retrocede.");
        } else {
            System.out.println("El barco debe estar encendido para retroceder.");
        }
    }

    @Override
    public void virar() {
        if (encendido) {
            System.out.println("El barco vira.");
        } else {
            System.out.println("El barco debe estar encendido para virar.");
        }
    }
}
