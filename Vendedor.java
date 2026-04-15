public class Vendedor {

    public String nombre;
    public String area;

    private double montoVendido;
    private double porcentajeComision;
    private double meta;


    public Vendedor(String nombre, String area, double montoVendido, double porcentajeComision, double meta) {
        this.nombre = nombre;
        this.area = area;

        setMontoVendido(montoVendido);
        setPorcentajeComision(porcentajeComision);
        setMeta(meta);
    }

    public double getMontoVendido() {
        return montoVendido;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public double getMeta() {
        return meta;
    }

    public void setMontoVendido(double montoVendido) {
        if (montoVendido >= 0) {
            this.montoVendido = montoVendido;
        } else {
            this.montoVendido = 0;
        }
    }

    public void setPorcentajeComision(double porcentajeComision) {
        if (porcentajeComision >= 0 && porcentajeComision <= 100) {
            this.porcentajeComision = porcentajeComision;
        } else {
            this.porcentajeComision = 0;
        }
    }

    public void setMeta(double meta) {
        if (meta >= 0 && meta <= 100) {
            this.meta = meta;
        } else {
            this.meta = 0;
        }
    }

    public double calcularComision() {
        return montoVendido * (porcentajeComision / 100);
    }

    public double calcularIngresoTotal() {
        return montoVendido + calcularComision();
    }

    public String estadoCumplimiento() {
        if (meta >= 90) {
            return "Excelente";
        } else if (meta >= 70) {
            return "Aceptable";
        } else {
            return "Bajo";
        }
    }

    public String mensajeDesempeno() {
        String estado = estadoCumplimiento();

        switch (estado) {
            case "Excelente":
                return "Vendedor con desempeño sobresaliente";
            case "Aceptable":
                return "Vendedor con desempeño aceptable";
            default:
                return "Se requiere seguimiento comercial";
        }
    }
}