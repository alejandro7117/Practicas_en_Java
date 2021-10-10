/** 
 * Realiza un programa que solicite el sexo (H/M) y la altura (cm) al usuario y
 * que calcule el peso ideal. 
 * ° peso ideal mujeres = altura - 120 
 * ° peso ideal hombres = altura - 110
 */

public class Ejercicio06 {

    private Integer sexo;
    private Integer altuta;

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public Integer getAltuta() {
        return altuta;
    }

    public void setAltuta(Integer altuta) {
        this.altuta = altuta;
    }

    public String imcHombre() {
        Integer imc = getAltuta() - 110;
        return "El peso ideal es " + imc;
    }
    
    public String imcMujer() {
        Integer imc = getAltuta() - 120;
        return "El peso ideal es " + imc;
    }
}
