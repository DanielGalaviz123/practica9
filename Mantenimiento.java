public class Mantenimiento {
    private String tipoMantenimiento;
    private String fecha;
    private double costo;

    public Mantenimiento(String tipoMantenimiento, String fecha, double costo) {
        this.tipoMantenimiento = tipoMantenimiento;
        this.fecha = fecha;
        this.costo = costo;
    }

    
    public String getTipo() {
        return tipoMantenimiento;
    }

    public String getFecha() {
        return fecha;
    }

    public double getCosto() {
        return costo;
    }



    
}
