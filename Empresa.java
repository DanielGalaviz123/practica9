import java.util.ArrayList;

public class Empresa {
    String nombreEmpresa;
    String direccionEmpresa;
    int numeroEmpresa;
    String ubicacionEmpresa;
    String correoDeEmpresa;
    Flota flota;

    public Empresa(String nombreEmpresa, String direccionEmpresa, int numeroEmpresa, String ubicacionEmpresa, String correoDeEmpresa, Flota flota) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.numeroEmpresa = numeroEmpresa;
        this.ubicacionEmpresa = ubicacionEmpresa;
        this.correoDeEmpresa = correoDeEmpresa;
        this.flota = flota;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public int getNumeroEmpresa() {
        return numeroEmpresa;
    }

    public String getUbicacionEmpresa() {
        return ubicacionEmpresa;
    }

    public String getCorreoEmpresa() {
        return correoDeEmpresa;
    }

    public Flota getFlota() {
        return flota;
    }




    // Metodos para modificar la flota
    public void agregarMedioAFlota(MedioDeTransporte medio) {
        flota.agregarMedioDeTransporte(medio);
    }

    public void eliminarMedioDeFlota(MedioDeTransporte medio) {
        flota.eliminarMedioDeTransporte(medio);
    }

    public ArrayList<MedioDeTransporte> listarMediosDeTransporte() {
        return (ArrayList<MedioDeTransporte>) flota.obtenerMediosDeTransporte();
    }

    public int cantidadDeMediosEnFlota() {
        return flota.obtenerCantidadDeMediosDeTransporte();
    }
}
