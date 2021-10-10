/**
 * Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que
 * adivinar introduciendo el número por teclado. En el caso que el número a
 * adivinar sea mayor al ingresado, decirle al usuario “El número que busca es
 * mayor”, de lo contrario, “El número que busca es menor”. El programa
 * finalizará cuando se introduzca el número correcto. Nota: usar la clase
 * Random para generar el número aleatorio.
 */

public class Ejercicio05 {

    private final Integer NUMERO_MAGICO = (int) ((Math.random() * 100) + 1);
    private Integer numero;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNUMERO_MAGICO() {
        return NUMERO_MAGICO;
    }

    public String adivinarNumero(Integer numero) {

        if (numero == NUMERO_MAGICO) {
            return "Has acertado";
        }
        if (numero > NUMERO_MAGICO) {
            return "El numero que buscas es menor";
        }
        else {
            return "El numero que buscas es mayor";
        }
        
    }
    
}
