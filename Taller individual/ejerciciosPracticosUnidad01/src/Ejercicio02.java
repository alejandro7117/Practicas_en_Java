/** 
 *  Realizar un programa que realice el promedio de las notas de un alumno,
 *  para ello el programa va a tener que solicitar el nombre del alumno y las
 *  notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
 *  3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
 *  “Reprobado” . Requisitos: Las notas que se ingresan pueden tener
 *  decimales.
 */

public class Ejercicio02 {

    private String nombre;
    private Double nota01;
    private Double nota02;
    private Double nota03;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNota01() {
        return nota01;
    }

    public void setNota01(Double nota01) {
        this.nota01 = nota01;
    }

    public Double getNota02() {
        return nota02;
    }

    public void setNota02(Double nota02) {
        this.nota02 = nota02;
    }

    public Double getNota03() {
        return nota03;
    }

    public void setNota03(Double nota03) {
        this.nota03 = nota03;
    }

    public String calcularPromedioEstudiante() {

        var promedio = Math.round(((getNota01() + getNota02() + getNota03()) / 3)*100.0)/100.0;
        //var promedio1 = Math.round(promedio*100.0)/100.0;
        String aprobacion = (promedio >= 3.0) ? "Aprobo" : "Reprobo";
        return "El estudiante " + getNombre() + " " + aprobacion + " con un promedio de " + promedio; 
    }

    

    

    
}
