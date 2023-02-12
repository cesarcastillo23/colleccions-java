package co.com.alura;

import co.com.alura.model.Alumno;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;


public class Ejemplo14 {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("luis felipe","21");
        Alumno alumno2 = new Alumno("Juan Carlos","4");
        Alumno alumno3 = new Alumno("Mario Fernando","45");
        Alumno alumno4 = new Alumno("Jorge Alejandro","12");
        Alumno alumno5 = new Alumno("Carlos Andres","78");
        Alumno alumno6 = new Alumno("Nicolas Alejandro","32");
        Alumno alumno7 = new Alumno("Mauricion Antonio","52");
        Alumno alumno8 = new Alumno("Jorge Alejandro","54");

        Collection<Alumno> listaAlumnos= new HashSet<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        listaAlumnos.add(alumno8);

        Alumno alumnoNuevo =new Alumno("luis felipe","21");
        System.out.println(alumno1.equals(alumnoNuevo));
        System.out.println(listaAlumnos.contains(alumnoNuevo));

    }
}
