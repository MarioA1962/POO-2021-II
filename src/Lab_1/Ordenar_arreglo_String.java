package Lab_1;

import java.util.Arrays;

public class Ordenar_arreglo_String {
    public static void main(String[] args) {
        String[] paises = {"Peru", "Ecuador", "Chile", "Bolivia", "Argentina", "Uruguay"};
        int count = paises.length;

        /*  Metodo 1

        */
        for(int i=0; i<count-1; i++ ){
            for(int j=i+1; j<count; j++){
                if(paises[i].compareTo(paises[j])>0){
                    String aux = paises[i];
                    paises[i] = paises[j];
                    paises[j] = aux;

                }
            }
        }
        /* Metodo 2
        Arrays.sort(paises);
        */
        for(String p: paises){
            System.out.println(p);
        }
    }
}
