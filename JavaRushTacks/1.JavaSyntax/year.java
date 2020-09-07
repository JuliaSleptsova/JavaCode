import java.io.BufferedReader;
import java.io.InputStreamReader;


public class year {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your the year ");
        String sYear = reader.readLine();
        int year = Integer.parseInt(sYear);
        if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Leap year");

        }
        else {
            System.out.println("Normal year");
        }
    }
}
