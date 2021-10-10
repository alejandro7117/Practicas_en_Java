package co.edu.utp.misiontic2022.ciclo02.clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reserva {
    private Date fecha;
    private String cliente;
    private List <Vehiculo> vehiculos;
    
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    public Reserva() {
    }
    
    public Reserva(Date fecha, String cliente, List<Vehiculo> vehiculos) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.vehiculos = new ArrayList<Vehiculo>();
    }

    public void adicionarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }
    public Integer calcularCantidadVehiculos() {
    return this.vehiculos.size();
    }
    public Double calcularSubtotal() {
        Double sub_total = 0d;
        for (Vehiculo vehiculo : vehiculos) {
            sub_total += vehiculo.calcularPrecio();
        }
    return sub_total;
    }
    public Double calcularDescuentos() {
        Double descuento = 0d;
        for (Vehiculo vehiculo : vehiculos) {
            descuento += vehiculo.calcularDescuento(fecha);
        }
    return descuento;
    }
    public Double calcularImpuestos() {
        Double impuesto = 0d;
        for (Vehiculo vehiculo : vehiculos) {
            impuesto += (vehiculo.calcularPrecio() - vehiculo.calcularDescuento(fecha)) * vehiculo.calcularPorcentajeImpuesto();
        }
    return impuesto;
    }
    public Double calcularTotal() {
    return calcularSubtotal()-calcularDescuentos()+calcularImpuestos();
    }
   }
   