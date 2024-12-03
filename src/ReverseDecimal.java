import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReverseDecimal {

    public static void reverseDecimal() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int data = Integer.parseInt(br.readLine());
            int[] arr = new int[data];
            for(int i=0;i<data; i++){
                arr[i] = Integer.parseInt(br.readLine());
            }
            for(int x : solution(data , arr)){
                System.out.println(x + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            int temp =arr[i];
            int res =0;
            while(temp>0){
                int t = temp % 10;
                res = res * 10+t;
                temp = temp/10;
            }
            if(makePrime(res)) answer.add(res);
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
