package z_1;

public class Main {
    public static void main(String[] args){
        String f,i,o;
        f="Заирбеков";
        i="Джамал";
        o="Магомедджамильевич";
        Person p=new Person(f,i,o);
        System.out.println(p);
        Person him=new Person();
        him.setF("Иванов");
        him.setI("Штырк");
        System.out.println(him);
    }
}
