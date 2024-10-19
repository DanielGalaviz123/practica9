import java.util.ArrayList;
import java.util.List;

public abstract class MedioDeTransporte {
    private String nombre;
    private String identificador;
    private int anioCreacion;
    private List<Mantenimiento> historialMantenimientos;

    public MedioDeTransporte(String nombre, String identificador, int anioCreacion) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.anioCreacion = anioCreacion;
        this.historialMantenimientos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarMantenimiento(Mantenimiento mantenimiento) {
        historialMantenimientos.add(mantenimiento);
    }

    public List<Mantenimiento> obtenerHistorialMantenimientos() {
        return this.historialMantenimientos; 
    }

    
    public abstract void avanzar();
    public abstract void retroceder();
    public abstract void virar();
}

