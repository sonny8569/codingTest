import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReverseString {

    public static void startReverseString() {
        List<String> names = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int count = Integer.parseInt(br.readLine());
            for (int i = 0; i < count; i++) {
                String data = br.readLine();
                String answer = reverseString(data);
                names.add(answer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(int i=0; i<names.size(); i++){
            System.out.println(names.get(i));
        }
    }

    private static String reverseString(String data) {
        String answer = "";
        for (int i = data.length() - 1; i >= 0; i--) {
            answer += data.charAt(i);
        }
        return answer;
    }
}
