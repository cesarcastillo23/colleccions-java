package co.com.alura;

import java.util.ArrayList;

public class Ejemplo1 {

    // TODO: https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
    // TODO: https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Collection.html
    public static void main(String[] args) {
        String variable1="ejemplo1";
        String variable2="ejemplo2";
        String variable3="ejemplo3";
        String variable4="ejemplo4";


        ArrayList<String >lista =new ArrayList<>();
        lista.add(variable1);
        lista.add(variable2);
        lista.add(variable3);
        lista.add(variable4);
        System.out.println(lista);

        lista.remove(0);
        //modificar
        lista.set(0,"hola");

        System.out.println(lista.size());

    }
}