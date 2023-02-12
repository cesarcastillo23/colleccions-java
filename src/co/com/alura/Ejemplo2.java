package co.com.alura;

import java.util.ArrayList;

public class Ejemplo2 {
    public static void main(String[] args) {
        String variable1="Clase1";
        String variable2="Clase2";
        String variable3="Clase3";
        String variable4="Clase4";


        ArrayList<String > listaString =new ArrayList<>();
        listaString.add(variable1);
        listaString.add(variable2);
        listaString.add(variable3);
        listaString.add(variable4);
        System.out.println(listaString);

        //modificarlistaString.set(0,"hola");

        System.out.println(listaString.size());

        for(int i=0;i< listaString.size();i++){
            System.out.println(listaString.get(i));
        }

        System.out.println("--------------------------------- ");
        for(String clase :listaString){
            System.out.println(clase);
        }
    }
}
