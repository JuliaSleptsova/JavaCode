import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberSign {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int countN = 0;
        for (int i = 0; i < 3; i++) {
            String sNum = reader.readLine();
            int num = Integer.parseInt(sNum);
            if (num != 0) {
                if (num > 0) {
                    count++;
                } else {
                    countN++;
                }
            }
        }
        System.out.println("количество отрицательных чисел: " + countN);
        System.out.println("количество положительных чисел: " + count);
    }
}
