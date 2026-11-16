public class ExportadorPDF implements Exportable {
    public void exportar(String contenidoReporte) {
        System.out.println("--- reporte pdf ---");
        System.out.println("[pdf]");
        System.out.println(contenidoReporte);
        System.out.println("fin del documento pdf");
    }
}
