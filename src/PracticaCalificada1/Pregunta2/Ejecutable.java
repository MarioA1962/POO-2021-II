package PracticaCalificada1.Pregunta2;
import java.util.Scanner;
public class Ejecutable {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int num;
        System.out.printf("Ingrese numero de libros mayor que 5: ");
        num = Entrada.nextInt();
        Libro[] lista_de_libros = new Libro[num];
        while (num<2) {
            System.out.printf("ERROR, ingrese cantidad de libros nuevamente: ");
            num = Entrada.nextInt();
        }
        Libro lib = new Libro();
        for(int i = 0; i<num; i++){
            System.out.println("Ingresando datos del libro: " + (1+i));
            System.out.printf("Ingresar titulo: ");
            String titulo = Entrada.next();
            System.out.printf("Ingresar autor: ");
            String autor = Entrada.next();
            System.out.printf("Ingresar ISNB: ");
            int ISNB = Entrada.nextInt();
            System.out.printf("Ingresar N_paginas: ");
            int N_paginas = Entrada.nextInt();
            System.out.printf("Ingresar edicion: ");
            int edicion = Entrada.nextInt();
            System.out.printf("Ingresar Editorial: ");
            String Editorial = Entrada.next();
            System.out.printf("Ingresar Fecha: ");
            String Fecha = Entrada.next();
            lib.setTitulo(titulo);
            lib.setAutor(autor);
            lib.setISNB(ISNB);
            lib.setN_paginas(N_paginas);
            lib.setEdicion(edicion);
            lib.setEditorial(Editorial);
            lib.setFecha(Fecha);
            lista_de_libros[i] = lib;
            lib = new Libro();
        }
        System.out.println("_____________________________________");
        System.out.println("Validando la repetición de los numeros IGNB: ");
        int n = 0;
        for(int j=0; j<num-1; j++){
            if(lista_de_libros[j].getISNB() == lista_de_libros[j+1].getISNB()){
                n += 1;
            }
        }
        if (n!=0){
            System.out.println("Existen libros con el mismo ISBN");
            System.out.println("Libros que se repiten: " + n);
        }else{
            System.out.println("No existen libros con el mismo ISBN");
        }
        for(Libro i: lista_de_libros){
            System.out.println("Validando el IGNB del libro: " + i.getTitulo());
            i.validaIsbn();
            System.out.println("-----------------------------------");
            System.out.println("Imprimiendo datos");
            i.ImprimirDetalleLibro();
        }
    }
}
