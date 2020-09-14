import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MaxOfStringInArray {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        String max = strings.get(0);
        for (int i = 0; i < strings.size(); i++){
            String str = strings.get(i);
            if (str.length() >= max.length()){
                max = str;
            }

        }
        for (int i = 0; i < strings.size(); i++){
            String str = strings.get(i);
            if (str.length() == max.length()){
                System.out.println(str);
            }
        }
    }
}
