package PrimerCommit;
class Temp{
    private int x;
    private  int y;
    Temp(){
        super();
        System.out.println("Constructor por defecto");
    }
    Temp(int x){
        System.out.println(x);
    }
    Temp(int x, int y){
        System.out.println(x * y);
    }
    public static void main(String[] args) {
        Temp r = new Temp(2, 3);
        Temp p = new Temp(2);
        Temp s = new Temp();
    }
}
