import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindLongString {

    public void findLongString(){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String data = br.readLine();
            String [] words = data.split(" ");
            String word = "";
            for(String dataStr : words){
                if(word.isEmpty()) word = dataStr;
                else if(word.length() < dataStr.length()) word = dataStr;
            }
            System.out.println(word);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void checkLongData(String [] data){
        String word = "";
        for(String dataStr : data){
            if(word.isEmpty()) word = dataStr;
            else if(word.length() < dataStr.length()) word = dataStr;
        }
        System.out.println(word);
    }
}
