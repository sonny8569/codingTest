import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Grid {
    public static void gridAnswer() {
        try {
            int answer=-2147000000;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int inputData = Integer.parseInt(br.readLine());
            int[][] grid = new int[inputData][inputData];
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    grid[i][j] = Integer.parseInt(br.readLine());
                }
            }
            // 가로 세로
            int sum = 0;
            int sum2 = 0 ;
            for(int i=0; i < inputData; i++){
                sum=sum2=0;
                for(int j=0; j<inputData; j++){
                    sum += grid[i][j];
                    sum2 += grid[j][i];
                }
                answer = Math.max(answer , sum);
                answer = Math.max(answer , sum2);
            }
            sum=sum2=0 ;
            for(int i=0; i<inputData; i++){
                sum += grid[i][i];
                sum2 += grid[i][inputData-i-1];
            }
            answer = Math.max(answer , sum);
            answer = Math.max(answer , sum2);
            System.out.println(answer);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
