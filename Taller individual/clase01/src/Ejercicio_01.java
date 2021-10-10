public class Ejercicio_01 {
    public static void main(String[] args) throws Exception {
        String name,resultado;
        
        name = "Alejandro Jimenez";
        resultado = saludo(name);
        System.out.println(resultado);
    }
    public static String saludo(String name) {
        return "Hola " + name;
    }
}
