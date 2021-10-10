import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ibossApp {

    public static void main (String[] args) throws java.lang.Exception {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String input = br.readLine();
        // System.out.println(input);

        System.out.println(getPercentage("$$...."));

    }

    public static int getPercentage(String progress) {

        float strLength = progress.length();
        float percentageItems = 1;
        char[] progArray = progress.toCharArray();

        for (int i = 1; i < progArray.length; i++){
            char c = progArray[i];
            if (progArray[0] == c) {
                percentageItems += 1;
            }
        }

        return (int)Math.floor((percentageItems / strLength) * 100);
    }

}
