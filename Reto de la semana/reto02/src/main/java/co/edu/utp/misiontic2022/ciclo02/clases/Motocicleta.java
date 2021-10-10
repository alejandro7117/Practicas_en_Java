package co.edu.utp.misiontic2022.ciclo02.clases;

public class Motocicleta extends Vehiculo {
    private Integer cilindraje;
    
    public Integer getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(Integer cilindraje) {
        this.cilindraje = cilindraje;
    }

    public Motocicleta(String marca, String modelo, Double precioBase, Integer cilindraje) {
        super(marca, modelo, precioBase);
        this.cilindraje = cilindraje;
    }
    public Double calcularPrecio() {
        Double precio_base = getPrecioBase();
        if (cilindraje >= 150 & cilindraje <= 300) {
            precio_base += 400_000d;
        }
        else if (cilindraje >= 301 & cilindraje <= 600) {
            precio_base += 800_000d;
        }
        else if (cilindraje > 600) {
            precio_base += 1_200_000d;
        }
    return precio_base;
    }
    public Double calcularPorcentajeImpuesto() {
        Double impuesto = 0d;
        if (calcularPrecio() > 6_100_000d) {
            impuesto = 0.19;
        }
    return impuesto;
    }
   }
   
