package z_3;

public class Shirt {
    private String num;
    private String name;
    private String color;
    private String size;

    public void setNum(String num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String toString(){
        return "Number: "+num+"\nName: "+name+"\nColor: "+color+"\nSize: "+size;
    }
}
