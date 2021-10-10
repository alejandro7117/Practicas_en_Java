import java.util.Scanner;
public class Ejercicio_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer numero; String resultado;
        
        System.out.print("Ingrese un número: ");
        numero = input.nextInt();
        resultado = CalculoCifras(numero);
        System.out.println("El "+ numero+ resultado);

        input.close();
    }
    public static String CalculoCifras(Integer numero) {
        Integer cifras = 0;
        while (numero != 0) {
            numero /= 10;
            cifras++;
        }
        return " tiene " + cifras + " cifras";
    }
}
