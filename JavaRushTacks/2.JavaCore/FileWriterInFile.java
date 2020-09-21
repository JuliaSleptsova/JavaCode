import java.io.*;

public class FileWriterInFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));
        while (true) {
            String str = reader.readLine();
            if (str.equals("exit")) {
                writer.write(str + "\r\n");
                break;
            }
            writer.write(str + "\r\n");
        }
        writer.close();
        reader.close();
    }
}