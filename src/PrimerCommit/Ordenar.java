package PrimerCommit;

public class Ordenar {
    public static void main(String[] args) {
        int[] lista = {18, 7, 4, 9, 8, 15, 12};
        int total = lista.length;
        for(int i=0; i< total-1; i++){
            for(int j=0; j< total-1; j++){
                if(lista[j]>lista[j+1]){
                    int p = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = p;

                }
            }

        }
        for(int i=0; i< total; i++){
            System.out.println(lista[i]);
        }
    }
}