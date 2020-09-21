import java.io.*;
import java.util.ArrayList;

import java.util.Collections;

public class SortNumFromFile {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        ArrayList<Integer> list = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        while (fileReader.ready()){
            int i = Integer.parseInt(fileReader.readLine());
            if (i % 2 == 0)
                list.add(i);
        }
        Collections.sort(list);

        for (Integer n : list){
            System.out.println(n);
        }
        fileReader.close();
    }
}