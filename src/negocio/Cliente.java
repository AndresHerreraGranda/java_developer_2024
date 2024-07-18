package negocio;

import java.util.ArrayList;
import java.util.Objects;

public class Cliente implements ServicioCuentas {
    private int num;
    private String  nombre;
    private final Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cuenta> cuentas;
    private String fechaNacimiento;


    public Cliente(int num, String nombre, Domicilio domicilio, String rfc, String telefono, ArrayList<Cuenta> cuentas, String fechaNacimiento) {
        this.num = num;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.cuentas = cuentas;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Cliente(int num,
                   String nombre,
                   String rfc,
                   String telefono,
                   ArrayList<Cuenta> cuentas,
                   String fechaNacimiento,
                   String calle,
                   int numero,
                   String colonia,
                   String estado,
                   int codigoPostal) {
        this.num = num;
        this.nombre = nombre;
        this.domicilio = new Domicilio(calle, numero, colonia, estado, codigoPostal);
        this.rfc = rfc;
        this.telefono = telefono;
        this.cuentas = cuentas;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "num=" + num +
                ", nombre='" + nombre + '\'' +
                ", domicilio=" + domicilio +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cuenta=" + cuentas +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return num == cliente.num && Objects.equals(nombre, cliente.nombre) && Objects.equals(domicilio, cliente.domicilio) && Objects.equals(rfc, cliente.rfc) && Objects.equals(telefono, cliente.telefono) && Objects.equals(fechaNacimiento, cliente.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, nombre, domicilio, rfc, telefono, fechaNacimiento);
    }

    @Override
    public boolean agregarCuenta(Cuenta cuenta) {
        for (Cuenta c : cuentas) {
            if (c.getNumero() == cuenta.getNumero()) {
                return false;
            }
        }
        cuentas.add(cuenta);
        return true;
    }

    @Override
    public boolean cancelarCuenta(int numero) {
        for (Cuenta c : cuentas) {
            if (c.getNumero() == numero) {
                cuentas.remove(c);
                return true;
            }
        }
        return false;
    }

    @Override
    public void abonarCuenta(int numero, double abono) {
        for (Cuenta c : cuentas) {
            if (c.getNumero() == numero) {
                c.abono(abono);
            }
        }
    }

    @Override
    public void retirar(int numero, double retiro) {
        for (Cuenta c : cuentas) {
            if (c.getNumero() == numero) {
                c.retiro(retiro);
            }
        }
    }

    @Override
    public ArrayList<Cuenta> obtenerCuentas() {
        return cuentas;
    }
}
