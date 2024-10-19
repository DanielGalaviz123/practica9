public class MedioDeTransporteAnimal extends MedioDeTransporte {
    public MedioDeTransporteAnimal(String nombre, String identificador, int anioDeCreacion) {
        super(nombre, identificador, anioDeCreacion);
    }

    public void preparar() {
        System.out.println(getNombre() + " se esta preparando.");
    }

    public void descansar() {
        System.out.println(getNombre() + " esta descansando.");
    }

    @Override
    public void avanzar() {
        System.out.println(getNombre() + " esta avanzando.");
    }

    @Override
    public void retroceder() {
        System.out.println(getNombre() + " esta retrocediendo.");
    }

    @Override
    public void virar() {
        System.out.println(getNombre() + " esta virando.");
    }
}
