package PracticaCalificada1.Pregunta3;

import java.util.Scanner;

public class Multiplicacion_rusa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Cadenaseparada;
        System.out.printf("Ingrese cadena: ");
        String cadena = sc.nextLine();
        cadena = cadena.replace(">", "-");
        Cadenaseparada = cadena.split("-");
        int[][] matriz;
        int numero = 0;
        matriz = new int[Cadenaseparada.length / 2][2];
        for(int i = 0; i< Cadenaseparada.length/2; i++){
            for(int j = 0; j<2; j++){
                matriz[i][j] = Integer.valueOf(Cadenaseparada[numero]);
                numero += 1;
            }
        }
        int cont = 0;
        for(int p = 0; p< matriz.length; p++){
            int mult1 = matriz[p][0];
            int mult2 = matriz[p][1];
            while(matriz[p][0]>1){
                if(matriz[p][0]%2 !=0){
                    cont += matriz[p][1];
                    matriz[p][0] = matriz[p][0]/2;
                    matriz[p][1] = matriz[p][1]*2;
                }else{
                    matriz[p][0] = matriz[p][0]/2;
                    matriz[p][1] = matriz[p][1]*2;
                }
            }
            cont += matriz[p][1];
            System.out.println("Multiplicador: " + String.valueOf(mult1) + ", " + "Multiplicando: " + String.valueOf(mult2) + ", " + "Resultado: " + (cont));
            cont = 0;
        }
    }
}
