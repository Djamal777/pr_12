package z_1;

public class Person {
    private String f;
    private String i;
    private String o;
    public Person(){
        this.f=null;
        this.i=null;
        this.o=null;
    }
    public Person(String f, String i, String o){
        this.f=f;
        this.i=i;
        this.o=o;
    }
    public void setF(String f) {
        this.f = f;
    }

    public void setI(String i) {
        this.i = i;
    }

    public void setO(String o) {
        this.o = o;
    }
    public String toString(){
        if(i==null){
            return f+" ?."+o.charAt(0)+".";
        }
        else if(o==null){
            return f+" "+i.charAt(0)+".?.";
        }
        return f+" "+i.charAt(0)+"."+o.charAt(0)+".";
    }
}
