package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PruebaStreams {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Zaira","EDOMEX",27,'F'));
        personas.add(new Persona("Carolina","EDOMEX",18,'F'));
        personas.add(new Persona("Victor","CDMX",30,'M'));
        personas.add(new Persona("Javier","CDMX",32,'M'));
        personas.add(new Persona("Edgar","NL",28,'M'));
        personas.add(new Persona("Daniela","SON",36,'F'));
        personas.add(new Persona("Luz","PUE",25,'F'));
        personas.add(new Persona("Ernesto","OAX",13,'M'));
        personas.add(new Persona("Alicia","QRO",29,'F'));
        personas.add(new Persona("Jorge","VER",41,'M'));
        // System.out.println(personas);
        // Stream es una fila de objetos los cuales son procesados en linea
        personas.stream().forEach(p->System.out.println(p));
        System.out.println("=".repeat(100));

        // Imprimir todas la personas mayores de 30 años modo iterativo
        for(Persona p:personas){
            if(p.getEdad()>30){
                System.out.println(p);
            }
        }
        System.out.println("=".repeat(100));

        // Imprimir todas la personas mayores de 30 años modo streams
//        personas.stream().filter(persona->persona.getEdad()>30).forEach(p->System.out.println(p));
        personas.stream().filter(persona->persona.getEdad()>30).forEach(System.out::println);
        System.out.println("=".repeat(100));
        personas.stream().sorted().forEach(System.out::println);

        System.out.println("=".repeat(100));
        personas.stream()
                .map(persona->persona.getNombre())
                .filter(nombre->nombre.startsWith("E"))
                .forEach(n->System.out.println(n));
    }
}