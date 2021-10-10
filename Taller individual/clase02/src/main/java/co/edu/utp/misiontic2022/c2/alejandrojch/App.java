package co.edu.utp.misiontic2022.c2.alejandrojch;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);

        /* EJercicio 1
        System.out.print("Ingrese su fecha de nacimiento: dd/mm/aaaa: ");
        var fecha = input.nextLine();
        var r_1 = NumeroSuerte(fecha);
        System.out.println(r_1);
        */

        /* Ejercicio 2
        System.out.print("Ingrese el valor del producto: ");
        var precio_unidad = input.nextInt();
        System.out.print("Ingrese la cantidad del producto vendido: ");
        var unidad_vendida = input.nextInt();
        System.out.print("Ingrese el porcentaje de IVA: ");
        var iva = input.nextInt();
        var r_2 = PrecioVenta(precio_unidad,unidad_vendida,iva);
        System.out.println(r_2);
        */

        /* Ejercicio 3
        System.out.print("Ingrese un número entero: ");
        var N = input.nextInt();
        System.out.print("Ingrese otro número entero para quitar cifras al anterior número: ");
        var m = input.nextInt();
        var r_3 = QuitaCifras(N,m);
        System.out.println(r_3);
        */

        /* Ejercicio 4
        System.out.print("Ingrese la velocidad en Km/hr: ");
        var kilometros= input.nextInt();
        var r_4 = CalcularKilometros_Hr_A_Metros_Sg(kilometros);
        System.out.println(r_4);
        */

        /* Ejercicio 5
        System.out.print("Ingrese el cateto opuesto: ");
        var c_opuesto= input.nextDouble();
        System.out.print("Ingrese el cateto adyacente: ");
        var c_adyacente = input.nextDouble();
        var r_5 = CalcularHipotenusa(c_opuesto,c_adyacente);
        System.out.println(r_5);
        */

        /* Ejercicio 6
        System.out.print("Ingrese un numero entero: ");
        var numero = input.nextInt();
        var r_6 = VerificarMultiplo10(numero);
        System.out.println(r_6);
        */

        /* Ejercicio 7
        System.out.print("Ingrese una letra para verificar si es mayusculas: ");
        var letra = input.nextLine();
        var r_7 = VerificarMayuscula(letra);
        System.out.println(r_7);
        */

        /* Ejercicio 8
        System.out.print("Ingrese un numero entero: ");
        var numero_1 = input.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        var numero_2 = input.nextInt();
        var r_8 = DivsionDeNumeros(numero_1,numero_2);
        System.out.println(r_8);
        */

        /* Ejercicio 9
        System.out.print("Ingrese un numero entero: ");
        var numero_1 = input.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        var numero_2 = input.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        var numero_3 = input.nextInt();
        var r_9 = CalcularNumeroMayor(numero_1,numero_2,numero_3);
        System.out.println(r_9);
        */

        /* Ejercicio 10
        System.out.print("Ingrese la hora: ");
        var H = input.nextInt();
        System.out.print("Ingrese los minutos: ");
        var M = input.nextInt();
        System.out.print("Ingrese los segundos: ");
        var S = input.nextInt();
        var r_10 = VerificarHora(H,M,S);
        System.out.println(r_10);
        */

        /* Ejercicio 11
        System.out.print("Ingrese el numero del mes: ");
        var mes = input.nextInt();
        var r_11 = ValidarMes(mes);
        System.out.println(r_11);
        */

        /* Ejercicio 12
        System.out.println("1-Ciclo con For\n2-Ciclo con While\n3-Ciclo con Do-While");
        System.out.print("Ingresa un numero para elegir el modo del ciclo: ");
        var opción = input.nextInt();
        var r_12 = ImprimirDel1Al100SinMultiplosDe3(opción);
        System.out.println(r_12);
        */

        /* Ejercicio 13
        System.out.println("1-Conversion de pesos colombianos a dolar\n2-Conversion de dolar a pesos colombianos");
        System.out.print("Ingresa el numero para la conversion deseada: ");
        var moneda = input.nextInt();
        System.out.print("Ingrese el valor a convertir: ");
        var valor = input.nextInt();
        var r_13 = CoversionDeDivisas(moneda,valor);
        System.out.println(r_13);
        */

        /* Ejercicio 14
        System.out.print("Ingrese un numero mayor que 1: ");
        var numero = input.nextInt();
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");  
        var r_14 = Fibonacci(numero);
        System.out.println(r_14);
        */

        input.close();
    }

    public static String NumeroSuerte(String fecha) { // Numero suerte

        var datos = fecha.split("/");
        var dia = Integer.valueOf(datos[0]);
        var mes = Integer.valueOf(datos[1]);
        var ano = Integer.valueOf(datos[2]);

        var suma = dia + mes + ano;
        var suerte = 0;
        while(suma != 0) {
            suerte += suma % 10;
            suma /= 10;
        }
        return "Su número de la suerte es: " + suerte;        
    }

    public static String PrecioVenta(Integer precio_unidad, Integer unidad_vendida, Integer iva) { // Calcula el precio 

        var precio = precio_unidad + (iva * precio_unidad / 100);
        var iva_producto = precio * unidad_vendida;

        return "El precio del producto es: " + iva_producto;
    }

    public static String QuitaCifras(Integer N, Integer m) { // quita cigras a un número

        var resultado = N / (int)Math.pow(10,m); 
        return "El número modificado es: " + resultado;
        
    }

    public static String CalcularKilometros_Hr_A_Metros_Sg(Integer velocidad) { // calcular de metros/h a metros/sg

        var multiplicacion = velocidad * 5;
        var division = multiplicacion / 18;

        return "Son " + division + " M/Sg";
    }

    public static String CalcularHipotenusa(Double opuesto, Double adyacente) { // calcular la hipotenusa de un triangulo

        var c_opuesto = Math.pow(opuesto,2);
        var c_adyacente = Math.pow(adyacente,2);
        var suma = c_adyacente + c_opuesto;
        var pitagoras = Math.sqrt(suma);

        return "La hipotenusa tiene una medida de: " + pitagoras;
    }

    public static String VerificarMultiplo10(Integer numero) { // verifica si el numero es multiplo de 10

        var verificar =numero %10 == 0 ? "Es multiplo de 10" : "No es multiplo de 10";

        return verificar;
    }

    public static String VerificarMayuscula(String letra) { // verifica si es un caracter  en mayuscula

        var verificar = letra == letra.toUpperCase() ? "Es un caracter en mayuscula" : "No es un caracter en mayuscula";

        return verificar;
    }

    public static String DivsionDeNumeros(Integer num_1, Integer num_2) { // Calcula la divion de dos numeros 

        if(num_2 == 0) {
            return "No se admite que el divisor sea cero";        
        } else {
            var resultado = num_1 / num_2;
            return "El resultado de la division es " + resultado;
        }
    }

    public static String CalcularNumeroMayor(Integer num_1, Integer num_2, Integer num_3) { // Calcula el numero mayor de 3 numeros
        
        if(num_1 > num_2 && num_1 > num_3) {
            return "El numero mas grande es el " + num_1;
        }
        else if(num_2 > num_1 && num_2 > num_3) {
            return "El numero mas grande es el " + num_2;
        }
        else if(num_3 > num_2 && num_3 > num_1) {
            return "El numero mas grande es el " + num_3;
        }
        return null;
    }

    public static String VerificarHora(Integer H,Integer M,Integer S) { // Verifica la hora

        var hora = H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60 ? "Hora introducida correcta" : "Hora introducida incorrecta";

        return hora;
    }

    public static String ValidarMes(Integer mes) { // Valida de cuantos dias es el mes ingresado

        if (mes < 1 || mes > 12) {
            return "Mes incorrecto";
        } else {
            switch(mes) {
                case 1: System.out.print("Enero");
                        break;
                case 2: System.out.print("Febrero");
                        break;
                case 3: System.out.print("Marzo");
                        break;
                case 4: System.out.print("Abril");
                        break;
                case 5: System.out.print("Mayo");
                        break;
                case 6: System.out.print("Junio");
                        break;
                case 7: System.out.print("Julio");
                        break;
                case 8: System.out.print("Agosto");
                        break;
                case 9: System.out.print("Septiembre");
                        break;
                case 10: System.out.print("Octubre");
                        break;
                case 11: System.out.print("Noviembre");
                        break;
                case 12: System.out.print("Diciembre");
                        break;
            }

            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                return " es un mes de 30 dias";
            }
            else if (mes == 2) {
                return " es un mes de 28 dias";
            } else {
                return " es un mes de 31 dias";
            }
        }
    }

    public static String ImprimirDel1Al100SinMultiplosDe3( Integer opcion) { // Imprime numeros del 1 al 10 sin los multiplos de 3
        var i = 0;
        if(opcion == 1) {
            for (i = 0; i < 100; i++) {
                if (i % 3 != 0) {
                    System.out.println(i);
                }
            }
            return "Ciclo con For";
        } 
        else if(opcion == 2) {
             i = 0;
            while (i < 100) {
               if (i % 3 != 0) {
                   System.out.println(i);
               }
               i++;
            }
            return "Ciclo con While";
        } 
        else if (opcion == 3) {
             i = 0;
             do {
                if (i % 3 != 0) {
                    System.out.println(i);
                }
                i++;
             } while ( i < 100);
             return "Ciclo con Do-While";
        } 
        else {
            return "Opcion invalida";
        }
    } 

    public static String CoversionDeDivisas(Integer moneda, Integer valor) { // Conversion de divisas

        if (moneda == 1) {
            // conversion de pesos colombianos a dolar
            var conversion = valor * 0.00026;
            return "Son " + conversion + " dolares";
        }
        else {
            // conversion de dolares a pesos colombianos
            var conversion = valor * 3834.74;
            return "Son " + conversion + " pesos colombianos";
        }
    }

    public static String Fibonacci( Integer numero) { // serie de fibonacci

        var fibonacci_01=1;
        var fibonacci_02=1;

        System.out.print(fibonacci_01 + " ");

        for(Integer i = 2; i <= numero; i++) {
            System.out.print(fibonacci_02 + " ");
            fibonacci_02 = fibonacci_01 + fibonacci_02;
            fibonacci_01 = fibonacci_02 - fibonacci_01;
        }
        return "";
    }

}

