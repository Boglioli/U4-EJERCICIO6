public class Main {
    public static void main(String[] args) {
        MotorReportes motor = new MotorReportes();
        motor.agregarExportador(new ExportadorPDF());
        motor.agregarExportador(new ExportadorExcel());
        motor.agregarExportador(new ExportadorHTML());
        String reporte = "ingresos:  $500000 - gastos: $150000 - ganancias: $350000";
        motor.exportarTodos(reporte);
    }
}