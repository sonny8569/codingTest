import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ZipString {
    public static void zipString() {
        try {
            String answer = "";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            char[] data = br.readLine().toCharArray();
            int count = 1;

            for (int i = 0; i < data.length; i++) {
                // 다음 문자가 같으면 count 증가
                if (i < data.length - 1 && data[i] == data[i + 1]) {
                    count++;
                } else {
                    // count가 1인 경우 생략, 아닌 경우 추가
                    answer += data[i];
                    if (count > 1) answer += count;
                    count = 1;  // count 초기화
                }
            }
            System.out.println(answer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}