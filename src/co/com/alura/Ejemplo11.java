package co.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// TODO:
public class Ejemplo11 {
    public static void main(String[] args) {
        String alumno1 = "Luis Felipe";
        String alumno2 = "Juan Carlos";
        String alumno3 = "Mario Fernando";
        String alumno4 = "Jorge Alejandro";
        String alumno5 = "Carlos Andres";
        String alumno6 = "Nicolas Alejandro";
        String alumno7 = "Jorge Alejandro";

        Set<String> listaAlumnos= new HashSet<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);

        for(String alumno:listaAlumnos){
            System.out.println(alumno);
        }




    }
}
