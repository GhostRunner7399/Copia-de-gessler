package Peru.org;

public class pagosContabilidad extends Pagos {
        private BENEFICIARIO beneficiario;
        private METODOPAGO metodoPago;
        private double monto;
        private String numeroFactura;

    public pagosContabilidad(Institucion institucion) {
        super(institucion);
    }

    public BENEFICIARIO getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(BENEFICIARIO beneficiario) {
        this.beneficiario = beneficiario;
    }

    public METODOPAGO getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(METODOPAGO metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
}
