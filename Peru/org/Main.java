package Peru.org;

public class Main {
    public static void main(String[] args) {
        // Institucion
        Institucion institucion = Institucion.BANCO1;

        // BENEFICIARIO
        BENEFICIARIO beneficiario = BENEFICIARIO.EMPLEADO;

        // pagosContabilidad
        pagosContabilidad pagoContable = new pagosContabilidad(institucion);
        pagoContable.setBeneficiario(beneficiario);
        pagoContable.setMetodoPago(METODOPAGO.DOLAR);
        pagoContable.setMonto(1500.00);
        pagoContable.setNumeroFactura("FAC123456");

        //pagoTelef
        pagoTelef pagoTelefono = new pagoTelef(institucion, Cuenta.Corriente, "1888889", 1000.00);

        // Pago contable
        System.out.println("Pago Contable:");
        System.out.println("Beneficiario: " + pagoContable.getBeneficiario());
        System.out.println("Método de Pago: " + pagoContable.getMetodoPago());
        System.out.println("Monto: " + pagoContable.getMonto());
        System.out.println("Número de Factura: " + pagoContable.getNumeroFactura());

        //pago telefónico
        System.out.println("Pago Telefónico:");
        System.out.println("Tipo de Cuenta: " + pagoTelefono.getTipoCuenta());
        System.out.println("Número de Cuenta: " + pagoTelefono.getNumeroCuenta());
        System.out.println("Saldo: " + pagoTelefono.getSaldo());
    }
}
