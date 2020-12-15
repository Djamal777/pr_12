package z_2;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        String adress="Россия,Чечня,Грозный,Гамзатова,44,а,66";
        Adress adr=new Adress(adress);
        adr.splitt();
        System.out.println(adr);
        String adress2="Россия,Чечня;Грозный-Гамзатова.44;а-66";
        Adress adr2=new Adress(adress2);
        adr2.hard_split();
        System.out.println(adr2);
    }
}
