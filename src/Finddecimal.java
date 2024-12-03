import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Finddecimal {

    public static void startDecimal() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int maxNumber = Integer.parseInt(br.readLine());
            ArrayList<Integer> answer = getAnswer(maxNumber);
            System.out.println(answer.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Integer> getAnswer(int maxNumber) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= maxNumber; i++) {
            Boolean result = makePrime(i);
            if(result){
                answer.add(i);
            }
        }
        return answer;
    }

    private static Boolean makePrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
