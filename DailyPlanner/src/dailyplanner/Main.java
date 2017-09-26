package dailyplanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        
        
        
Calendar calendar = Calendar.getInstance();
int day = calendar.get(Calendar.DAY_OF_WEEK);
switch(day) {
    case 1:System.out.println("Воскресение");break;
    case 2:System.out.println("Понедельник");break;
    case 3:System.out.println("Вторник");break;
    case 4:System.out.println("Среда");break;
    case 5:System.out.println("Четверг");break;
    case 6:System.out.println("Пятница");break;
    case 7:System.out.println("Суббота");break;
}

NewClass S = new NewClass();
        System.out.println(" - " + S.pl());



    }
    
}
