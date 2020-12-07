import java.text.ParseException;
import java.util.Date;

public class Autor {
    public static void main(String[] args){
        try {
            System.out.println("Дата: "+ BuildDC.getFrom1("<2020><11><27><04><20>"));
            System.out.println("Good Boy");
            System.out.println("Сейчас: " + new Date());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}