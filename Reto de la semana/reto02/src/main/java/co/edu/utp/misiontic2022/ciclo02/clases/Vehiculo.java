package co.edu.utp.misiontic2022.ciclo02.clases;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private Double precioBase;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, Double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public abstract Double calcularPrecio();

    public abstract Double calcularPorcentajeImpuesto();

    public Double calcularDescuento(Date fecha) {
        // Extrae el mes de la fecha actual.
        // Para comparar use las constantes Calendar.JULY o Calendar.JUNE
        var cal = GregorianCalendar.getInstance();
        cal.setTime(fecha);
        var mes = cal.get(Calendar.MONTH);
        Double descuento = 0d;
        if (mes == Calendar.MAY & marca.equals("Mazda")) {
            descuento = calcularPrecio() * 0.1;
        }
        if (mes == Calendar.JUNE & marca.equals("BMW")) {
            if (this instanceof Automovil) {
                descuento = calcularPrecio() * 0.05;
            } else {
                descuento = calcularPrecio() * 0.1;
            }
        }

        return descuento;
    }
}