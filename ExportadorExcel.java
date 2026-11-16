public class ExportadorExcel implements Exportable {
    public void exportar(String contenidoReporte) {
        System.out.println("--- reporte excel ---");
        System.out.println("| planilla financier |");
        System.out.println("| " + contenidoReporte + " |");
        System.out.println("fin de la planilla excel");
    }
}

