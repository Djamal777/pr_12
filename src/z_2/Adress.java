package z_2;

import java.util.StringTokenizer;

public class Adress {
    private String adress;
    private String strana, region, gorod, ulica, dom, korpus, kvartira;
    public Adress(String adr){
        adress=adr;
    }
    public void splitt() {
        String mas[] = adress.split(",");
        strana = mas[0];
        region = mas[1];
        gorod = mas[2];
        ulica = mas[3];
        dom = mas[4];
        korpus = mas[5];
        kvartira = mas[6];
    }
    public void hard_split(){
        StringTokenizer str=new StringTokenizer(adress,",.-;");
        strana = str.nextToken();
        region = str.nextToken();
        gorod = str.nextToken();
        ulica = str.nextToken();
        dom = str.nextToken();
        korpus = str.nextToken();
        kvartira = str.nextToken();
    }
    public String toString(){
        return strana+" "+region+" "+gorod+" "+ ulica+" "+dom+" "+korpus+" "+kvartira;
    }
}
