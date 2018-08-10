import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.Scanner;

public class TimeZoneConversion36 {

    public static void main(String args[]) {
      
        //capturing today's date and Zone ID
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Zone ID: ");
        String s = sc.nextLine();
        Date today = new Date();
      
        //displaying this date on timezone
        DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:SS z");
        df.setTimeZone(TimeZone.getTimeZone(s));
        String IST = df.format(today);
        System.out.println("Date in " + s + " Timezone : " + IST);
        sc.close();
    } 
  
} 