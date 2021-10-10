/**
 * Realizar la suma, la resta, la división y la multiplicación de dos números
 * leídos por teclado y mostrar en pantalla
 */
public class Ejercicio01 {

    private Integer numero01;
    private Integer numero02;

    public Integer getNumero01() {
        return numero01;
    }

    public void setNumero01(Integer numero01) {
        this.numero01 = numero01;
    }

    public Integer getNumero02() {
        return numero02;
    }

    public void setNumero02(Integer numero02) {
        this.numero02 = numero02;
    }

    public String operacionSuma(Integer numero1, Integer numero2) {
        return "La suma de los dos numeros es " + (numero1 + numero2);
    }

    public String operacionResta(Integer numero1, Integer numero2) {
        return "La resta de los dos numeros es " + (numero1 - numero2);
    }

    public String operacionMultiplicacion(Integer numero1, Integer numero2) {
        return "La multiplicacion de los dos numeros es " + (numero1 * numero2);
    }

    public String operacionDivision(Integer numero1, Integer numero2) {
        return "La division de los dos numeros es " + (numero1 / numero2);
    }

}