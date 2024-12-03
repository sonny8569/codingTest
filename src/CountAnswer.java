import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountAnswer {
    public static void checkAnswer(){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int data = Integer.parseInt(br.readLine());
            int[] arr = new int[data];
            for(int i =0; i<data; i++){
                arr[i]= Integer.parseInt(br.readLine());
            }
            int acc = 0;
            int answer = 0;
            for(int i=0;i<arr.length; i++){
                if(arr[i] == 1){
                    acc++ ;
                    answer +=acc;
                }else {
                    acc = 0 ;
                }
            }
            System.out.println(answer);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public int solution(int n, int[] arr){
        int answer=0, cnt=0;
        for(int i=0; i<n; i++){
            if(arr[i]==1){
                cnt++;
                answer+=cnt;
            }
            else cnt=0;
        }
        return answer;
    }
}
