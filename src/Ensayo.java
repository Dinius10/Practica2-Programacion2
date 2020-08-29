public class Ensayo {
    private int idEnsayo;
    private String codigoJefe;
    private String medidas;
    private String tipoConcreto;
    private int fecha;
    private Producto Producto;
    private ControlCalidad controlCalidad;

    public Ensayo(int idEnsayo, String codigoJefe, String medidas, String tipoConcreto, int fecha, Producto producto, ControlCalidad controlCalidad) {
        this.idEnsayo = idEnsayo;
        this.codigoJefe = codigoJefe;
        this.medidas = medidas;
        this.tipoConcreto = tipoConcreto;
        this.fecha = fecha;
        Producto = producto;
        this.controlCalidad = controlCalidad;
    }

    public int getIdEnsayo() {
        return idEnsayo;
    }

    public void setIdEnsayo(int idEnsayo) {
        this.idEnsayo = idEnsayo;
    }

    public String getCodigoJefe() {
        return codigoJefe;
    }

    public void setCodigoJefe(String codigoJefe) {
        this.codigoJefe = codigoJefe;
    }

    public String getMedidas() {
        return medidas;
    }

    public void setMedidas(String medidas) {
        this.medidas = medidas;
    }

    public String getTipoConcreto() {
        return tipoConcreto;
    }

    public void setTipoConcreto(String tipoConcreto) {
        this.tipoConcreto = tipoConcreto;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public Producto getProducto() {
        return Producto;
    }

    public void setProducto(Producto producto) {
        Producto = producto;
    }

    public ControlCalidad getControlCalidad() {
        return controlCalidad;
    }

    public void setControlCalidad(ControlCalidad controlCalidad) {
        this.controlCalidad = controlCalidad;
    }
}
