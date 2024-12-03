import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class FindNum {

    public static void startFindNum(){
        try{
            String answer = "";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            char[] data = br.readLine().toCharArray();
            for(char charDAta : data){
                if(charDAta >= 48 && charDAta <= 57){
                    answer += charDAta;
                }
            }
            System.out.println(Integer.parseInt(answer));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
