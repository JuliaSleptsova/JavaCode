import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MinOfValueInArray1 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String str = reader.readLine();
            list.add(str);
        }
        String min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.length() <= min.length()) {
                min = str;
            }

        }
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.length() == min.length()) {
                System.out.println(str);
            }
        }

    }
}

