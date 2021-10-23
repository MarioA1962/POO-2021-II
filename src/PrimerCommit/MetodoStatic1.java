package PrimerCommit;

public class MetodoStatic1 {
    static String Frase = "Buen dia, empezemos a sumar: ";
    String Frase1 = "Buen día, hora de multiplicar: ";
    public int Multi;
    public static int sumar(int n1, int n2){
        int suma = n1 + n2;
        System.out.println("numero 1: " + n1 + "," + "numero 2: " + n2);
        return suma;
    }
    public Integer multiplicar(int n1, int n2){
        int multi = n1*n2;
        System.out.println("numero 1: " + n1 + "," + "numero 2: " + n2);
        return multi;
    }

    public static void main(String[] args) {
        MetodoStatic1 multi1 = new MetodoStatic1();
        System.out.println(multi1.Frase1);
        System.out.println("Multiplicacion: " + multi1.multiplicar(3, 4));
        System.out.println();
        System.out.println(Frase);
        System.out.println("Suma: " + sumar(3, 4));
    }
}
