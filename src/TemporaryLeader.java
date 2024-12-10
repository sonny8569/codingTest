import java.util.HashMap;
import java.util.Scanner;

public class TemporaryLeader {

    public static void electionTemporaryLeader() {
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        int[][] students = new int[index+1][6];
        for (int i = 1; i <= index; i++) {
            for (int j = 1; j <= index; j++) {
                students[i][j] = input.nextInt();
            }
        }
        int answer =0 , max = Integer.MIN_VALUE;
        for (int i = 1; i <= index; i++) {
            int cnt =0 ;
            for (int j = 1; j <= index; j++) {
                for(int k=1; k<=index; k ++){
                    if(students[i][k] == students[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max){
                max = cnt;
                answer = i;
            }
        }
        System.out.print(answer);
    }

}
