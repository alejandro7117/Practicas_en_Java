package co.edu.utp.misiontic2022.ciclo02.clases;

public class Automovil extends Vehiculo {
    private TipoTransmision transmision;
    private Boolean vidriosElectricos;
    private Boolean aireAcondicionado;

    public TipoTransmision getTransmision() {
        return transmision;
    }

    public void setTransmision(TipoTransmision transmision) {
        this.transmision = transmision;
    }

    public Boolean getVidriosElectricos() {
        return vidriosElectricos;
    }

    public void setVidriosElectricos(Boolean vidriosElectricos) {
        this.vidriosElectricos = vidriosElectricos;
    }

    public Boolean getAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(Boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public Automovil(String marca, String modelo, Double precioBase, TipoTransmision transmision,
            Boolean vidriosElectricos, Boolean aireAcondicionado) {
        super(marca, modelo, precioBase);
        this.transmision = transmision;
        this.vidriosElectricos = vidriosElectricos;
        this.aireAcondicionado = aireAcondicionado;
    }

    public Double calcularPrecio() {
        Double precio_Base = getPrecioBase();
        if (transmision == TipoTransmision.AUTOMATICA) {
            precio_Base += getPrecioBase() * 0.07;
        }
        if (vidriosElectricos == true) {
            precio_Base += 300_000d;
        }
        if (aireAcondicionado == true) {
            precio_Base += 2_500_000d;
        }
        return precio_Base;
    }

    public Double calcularPorcentajeImpuesto() {
        Double impuesto = 0d;
        if (calcularPrecio() > 80_000_000d) {
            impuesto =  0.19;
        }
        return impuesto;
    }
}
