package co.edu.utp.misiontic2022.ciclo02;

import co.edu.utp.misiontic2022.ciclo02.view.ReportesView;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        var reportesView = new ReportesView();
        var banco = "Davivienda";
        reportesView.proyectosFinanciadosPorBanco(banco);

        var reportesView1 = new ReportesView();
        var limiteInferior = 50_000d;
        reportesView1.totalPagadoPorProyectosSuperioresALimite(limiteInferior);

        var reportesView2 = new ReportesView();
        reportesView2.lideresQueMenosGastan();

    }
}
