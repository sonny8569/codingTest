import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InputBig {

    public static void startInputBigData() {
        try {
            Stack<Integer> dataInt = new Stack<>();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(br.readLine());
            String [] data = br.readLine().split(" ");
            if(data.length != count){
                return;
            }
            for(int i=0; i<data.length; i++){
                int inputData = Integer.parseInt(data[i]);
                if(dataInt.isEmpty()){
                    dataInt.push(inputData);
                }else{
                    int lastData = Integer.parseInt(data[i-1]);
                    if(lastData < inputData){
                        dataInt.push(inputData);
                    }

                }
            }
            for (int num : dataInt) {
                System.out.print(num + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
