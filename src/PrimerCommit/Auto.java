package PrimerCommit;

public class Auto {
    private int id;
    private String modelo;
    private String color;

    void imprimeModeloColor(){
        System.out.println("Imprimiendo modelo y color: "+modelo+"-"+color);
    }

    String retornaIdModelo(){
        //System.out.println("id + modelo: "+id+"-"+modelo);
        return id+"-"+modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Auto(){
    }

    public Auto(int id, String modelo, String color) {
        this.id = id;
        this.modelo = modelo;
        this.color = color;
    }
}

