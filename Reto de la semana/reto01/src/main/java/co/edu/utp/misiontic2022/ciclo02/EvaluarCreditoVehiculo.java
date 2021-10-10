package co.edu.utp.misiontic2022.ciclo02;

/**
* EvaluarCreditoVehiculo
*/
public class EvaluarCreditoVehiculo {

    private final Double INTERES_SIMPLE = 2.5;
    private final Double INTERES_COMPUESTO = 2.2;

 /**
 * Calcula la cantidad de intereses a pagar en un crédito aplicando
 * interés simple.
 *
 * @param valor Cantidad de dinero necesario para adquirir el vehiculo
 * @param tiempo Número de meses a los que espera terminar de pagar el
 * préstamo.
 * @param interes Porcentaje de interes a aplicar.
 * @return El valor de interés que debe pagar por el prestamo.
 */
 private Double calcularInteresSimple(Double valor, Integer tiempo, Double interes) {

    interes = interes / 100;
    var interesSimple = valor * interes * tiempo;

    return interesSimple;
 }
 /**
 * Calcula la cantidad de intereses a pagar en un credito aplicando interes
 * compuesto.
 *
 * @param valor Cantidad de dinero necesario para adquirir el vehiculo
 * @param tiempo Número de meses a los que espera terminar de pagar el
 * préstamo.
 * @param interes Porcentaje de interes a aplicar.
 * @return El valor de interes que debe pagar por el prestamo.
 */
 private Double calcularInteresCompuesto(Double valor,Integer tiempo,Double interes) {
    
    interes = interes / 100;
    interes = 1 + interes;
    var interesCompuesto = valor * (Math.pow(interes, tiempo) - 1);

    return interesCompuesto;
}
 /**
 * Compara las distintas opciones de crédito para tomar la mejor decisión.
 *
 * @param valor Cantidad de dinero necesario para adquirir el vehiculo
 * @param tiempo Número de meses a los que espera terminar de pagar el préstamo.
 * @return Una cadena de caracteres que explique cuál es la opción que de debe
 * tomar. Los posibles valores son:
 * <ul>
 * <li><pre>credito especial</pre></li>
 * <li><pre>credito estandar</pre></li>
 * </ul>
 *
 * En el caso quesea igual tomar cualquiera de los 2, debe elegir <pre>credit
o especial</pre>
 */
 public String compararOpcion(Double valor, Integer tiempo) {

    var simple = calcularInteresSimple(valor, tiempo, INTERES_SIMPLE);
    var compuesto = calcularInteresCompuesto(valor, tiempo, INTERES_COMPUESTO); 

    if (simple > compuesto) {
        return "credito estandar";
    }
    if (compuesto > simple) {
        return "credito especial";
    }
    else {
        return "credito especial";
    }
    
    
 }
}
