import negocio.Cliente;
import negocio.Cuenta;
import negocio.CuentaDeAhorro;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        CuentaDeAhorro cuentaDeAhorro = new CuentaDeAhorro(1, "2024", 1000.0, "2025", 0.12);
        ArrayList<Cuenta> cuentas = new ArrayList<>(Arrays.asList(cuentaDeAhorro));
        Cliente cliente = new Cliente(1, "Andres","987654321", "123456",cuentas, "1998", "Calle 1", 123, "Colonia 1", "Estado 1", 12345);
        System.out.println(cliente.toString());
    }
}