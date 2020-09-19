import java.io.*;


public class FileStream {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();

            InputStream fileReader = new FileInputStream(fileName);

            while (fileReader.available() > 0){
                //int data = fileReader.read();
                //System.out.println(data);
                System.out.print((char)fileReader.read());
            }
            fileReader.close();
            reader.close();
            }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
