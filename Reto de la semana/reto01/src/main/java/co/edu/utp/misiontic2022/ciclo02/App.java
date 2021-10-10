package co.edu.utp.misiontic2022.ciclo02;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Double valor = 53250000.0;
        Integer tiempo = 36;
        EvaluarCreditoVehiculo evaluar = new EvaluarCreditoVehiculo();
        String eleccion = evaluar.compararOpcion(valor, tiempo);
        System.out.println(eleccion);

        Double valor1 = 35000000.0;
        Integer tiempo1 = 12;
        EvaluarCreditoVehiculo evaluar1 = new EvaluarCreditoVehiculo();
        String eleccion1 = evaluar1.compararOpcion(valor1, tiempo1);
        System.out.println(eleccion1);

        Double valor2 = 41900000.0;
        Integer tiempo2 = 24;
        EvaluarCreditoVehiculo evaluar2 = new EvaluarCreditoVehiculo();
        String eleccion2 = evaluar2.compararOpcion(valor2, tiempo2);
        System.out.println(eleccion2);
    }

}
