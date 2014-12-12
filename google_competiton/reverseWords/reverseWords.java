import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

/**
 * Created by kevindamazyn on 12/12/14.
 */
public class reverseWords {

    public static void main(String[] args){
        int trial = 1;
        try {
            BufferedReader in = new BufferedReader(new FileReader(new File(".").getAbsolutePath() + "/" + args[0]));

            int testCases = Integer.parseInt(in.readLine());
            String phrase;
            while (testCases != 0){
                phrase = in.readLine();
                StringBuilder reversePhrase = new StringBuilder();
                String[] words = phrase.split(" ");
                for (int i = words.length-1; i >= 0; i--){
                    reversePhrase.append(words[i]);
                    if (i-1 >= 0){
                        reversePhrase.append(" ");
                    }
                }
                System.out.printf("Case #%d: ",trial);
                System.out.println(reversePhrase);
                testCases--;
                trial++;
            }
            in.close();

        } catch (java.io.IOException exception){
            System.out.println("Problems Reading File. Please put file in same directory as this file.");
        }
    }
}
