import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckFireMoonStr {
    public static void startCheckFireMoonStr(){
        try{
            Boolean answer = true;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String data = br.readLine().toLowerCase();
            char [] dataArray = data.toCharArray();
            int lt =0 , rt = data.length() -1 ;
            while (lt < rt){
                char firstData = dataArray[lt];
                char lastData = dataArray[rt];
                if(firstData == lastData){
                    lt++;
                    rt--;
                }else{
                    answer = false ;
                    break;
                }
            }
            if(answer){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
