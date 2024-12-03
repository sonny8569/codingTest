import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FindString {
    public void inputData() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String fullString = br.readLine();
            char findString = br.readLine().charAt(0);
            System.out.println(findString(fullString, findString));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static int findString(String fullString, char findString) {
        int result = 0;
        for (int i = 0; i < fullString.length(); i++) {
            if (fullString.charAt(i) == findString) {
                result += 1;
                continue;
            }
            if ('A' <= fullString.charAt(i) && fullString.charAt(i) <= 'Z') {
                result += 1;
                continue;
            }
            if ('a' <= fullString.charAt(i) && fullString.charAt(i) <= 'z') {
                result += 1;
            }
        }
        return result;
    }
}
