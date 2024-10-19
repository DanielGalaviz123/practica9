public class Bicicleta extends MedioDeTransporte {
    public Bicicleta(String nombre, String identificador, int anioDeCreacion) {
        super(nombre, identificador, anioDeCreacion);
    }

    @Override
    public void avanzar() {
        System.out.println(getNombre() + " (Bicicleta) esta pedaleando.");
    }

    @Override
    public void retroceder() {
        System.out.println(getNombre() + " (Bicicleta) esta retrocediendo.");
    }

    @Override
    public void virar() {
        System.out.println(getNombre() + " (Bicicleta) esta virando.");
    }
}
