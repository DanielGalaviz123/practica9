public class MedioDeTransporteMecanico extends MedioDeTransporte {
    private boolean encendido;

    public MedioDeTransporteMecanico(String nombre, String identificador, int anioDeCreacion) {
        super(nombre, identificador, anioDeCreacion);
        this.encendido = false; 
    }

    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println(getNombre() + " ha sido encendido.");
        } else {
            System.out.println(getNombre() + " ya esta encendido.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println(getNombre() + " ha sido apagado.");
        } else {
            System.out.println(getNombre() + " ya esta apagado.");
        }
    }

    @Override
    public void avanzar() {
        if (encendido) {
            System.out.println(getNombre() + " esta avanzando.");
        } else {
            System.out.println(getNombre() + " debe estar encendido para avanzar.");
        }
    }

    @Override
    public void retroceder() {
        if (encendido) {
            System.out.println(getNombre() + " esta retrocediendo.");
        } else {
            System.out.println(getNombre() + " debe estar encendido para retroceder.");
        }
    }

    @Override
    public void virar() {
        if (encendido) {
            System.out.println(getNombre() + " esta virando.");
        } else {
            System.out.println(getNombre() + " debe estar encendido para virar.");
        }
    }
}
