import java.util.ArrayList;
import java.util.List;

public class Flota {
    private List<MedioDeTransporte> mediosDeTransporte;

    public Flota() {
        mediosDeTransporte = new ArrayList<>();
    }

    public void agregarMedioDeTransporte(MedioDeTransporte medio) {
        mediosDeTransporte.add(medio);
    }

    public void agregarMediosDeTransporte(List<MedioDeTransporte> nuevosMedios) {
        mediosDeTransporte.addAll(nuevosMedios);
    }

    public void eliminarMedioDeTransporte(MedioDeTransporte medio) {
        mediosDeTransporte.remove(medio);
    }

    public List<MedioDeTransporte> obtenerMediosDeTransporte() {
        return mediosDeTransporte;
    }

    public int obtenerCantidadDeMediosDeTransporte() {
        return mediosDeTransporte.size();
    }
    
}

