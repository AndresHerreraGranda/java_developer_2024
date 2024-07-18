package negocio;

public class CuentaDeAhorro extends Cuenta{
    private Double tasaInteresMensual;
    public CuentaDeAhorro(int numero, String fechaApertura, Double saldo, String fechaCancelacion, Double tasaInteresMensual) {
        super(numero, fechaApertura, saldo, fechaCancelacion);
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public Double calcularIntereses(){
        return getSaldo()*tasaInteresMensual;
    }

    @Override
    public String toString() {
        return "CuentaDeAhorro{" +
                "tasaInteresMensual=" + tasaInteresMensual +
                '}';
    }
}
