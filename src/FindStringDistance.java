import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FindStringDistance {

    public static void startFindStringDistance(){
        ArrayList<Integer> answer = new ArrayList<Integer>();
        boolean isFindStr = false;
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            char [] input = br.readLine().toCharArray();
            String dataStr = "";
            char findStr = ' ';
            for(char data : input){
                if(data == ' '){
                    isFindStr = true;
                    continue;
                }
                if(isFindStr){
                    findStr = data;
                }else{
                    dataStr += data;
                }
            }
            int index = 0;
            int findIndex = 0;
            int count = 0;
            while (index < dataStr.length()){
                if(dataStr.charAt(index) == findStr){
                    answer.add(count);
                    count = 0;
                    index ++;
                    findIndex = index;
                }

            }
            for(int data :answer){
                System.out.println(data);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
