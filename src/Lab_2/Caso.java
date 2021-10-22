package Lab_2;
public class Caso {
    private String l;
    private int cont;
    public Integer convertir_a_base10(String num, int base){
        cont = 0;
        for(int i=0; i<num.length(); i++){
            cont += Integer.parseInt(String.valueOf(num.charAt(i)))* Math.pow(base, num.length() - i - 1);
        }
        return cont;
    }
    public String convertir_a_base9(int num){
        l = "";
        while(num!=0){
            l = String.valueOf(num%9) + l;
            num = num/9;
        }
        return l;
    }
}
