package negocio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.TreeSet;

public class Banco implements ServicioClientes{
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cliente> clientes;

    public Banco(String nombre, Domicilio domicilio, String rfc, String telefono, ArrayList<Cliente> clientes) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.clientes = clientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banco banco = (Banco) o;
        return Objects.equals(nombre, banco.nombre) && Objects.equals(domicilio, banco.domicilio) && Objects.equals(rfc, banco.rfc) && Objects.equals(telefono, banco.telefono) && Objects.equals(clientes, banco.clientes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, domicilio, rfc, telefono, clientes);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", domicilio=" + domicilio +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                ", clientes=" + clientes +
                '}';
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        Cliente c = consultarCliente(cliente.getNum());
        if(c == null){
            clientes.add(cliente);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarCliente(int numero) {
        Cliente c = consultarCliente(numero);
        if(c != null){
            clientes.remove(c);
            return true;
        }
        return false;
    }

    @Override
    public Cliente consultarCliente(int numero) {
        for(Cliente c: clientes){
            if(c.getNum() == numero){
                return c;
            }
        }
        return null;
    }


    @Override
    public Cliente buscarClientePorRFC(String rfc) {
        for(Cliente c: clientes){
            if(c.getRfc().equals(rfc)){
                return c;
            }
        }
        return null;
    }
}
