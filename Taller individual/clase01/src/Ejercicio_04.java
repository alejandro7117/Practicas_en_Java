import java.util.Scanner;
public class Ejercicio_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Float numero; String resultado;

        System.out.print("Ingrese un número: ");
        numero = input.nextFloat();
        resultado = CalcularGrados(numero);
        System.out.println(resultado);    

        input.close();
    }
    public static String CalcularGrados(Float numero) {
        Float fahrenheit;

        fahrenheit = 32 + (9 * numero / 5);
        return "Son " + fahrenheit + "°" + " fahrenheit";
    }
}
