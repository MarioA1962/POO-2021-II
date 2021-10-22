package Operaciones;

public class Bucles {
    public static void main(String[] args) {
        int[] lista= new int[] {0, 5, 8, 9, 6, 15, 19};
        int i = 0;
        while (i<lista.length ){
            System.out.println(lista[i]);
            i = i + 1;
        }
        System.out.println();
        for (int j:lista){
            System.out.println(j);
        }
        System.out.println();
        for (int j=0; j< lista.length; j++){
            System.out.println(lista[j]);
        }
    }
}