import java.util.ArrayList;
public class MotorReportes {
    private ArrayList<Exportable> exportadores = new ArrayList<>();
    public void agregarExportador(Exportable exportador) {
        exportadores.add(exportador);
    }
    public void exportarTodos(String contenidoReporte) {
        for (Exportable exportador : exportadores) {
            exportador.exportar(contenidoReporte);
            System.out.println();
        }
    }
}
