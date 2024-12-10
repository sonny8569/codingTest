import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Peak {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void findPeak() {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean check = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx >=0 && nx < n && ny >=0 && ny <n && arr[nx][ny] >= arr[i][j]){
                        check = false;
                        break;
                    }
                }
                if(check) answer ++ ;
            }
        }
        System.out.print(answer);
    }
}
