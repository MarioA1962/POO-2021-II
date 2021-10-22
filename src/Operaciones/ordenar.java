package Operaciones;

public class ordenar {
    public static void main(String[] args) {
        int [] numeros = {20, 15, 14, 16, 19, 8, 5};
        int count = numeros.length;
        for(int i=0; i<count-1; i++){
            int p = numeros[i];
            for(int j=i+1; j<count; j++){
                if(numeros[i]>numeros[j]){
                    numeros[i] = numeros[j];
                    numeros[j] = p;
                    p = numeros[i];
                }
            }
        }
        for(int o: numeros){
            System.out.println(o);
        }
    }

}
