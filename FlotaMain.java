import java.util.ArrayList;
import java.util.List;

public class FlotaMain {
    public static void main(String[] args) {
        
        Flota flota = new Flota();
        Empresa empresa = new Empresa("Transporte Galaviz Sanchez", "Avenida Benito", 686142562, "Ciudad Mexicali BC", "transporteGalaDA@gmail.com", flota);

        
        System.out.println("Datos de la Empresa:");
        System.out.println("Nombre: " + empresa.getNombreEmpresa()); 
        System.out.println("Direccion: " + empresa.getDireccionEmpresa());
        System.out.println("Numero: " + empresa.getNumeroEmpresa());
        System.out.println("Ubicacion: " + empresa.getUbicacionEmpresa());
        System.out.println("Correo: " + empresa.getCorreoEmpresa());
        System.out.println(); 

        // Crear medios de transporte
        Autobus autobus = new Autobus("Ruta 9", "686DAN", 2004);
        Bicicleta bicicleta = new Bicicleta("Bicicleta", "BICI51", 2015);
        Caballo caballo = new Caballo("Caballo ANDALUZ", "ESP4545", 2008);
        Barco barco = new Barco("Barco Yate", "LOL123", 2015);

        // Agregar medios de transporte a la flota
        flota.agregarMedioDeTransporte(autobus);
        flota.agregarMedioDeTransporte(bicicleta);
        flota.agregarMedioDeTransporte(caballo);
        flota.agregarMedioDeTransporte(barco);

        // Crear mantenimientos
        Mantenimiento mantenimientoAutobus = new Mantenimiento("Revision", "2024-10-01", 500);
        Mantenimiento mantenimientoBicicleta = new Mantenimiento("Ajuste de Llantas", "2024-10-02", 55);
        Mantenimiento mantenimientoCaballo = new Mantenimiento("Chequeo Veterinario", "2024-10-03", 3000);
        Mantenimiento mantenimientoBarco = new Mantenimiento("Revisión", "2024-10-04", 12000.0);

        // Registrar mantenimientos
        autobus.agregarMantenimiento(mantenimientoAutobus);
        bicicleta.agregarMantenimiento(mantenimientoBicicleta);
        caballo.agregarMantenimiento(mantenimientoCaballo);
        barco.agregarMantenimiento(mantenimientoBarco);

        // Probar los metodos de cada medio de transporte
        System.out.println("Metodos de Autobus:");
        autobus.encender();
        autobus.avanzar();
        autobus.virar();
        autobus.retroceder();
        autobus.apagar();

        System.out.println("\nMetodos de Bicicleta:");
        bicicleta.avanzar();
        bicicleta.virar();
        bicicleta.retroceder();

        System.out.println("\nMetodos de Caballo:");
        caballo.preparar();
        caballo.avanzar();
        caballo.retroceder();
        caballo.descansar();

        System.out.println("\nMetodos de Barco:");
        barco.encender();
        barco.avanzar();
        barco.virar();
        barco.retroceder();
        barco.apagar();

        // Listar todos los medios de transporte en la flota
        System.out.println("\nMedios de transporte en la flota:");
        List<MedioDeTransporte> medios = flota.obtenerMediosDeTransporte();
        for (MedioDeTransporte medio : medios) {
            System.out.println(medio.getNombre());
        }

        // metodo para agregar una lista de medios de transporte
        List<MedioDeTransporte> nuevosMedios = new ArrayList<>();
        nuevosMedios.add(new Bicicleta("Bicicleta de Carrera", "BICE1567", 2024));
        nuevosMedios.add(new Barco("Yate de Lujo", "Yate696", 2024));
        
        flota.agregarMediosDeTransporte(nuevosMedios);

        // Listar medios de transporte despues de agregar nuevos
        System.out.println("\nMedios de transporte después de agregar nuevos:");
        medios = flota.obtenerMediosDeTransporte();
        for (MedioDeTransporte medio : medios) {
            System.out.println(medio.getNombre());
        }

        // Mostrar el historial de mantenimientos de cada medio de transporte
        System.out.println("\nHistorial de Mantenimientos:");
        for (MedioDeTransporte medio : medios) {
            System.out.println("\nHistorial de " + medio.getNombre() + ":");
            List<Mantenimiento> mantenimientos = medio.obtenerHistorialMantenimientos();
            for (Mantenimiento mantenimiento : mantenimientos) {
                System.out.println("Tipo: " + mantenimiento.getTipo() + ", Fecha: " + mantenimiento.getFecha() + ", Costo: " + mantenimiento.getCosto());
            }
        }
    }
}

