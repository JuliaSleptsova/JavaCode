import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxOfEnterNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = -2147483648;
        String sNum = reader.readLine();
        int N = Integer.parseInt(sNum);
        if (N > 0){
            for (int i = 0; i < N; i++){
                String sNumber = reader.readLine();
                int n = Integer.parseInt(sNumber);
                if (n > maximum){
                    maximum = n;
                }
            }
            System.out.println(maximum);
        }
    }
}
