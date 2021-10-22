package Lab_2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejecuta_Caso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------------------------");
        System.out.printf("Ingrese base del primer numero(2<=base<=10): ");
        int base1 = sc.nextInt();
        System.out.printf("Ingrese primer numero: ");
        String Num1 = sc.next();
        System.out.println("------------------------------------------------------------");
        System.out.printf("Ingrese base del segundo numero(2<=base<=10): ");
        int base2 = sc.nextInt();
        System.out.printf("Ingrese segundo numero: ");
        String Num2 = sc.next();
        System.out.println("------------------------------------------------------------");
        System.out.println("Que operacion desea realizar?");
        int p = 0;
        Caso cas1 = new Caso();
        Caso cas2 = new Caso();
        Caso cas3 = new Caso();
        while(p<3){
            System.out.println("Eliga opcion: ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Salir");
            System.out.println("");
            System.out.printf("Ingrese opcion porfavor: ");
            p = sc.nextInt();
            if(p==1){
                int Suma = cas1.convertir_a_base10(Num1, base1) + cas1.convertir_a_base10(Num2, base2);
                System.out.println("La suma en base 9 es: " + cas3.convertir_a_base9(Suma));
            }
            if(p==2){
                System.out.println("1. Restar primer numero menos segundo numero");
                System.out.println("2. Restar segundo numero menos primer numero");
                System.out.printf("Eliga opcion:" );
                int r = sc.nextInt();
                if(r==1){
                    int Resta = cas1.convertir_a_base10(Num1, base1) - cas2.convertir_a_base10(Num2, base2);
                    if(Resta<0){
                        int Cambio = Resta*(-1);
                        System.out.println("La resta del primer numero menos el segundo numero en base 9 es: " + "-" + cas3.convertir_a_base9(Cambio));

                    }else{
                        System.out.println("La resta del primer numero menos el segundo numero en base 9 es: " + cas3.convertir_a_base9(Resta));
                    }
                }
                if(r==2){
                    int Resta = cas2.convertir_a_base10(Num2, base2) - cas1.convertir_a_base10(Num1, base1);
                    if(Resta<0){
                        int Cambio = Resta*(-1);
                        System.out.println("La resta del segundo numero menos el primer numero en base 9 es: " + "-" + cas3.convertir_a_base9(Cambio));

                    }else{
                        System.out.println("La resta del segundo numero menos el primer numero en base 9 es: " + cas3.convertir_a_base9(Resta));
                    }
                }
            }
        }
    }
}

