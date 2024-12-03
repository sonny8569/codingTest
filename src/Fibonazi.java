import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Fibonazi {
    public static void startFiboNazi() {
        ArrayList<Integer> data = new ArrayList<>();
        String answer = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            data.add(1);
            data.add(1);
            int max = Integer.parseInt(br.readLine());
            data = checkFiboNazi(data, max, 0, 1);  // max 값을 예시로 10으로 설정
            for(int i=0;i<data.size(); i++){
                answer += data.get(i) +" ";
            }
            System.out.println(answer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Integer> checkFiboNazi(ArrayList<Integer> answer, int max, int firstIndex, int nextIndex) {
        if (answer.size() == max) {
            return answer;
        }
        int data = answer.get(firstIndex) + answer.get(nextIndex);
        answer.add(data);
        return checkFiboNazi(answer, max, firstIndex + 1, nextIndex + 1);
    }
}
