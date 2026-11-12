
package modelo;

public class Incidente extends TicketSoporte implements IEscalonable {
    private String equipoAfectado;

    public Incidente(String codigoUnico, String titulo, String descripcion, String fechaCreacion, String prioridad, String equipoAfectado) {
        super(codigoUnico, titulo, descripcion, fechaCreacion, prioridad);
        this.equipoAfectado = equipoAfectado;
    }

    @Override
    public int calcularTiempoEstimadoResolucion() {
        // Regla de negocio: Si es Alta, se resuelve en 2 horas; sino en 6 horas
        return this.prioridad.equalsIgnoreCase("ALTA") ? 2 : 6;
    }

    @Override
    public String generarReporteEspecifico() {
        return "Incidente crítico en equipo: " + equipoAfectado;
    }

    @Override
    public String toXML() {
        return "<Incidente><code>" + codigoUnico + "</code><equipo>" + equipoAfectado + "</equipo></Incidente>";
    }

    @Override
    public void fromXML(String xmlData) {
        // Lógica de lectura XML para el futuro si se requiere
    }
    @Override
public void escalarCaso() {
    this.estado = "Escalado";
}

@Override
public boolean verificarVencimientoSLA(int horasTranscurridas) {
    return horasTranscurridas > calcularTiempoEstimadoResolucion();
}
} 
