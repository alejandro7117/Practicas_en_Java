package co.edu.utp.misiontic2022.ciclo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import co.edu.utp.misiontic2022.ciclo02.clases.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Date fecha = null;
        try{
            fecha = new SimpleDateFormat("dd/MM/yyyy").parse("10/06/2021");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        var reserva = new Reserva(fecha, "Cesar Díaz", null);
        reserva.adicionarVehiculo(new Automovil("Mazda", "R8", 150_000_000d, TipoTransmision.MANUAL, true, true));
        reserva.adicionarVehiculo(new Motocicleta("BMW", "S 1000 RR", 60_000_000d,1000));
        System.out.printf("Cliente: %s %n", reserva.getCliente());
        System.out.printf("Numero vehiculos: %d %n", reserva.calcularCantidadVehiculos());
        System.out.printf("Subtotal: %,.2f %n", reserva.calcularSubtotal());
        System.out.printf("Descuento: %,.2f %n", reserva.calcularDescuentos());
        System.out.printf("Impuestos: %,.2f %n", reserva.calcularImpuestos());
        System.out.printf("Total: %,.2f %n", reserva.calcularTotal());
    }
}
