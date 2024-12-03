import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class ShowOnlyBigStudent {
    public static void startBigStudent() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(br.readLine());
            String[] data = br.readLine().split(" ");

            int visibleCount = 1;
            int maxHeight = Integer.parseInt(data[0]);

            for (int i = 1; i < count; i++) {
                int currentHeight = Integer.parseInt(data[i]);
                if (currentHeight > maxHeight) {
                    maxHeight = currentHeight;
                    visibleCount++;
                }
            }

            System.out.println(visibleCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}