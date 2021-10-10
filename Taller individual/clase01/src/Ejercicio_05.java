import java.util.Scanner;
public class Ejercicio_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        var numero = input.nextInt(); 
        var resultado = CalcularParImpar(numero);
        System.out.println(resultado);
        input.close();
    }
    public static String CalcularParImpar(Integer numero) {
        var resultado = numero % 2 == 0 ? "Es par" : "Es impar";
        return resultado;
    }
}
