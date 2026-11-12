
package modelo;

public abstract class TicketSoporte implements IXMLExportable {
    protected String codigoUnico;
    protected String titulo;
    protected String descripcion;
    protected String fechaCreacion;
    protected String estado; // Abierto, En Proceso, Escalado, Resuelto, Cerrado[cite: 14]
    protected String prioridad; // BAJA, MEDIA, ALTA[cite: 17]

    public TicketSoporte(String codigoUnico, String titulo, String descripcion, String fechaCreacion, String prioridad) {
        this.codigoUnico = codigoUnico;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.estado = "Abierto";
        this.prioridad = prioridad;
    }

    // Métodos abstractos obligatorios para las clases hijas (Polimorfismo / Clases Abstractas)
    public abstract int calcularTiempoEstimadoResolucion();
    public abstract String generarReporteEspecifico();

    // Getters y Setters básicos
    public String getCodigoUnico() { return codigoUnico; }
    public String getTitulo() { return titulo; }
    public String getPrioridad() { return prioridad; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
