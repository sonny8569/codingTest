import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class decodeData {

    public static void startDecodeLatter(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> codeList = new ArrayList<String>();
        String answer = "";
        String decode = "";
        try{
            String codeNum = br.readLine();
            String code = br.readLine();
            for(int i=0; i<code.length(); i++){
                if(code.charAt(i) =='#'){
                    decode += "1";
                }else{
                    decode +="0";
                }
                if(decode.length() == 7){
                    codeList.add(decode);
                    decode = "";
                }
            }
            if(codeList.size() != Integer.parseInt(codeNum)){
                System.out.println("error");
                return;
            }
            for(int i=0; i< codeList.size(); i++){
                int asciiValue = Integer.parseInt(codeList.get(i), 2);
                answer += (char) asciiValue;
            }
            System.out.println(answer);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
