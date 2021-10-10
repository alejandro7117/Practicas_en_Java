/**
 * Solicitar un número al usuario y mostrar la tabla de multiplicar de ese
 * número, desde el 0 hasta el 10. Truco: Usa un bucle for para recorrer la
 * tabla y mostrar los datos.
 */
public class Ejercicio04 {

    private Integer numero;

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public String tablaDeMultiplicar() {

        for (Integer i = 0; i <= 10; i++) {
            Integer numero = getNumero() * i;
            System.out.println(getNumero() + " * " + i + " = " + numero);
        }
        return "";
        
        
    }
    
}
