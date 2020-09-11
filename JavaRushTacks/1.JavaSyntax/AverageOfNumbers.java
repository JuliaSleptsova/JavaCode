import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AverageOfNumbers {
    public static void main(String[] args) throws Exception {

        int age;
        int min = 0;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < 3; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sNum = reader.readLine();
            int num = Integer.parseInt(sNum);
             if (i == 0) {max = num; min = num;}

            if (num > max ){
                max = num;
            }
            else if (min > num){
                min = num;
            }
            sum += num;
            
        }
        age = sum - max - min;
        System.out.println(age);

    }
}
