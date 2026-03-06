
import java.io.*;

public class VowelWordCount {

    public static void main(String[] args) {

        int vowels = 0;
        int words = 0;

        try {

            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {

                String[] w = line.split("\\s+");
                words += w.length;

                for (char c : line.toLowerCase().toCharArray()) {

                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        vowels++;
                    }
                }
            }

            br.close();

            System.out.println("Total Words: " + words);
            System.out.println("Total Vowels: " + vowels);
        }

        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}