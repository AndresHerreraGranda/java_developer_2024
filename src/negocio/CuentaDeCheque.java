package negocio;

public class CuentaDeCheque extends Cuenta {

    private Double costoDeManejoMensual;

    public CuentaDeCheque(int numero, String fechaApertura, Double saldo, String fechaCancelacion, Double costoDeManejoMensual) {
        super(numero, fechaApertura, saldo, fechaCancelacion);
        this.costoDeManejoMensual = costoDeManejoMensual;
    }

    @Override
    public String toString() {
        return "CuentaDeCheque{" +
                "costoDeManejoMensual=" + costoDeManejoMensual +
                '}';
    }
}
