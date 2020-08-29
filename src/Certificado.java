public class Certificado {
    private int idCertificado;
    private String calidad;
    private String anomalias;
    private Ensayo ensayo;

    public Certificado(int idCertificado, String calidad, String anomalias, Ensayo ensayo) {
        this.idCertificado = idCertificado;
        this.calidad = calidad;
        this.anomalias = anomalias;
        this.ensayo = ensayo;
    }

    public int getIdCertificado() {
        return idCertificado;
    }

    public void setIdCertificado(int idCertificado) {
        this.idCertificado = idCertificado;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getAnomalias() {
        return anomalias;
    }

    public void setAnomalias(String anomalias) {
        this.anomalias = anomalias;
    }

    public Ensayo getEnsayo() {
        return ensayo;
    }

    public void setEnsayo(Ensayo ensayo) {
        this.ensayo = ensayo;
    }
}
