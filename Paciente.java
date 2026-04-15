public class Paciente {

    public String nombre;
    public String id;

    private String seguro;
    private int edad;
    private double costoConsulta;
    private int numeroConsultas;
    private int prioridad;

    public Paciente(String nombre, String id, String seguro, int edad, double costoConsulta, int numeroConsultas, int prioridad) {
        this.nombre = nombre;
        this.id = id;

        setSeguro(seguro);
        setEdad(edad);
        setCostoConsulta(costoConsulta);
        setNumeroConsultas(numeroConsultas);
        setPrioridad(prioridad);
    }

    public void setSeguro(String seguro) {
        if(seguro.equals("Basico") || seguro.equals("Premium") || seguro.equals("SinSeguro")) {
            this.seguro = seguro;
        } else {
            this.seguro = "SinSeguro";
        }
    }
    public void setEdad(int edad) {
        if(edad > 0) {
            this.edad = edad;
        } else {
            this.edad = 1;
        }
    }

    public void setCostoConsulta(double costoConsulta) {
        if(costoConsulta > 0) {
            this.costoConsulta = costoConsulta;
        } else {
            this.costoConsulta = 0;
        }
    }

    public void setNumeroConsultas(int numeroConsultas) {
        if(numeroConsultas >= 0) {
            this.numeroConsultas = numeroConsultas;
        } else {
            this.numeroConsultas = 0;
        }
    }

    public void setPrioridad(int prioridad) {
        if(prioridad >= 1 && prioridad <= 5) {
            this.prioridad = prioridad;
        } else {
            this.prioridad = 1;
        }
    }

    public double calcularCostoTotal() {
        return costoConsulta * numeroConsultas;
    }

    public double aplicarDescuento() {
        double total = calcularCostoTotal();

        if(seguro.equals("Basico")) {
            return total * 0.10;
        } else if(seguro.equals("Premium")) {
            return total * 0.20;
        } else {
            return 0;
        }
    }

    public double costoFinal() {
        return calcularCostoTotal() - aplicarDescuento();
    }

    public String clasificarPrioridad() {
        if(prioridad >= 4) {
            return "Alta prioridad";
        } else if(prioridad >= 2) {
            return "Prioridad media";
        } else {
            return "Prioridad baja";
        }
    }

    public String mensajeMedico() {
        String tipo = clasificarPrioridad();

        if(tipo.equals("Alta prioridad")) {
            return "Atención inmediata requerida";
        } else if(tipo.equals("Prioridad media")) {
            return "Seguimiento necesario";
        } else {
            return "Control regular";
        }
        }
}

