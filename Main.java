public class Main {
    public static void main(String[] args) {

        /*Vendedor vendedor = new Vendedor(
                "Andrea Lopez",
                "Tecnologia",
                2850.75,
                8,
                92
        );

        System.out.println("===== INFORME DE VENTAS =====");
        System.out.println("Nombre: " + vendedor.nombre);
        System.out.println("Area: " + vendedor.area);

        System.out.println("Monto vendido: " + vendedor.getMontoVendido());
        System.out.println("Comision: " + vendedor.calcularComision());
        System.out.println("Ingreso total: " + vendedor.calcularIngresoTotal());

        System.out.println("Cumplimiento: " + vendedor.getMeta() + "%");
        System.out.println("Estado: " + vendedor.estadoCumplimiento());

        System.out.println("Mensaje final: " + vendedor.mensajeDesempeno());*/

        Paciente p = new Paciente(
                "Emely Pérez",
                "0102030405",
                "Premium",
                45,
                25.50,
                3,
                4
        );

        System.out.println("===== REPORTE MÉDICO =====");
        System.out.println("Nombre: " + p.nombre);
        System.out.println("ID: " + p.id);

        System.out.println("Costo total: " + p.calcularCostoTotal());
        System.out.println("Descuento: " + p.aplicarDescuento());
        System.out.println("Costo final: " + p.costoFinal());

        System.out.println("Clasificación: " + p.clasificarPrioridad());
        System.out.println("Mensaje: " + p.mensajeMedico());
    }
}