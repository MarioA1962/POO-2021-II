package PrimerCommit;

public class Ejecuta {
    public static void main(String[] args) {

        /*
        PrimerCommit.Auto auto1 = new PrimerCommit.Auto();

        auto1.id = 0;
        auto1.modelo = "deportivo";
        auto1.color = "morado";

        System.out.println(auto1);
        System.out.println("id: "+auto1.id+" modelo: "+auto1.modelo+" color: "+auto1.color);

        auto1.imprimeModeloColor();
        String idModelo1 = auto1.retornaIdModelo();
        System.out.println("imprimiendo id + modelo: "+idModelo1);
        System.out.println();

        PrimerCommit.Auto auto2 = new PrimerCommit.Auto();
        auto2.id = 1;
        auto2.modelo = "clasico";
        auto2.color = "verde";

        System.out.println(auto2);
        System.out.println("id: "+auto2.id+" modelo: "+auto2.modelo+" color: "+auto2.color);
        auto2.imprimeModeloColor();

         */

        Auto auto1 = new Auto();
        auto1.setId(0);
        auto1.setModelo("deportivo");
        auto1.setColor("morado");

        System.out.println(auto1);
        System.out.println("id: "+auto1.getId()+" modelo: "+auto1.getModelo()+" color: "+auto1.getColor());

        auto1.imprimeModeloColor();
        String idModelo1 = auto1.retornaIdModelo();
        System.out.println("imprimiendo id + modelo: "+idModelo1);
        System.out.println();

        Auto auto3 = new Auto(2,"lujoso","azul");
        System.out.println("id: "+auto3.getId()+" modelo: "+auto3.getModelo()+" color: "+auto3.getColor());


    }
}

