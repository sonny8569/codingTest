import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountNum {
    public static void solution() {
        try {
            ArrayList<Integer> inputDataCount = new ArrayList<>();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // 입력받기
            int index = Integer.parseInt(br.readLine());
            Integer[] answer = new Integer[index];
            for (int i = 0; i < index; i++) {
                int inputData = Integer.parseInt(br.readLine());
                inputDataCount.add(inputData);
            }

            // 순위 계산
            for (int i = 0; i < inputDataCount.size(); i++) {
                int count = 1;
                for (int j = 0; j < inputDataCount.size(); j++) {
                    System.out.println(inputDataCount.get(j) + " " + inputDataCount.get(i));
                    if (inputDataCount.get(j) > inputDataCount.get(i)) {
                        count++;
                    }
                }
                answer[i] = count;
            }
            // 결과 출력
            for (int rank : answer) {
                System.out.print(rank + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
