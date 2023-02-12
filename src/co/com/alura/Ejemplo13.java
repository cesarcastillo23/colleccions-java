package co.com.alura;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;


public class Ejemplo13 {
    public static void main(String[] args) {

        String alumno1 = "Luis Felipe";
        String alumno2 = "Juan Carlos";
        String alumno3 = "Mario Fernando";
        String alumno4 = "Jorge Alejandro";
        String alumno5 = "Carlos Andres";
        String alumno6 = "Nicolas Alejandro";
        String alumno7 = "Mauricion Antonio";
        String alumno8 = "Jorge Alejandro";

        Collection<String> listaAlumnos= new HashSet<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        listaAlumnos.add(alumno8);

        listaAlumnos.forEach(alumno ->{
            System.out.println(alumno);
        });

        boolean valida= listaAlumnos.contains("Luis Felipe");
        String max = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();

        System.out.println(max.length());

        listaAlumnos.removeIf(alumno-> "Luis Felipe".equalsIgnoreCase(alumno));




    }
}
