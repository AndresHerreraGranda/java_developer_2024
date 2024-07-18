package negocio;

import java.util.TreeSet;

public interface ServicioClientes {
    public boolean agregarCliente(Cliente cliente);
    public boolean eliminarCliente(int numero);
    public Cliente consultarCliente(int numero);
    public Cliente buscarClientePorRFC(String rfc);
}
