import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class RockSigerPaper {

    public static void startRockPaper() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(br.readLine());
            List<Character> charList = new ArrayList<>();
            char[] arrayA = br.readLine().replace(" ", "").toCharArray();
            char[] arrayB = br.readLine().replace(" ", "").toCharArray();

            if (arrayA.length != count || arrayB.length != count) {
                return;
            }

            for (int i = 0; i < arrayA.length; i++) {
                int a = Integer.parseInt(String.valueOf(arrayA[i]));
                int b = Integer.parseInt(String.valueOf(arrayB[i]));

                // 가위바위보 승자 판별 로직
                if (a == b) {
                    charList.add('D'); // 무승부일 때 'D' 추가
                } else if ((a == 1 && b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2)) {
                    charList.add('A'); // A가 이기는 경우
                } else {
                    charList.add('B'); // B가 이기는 경우
                }
            }

            // 결과 출력
            for (Character result : charList) {
                System.out.println(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}