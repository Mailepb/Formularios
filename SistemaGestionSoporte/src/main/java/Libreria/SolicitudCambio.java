
package modelo;

public class SolicitudCambio extends TicketSoporte {
    private String planRollback;

    public SolicitudCambio(String codigoUnico, String titulo, String descripcion, String fechaCreacion, String prioridad, String planRollback) {
        super(codigoUnico, titulo, descripcion, fechaCreacion, prioridad);
        this.planRollback = planRollback;
    }

    @Override
    public int calcularTiempoEstimadoResolucion() {
        return 72; // Mayor tiempo por evaluación de riesgos tecnológicos
    }

    @Override
    public String generarReporteEspecifico() {
        return "Solicitud de cambio tecnológico con plan de rollback: " + planRollback;
    }

    @Override
    public String toXML() {
        return "<SolicitudCambio><code>" + codigoUnico + "</code><rollback>" + planRollback + "</rollback></SolicitudCambio>";
    }

    @Override
    public void fromXML(String xmlData) {}
} 