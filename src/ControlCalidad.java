public class ControlCalidad {
    private int idControlCalidad;
    private int fechaVencimiento;
    private String eficiencia;
    private String Tipo;
    private Laboratorio idLaboratorio;

    public ControlCalidad(int idControlCalidad, int fechaVencimiento, String eficiencia, String tipo, Laboratorio idLaboratorio) {
        this.idControlCalidad = idControlCalidad;
        this.fechaVencimiento = fechaVencimiento;
        this.eficiencia = eficiencia;
        Tipo = tipo;
        this.idLaboratorio = idLaboratorio;
    }

    public int getIdControlCalidad() {
        return idControlCalidad;
    }

    public void setIdControlCalidad(int idControlCalidad) {
        this.idControlCalidad = idControlCalidad;
    }

    public int getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(int fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(String eficiencia) {
        this.eficiencia = eficiencia;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public Laboratorio getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(Laboratorio idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }
}
