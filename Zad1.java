import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Zad1
{
    public static void main(String[] args) {
        String text    =
                "мы по перелеску еле смогли дойти до села  в лесу" ;

        String pString = "лес";
        Pattern p = Pattern.compile(pString);
        Matcher m = p.matcher(text);
        int count = 0;
        while(m.find()) {
            count++;
            System.out.println(+count+"  окно:  от " + m.start() +" элемента строки"+ " до "
                    + (m.end()-1) + "  элемента строки");
        }
    }
}







    




























        
    

