package PrimerCommit;

import java.util.Scanner;

public class MetodoStatic2 {
    public String l;
    public int numero;
    public int base;
    public static Integer convertir_a_base10(String num, int base){
        int cont = 0;
        for(int i=0; i<num.length(); i++){
            cont += Integer.parseInt(String.valueOf(num.charAt(i)))* Math.pow(base, num.length() - i - 1);
        }
        System.out.println("Numero ingresado convertido a base 10: ");
        return cont;
    }
    public String convertir_a_cualquier_base(int num, int base){
        l = "";
        while(num!=0){
            l = String.valueOf(num%base) + l;
            num = num/base;
        }
        System.out.println("Numero convertido a base " + base + ": ");
        return l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MetodoStatic2 obj1 = new MetodoStatic2();
        System.out.println("Para convertir un numero a base 10, ingrese el numero con su respectiva base");
        System.out.printf("Ingrese base del numero(2<=base<=10): ");
        int base1 = sc.nextInt();
        System.out.printf("Ingrese numero: ");
        String Num1 = sc.next();
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("Para convertir un numero en base 10 a cualquier base, ingrese la base a la que se quiere llevar y el numero");
        System.out.printf("Ingrese base a la que se quiere tranformar: ");
        int base2 = sc.nextInt();
        System.out.printf("Ingrese el numero porfavor: ");
        int Num2 = sc.nextInt();
        obj1.numero = Num2;
        obj1.base = base2;
        System.out.println(convertir_a_base10(Num1, base1));
        System.out.println(obj1.convertir_a_cualquier_base(obj1.numero, obj1.base));
    }
}
