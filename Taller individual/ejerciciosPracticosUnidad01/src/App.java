import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var input = new Scanner(System.in);

        /*//Ejercicio01
        Ejercicio01 calculadora = new Ejercicio01();
        System.out.println("Ingresa el primer numero: ");
        var numero1 = input.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        var numero2 = input.nextInt();

        calculadora.setNumero01(numero1);
        calculadora.setNumero02(numero2);
        System.out.println(calculadora.operacionSuma(calculadora.getNumero01(), calculadora.getNumero02()));
        System.out.println(calculadora.operacionResta(calculadora.getNumero01(), calculadora.getNumero02()));
        System.out.println(calculadora.operacionMultiplicacion(calculadora.getNumero01(), calculadora.getNumero02()));
        System.out.println(calculadora.operacionDivision(calculadora.getNumero01(), calculadora.getNumero02()));
        */

        /*//Ejercicio02
        Ejercicio02 promedio = new Ejercicio02();
        System.out.println("Ingresa tu nombre: ");
        promedio.setNombre( input.nextLine()) ;
        System.out.println("Ingresa la primera nota: ");
        promedio.setNota01( input.nextDouble()) ;
        System.out.println("Ingresa la segunda nota: ");
        promedio.setNota02( input.nextDouble()) ;
        System.out.println("Ingresa la tercera nota: ");
        promedio.setNota03( input.nextDouble()) ;

        System.out.println(promedio.calcularPromedioEstudiante());
        */

        /*//Ejercicio03
        Ejercicio03 trabajador = new Ejercicio03();
        System.out.print("Ingresa las horas trabajadas: ");
        trabajador.setHorasTrabajadas(input.nextInt());

        System.out.println(trabajador.calcularSueldoPorHora());
        */
        
        /*//Ejercicio04
        Ejercicio04 tabla = new Ejercicio04();
        System.out.print("Ingrese en numero para la tabla de multiplicar: ");
        tabla.setNumero(input.nextInt());
        System.out.println("Tabla de multiplicar del numero " + tabla.getNumero());

        System.out.println(tabla.tablaDeMultiplicar());        
        */
        
        /*//Ejercicio05
        Ejercicio05 adivina = new Ejercicio05();
        System.out.println("El juego consiste en averiguar un número secreto de 100 posibles.");
        
        while (adivina.getNumero() != adivina.getNUMERO_MAGICO()) {
            System.out.print("Ingresa un numero: ");
            adivina.setNumero(input.nextInt());
            System.out.println(adivina.adivinarNumero(adivina.getNumero()));
        }        
        */

        /*//Ejercicio06
        Ejercicio06 pesoIdeal = new Ejercicio06();
        System.out.print("Ingrese su altura actual en cm: ");
        pesoIdeal.setAltuta(input.nextInt());
        System.out.println("1. IMC para hombre\n2. IMC para mujer");
        System.out.println("");
        pesoIdeal.setSexo(input.nextInt());

        switch (pesoIdeal.getSexo()) {
            case 1: System.out.println(pesoIdeal.imcHombre());
                break;
            case 2: System.out.println(pesoIdeal.imcMujer());
                break;
            default: System.out.println("Opcion invalida");
                break;
        }
        */

        input.close();

    }
}
