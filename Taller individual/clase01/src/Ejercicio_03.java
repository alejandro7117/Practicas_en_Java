import java.util.Scanner;
public class Ejercicio_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer numero; String resultado;

        System.out.print("Ingrese un número: ");
        numero = input.nextInt();
        resultado = CalcularDobleTriple(numero);
        System.out.println(resultado);
        
        input.close();
    }
    public static String CalcularDobleTriple(Integer numero) {
        Integer doble, triple;

        doble = numero * 2;
        triple = numero * 3;

        return "El doble de " + numero + " es " + doble + "\n" +
                "El triple de " + numero + " es " + triple;
    }
}
