package Peru.org;

public class pagoTelef extends Pagos {

    private Cuenta tipoCuenta;
    private String numeroCuenta;
    private double saldo;

    public pagoTelef(Institucion institucion, Cuenta tipoCuenta, String numeroCuenta, double saldoInicial) {
        super(institucion);
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(Cuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
}
