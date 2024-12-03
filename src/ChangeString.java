import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChangeString {

    public void startChangeString(){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String data = br.readLine();
            char[] dataArray = data.toCharArray();

            for(int i = 0; i < dataArray.length; i++){
                if(Character.isUpperCase(dataArray[i])){
                    dataArray[i] = Character.toLowerCase(dataArray[i]);
                } else {
                    dataArray[i] = Character.toUpperCase(dataArray[i]);
                }
            }

            System.out.println(new String(dataArray));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}