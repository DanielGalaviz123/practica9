public class Caballo extends MedioDeTransporteAnimal {
    public Caballo(String nombre, String identificador, int anioDeCreacion) {
        super(nombre, identificador, anioDeCreacion);
    }

    @Override
    public void avanzar() {
        System.out.println(getNombre() + " (Caballo) esta galopando.");
    }

    @Override
    public void retroceder() {
        System.out.println(getNombre() + " (Caballo) esta retrocediendo.");
    }

    @Override
    public void virar() {
        System.out.println(getNombre() + " (Caballo) esta virando.");
    }
}
