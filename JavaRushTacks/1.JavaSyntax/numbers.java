import java.io.BufferedReader;
import java.io.InputStreamReader;

public class numbers {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();
        int num = Integer.parseInt(sNum);

        if (num > 0 && num % 2 == 0){
            System.out.println("положительное четное число");
        }
        else if (num > 0 && num % 2 != 0){
            System.out.println("положительное нечетное число");
        }
        else if (num < 0 && num % 2 != 0){
            System.out.println("отрицательное нечетное число");
        }
        else if (num < 0 && num % 2 == 0){
            System.out.println("отрицательное четное число");
        }
        else {
           System.out.println("ноль");
        }

    }
}
