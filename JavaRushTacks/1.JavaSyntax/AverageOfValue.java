import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AverageOfValue {
    public static void main(String[] args) throws Exception {

        int count = 0;
        double sum = 0;
        while (true){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sNum = reader.readLine();
            double num = Double.parseDouble(sNum);
            if (num == -1){
                break;
            }
            sum += num;
            count++;

        }
        System.out.println(sum / count);
    }
}
