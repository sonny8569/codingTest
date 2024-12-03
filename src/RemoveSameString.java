import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RemoveSameString {

    public static void startRemoveSameString(){
        try{
            ArrayList<Character> answerList = new <Character>ArrayList();
            String answer = "";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String data = br.readLine();
            for(int i=0; i<data.length(); i++){
                if(data.indexOf(data.charAt(i)) == i){
                    answer += data.charAt(i);
                }
            }
            System.out.println(answer);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
