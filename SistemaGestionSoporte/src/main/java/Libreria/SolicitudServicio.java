
package modelo;

public class SolicitudServicio extends TicketSoporte {
    private String tipoAcceso;

    public SolicitudServicio(String codigoUnico, String titulo, String descripcion, String fechaCreacion, String prioridad, String tipoAcceso) {
        super(codigoUnico, titulo, descripcion, fechaCreacion, prioridad);
        this.tipoAcceso = tipoAcceso;
    }

    @Override
    public int calcularTiempoEstimadoResolucion() {
        return 24; // Tiempo estándar de 24 horas por validación de jefatura
    }

    @Override
    public String generarReporteEspecifico() {
        return "Solicitud de servicio / acceso: " + tipoAcceso;
    }

    @Override
    public String toXML() {
        return "<SolicitudServicio><code>" + codigoUnico + "</code><acceso>" + tipoAcceso + "</acceso></SolicitudServicio>";
    }

    @Override
    public void fromXML(String xmlData) {}
}