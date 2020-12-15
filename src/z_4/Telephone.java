package z_4;

public class Telephone {
    private String number;
    public Telephone(String number){
        this.number=number;
    }
    public String toString(){
        String changed_format_number;
        changed_format_number=number.substring(0,number.length()-7)+"-"+number.substring(number.length()-7, number.length()-4)+"-"+number.substring(number.length()-4, number.length());
        return changed_format_number;
    }
}
