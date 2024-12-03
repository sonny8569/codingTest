import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseSpcText {

    public static void reverseSpcText() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String data = br.readLine();
            char[] dataArray = data.toCharArray();
            int lt = 0, rt = data.length() - 1;

            while (lt < rt) {
                char firstData = dataArray[lt];
                char lastData = dataArray[rt];

                // firstData가 알파벳이 아닌 경우
                if (!((firstData >= 'A' && firstData <= 'Z') || (firstData >= 'a' && firstData <= 'z'))) {
                    lt++;
                }
                // lastData가 알파벳이 아닌 경우
                else if (!((lastData >= 'A' && lastData <= 'Z') || (lastData >= 'a' && lastData <= 'z'))) {
                    rt--;
                }
                // 둘 다 알파벳인 경우 위치를 교환
                else {
                    char temp = dataArray[lt];
                    dataArray[lt] = dataArray[rt];
                    dataArray[rt] = temp;
                    lt++;
                    rt--;
                }
            }
            System.out.println(new String(dataArray)); // 배열을 문자열로 변환하여 출력
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
