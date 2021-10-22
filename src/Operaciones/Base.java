package Operaciones;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        int num;
        String vacio = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese numero por favor: ");
        num = sc.nextInt();

        while(num !=0){
            vacio = num%9+"" + vacio;
            num = num/9;
        }
        int resultado = Integer.parseInt(vacio);
        System.out.println(resultado);
    }
}
