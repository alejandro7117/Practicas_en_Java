/**
 * Realizar un programa que calcule el sueldo de un trabajador, el programa
 * solicita el número de horas que has trabajado en un mes, las horas se
 * pagan a $30.000.
 */
public class Ejercicio03 {

    private final Integer PAGO_POR_HORA = 30_000;
    private Integer horasTrabajadas;

    public Integer getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(Integer horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String calcularSueldoPorHora() {
        Integer sueldo = horasTrabajadas * PAGO_POR_HORA;
        return "El valor de tu sueldo es: " + sueldo;
    }
}
