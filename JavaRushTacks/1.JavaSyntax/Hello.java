import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hello {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String name = reader.readLine();
        String sAge = reader.readLine();


        int nAge = Integer.parseInt(sAge);
        System.out.println("My name is "  + name + ". "+"I'm "+ nAge + " years old." );
    }
}
