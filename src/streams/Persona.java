package streams;

public class Persona extends Object {
    private String nombre;
    private String domicilio;
    private int edad;

    private char genero;

    public Persona(String nombre, String domicilio, int edad,char genero) {
        this.setNombre(nombre);
        this.setDomicilio(domicilio);
        this.setEdad(edad);
        this.setGenero(genero);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre==null){
            System.out.println("Nombre inválido!!!");
        }else {
            this.nombre = nombre;
        }
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad<0){
            System.out.println("Edad invalida!!!");
        }else {
            this.edad = edad;
        }
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", edad=" + edad +
                ", genero=" + genero +
                '}';
    }


}