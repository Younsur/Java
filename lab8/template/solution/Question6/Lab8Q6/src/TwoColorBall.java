import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TwoColorBall {
    public static void main(String[] args) {
        Random random = new Random();
        int blue = random.nextInt(0,7);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            if (i == blue){
                System.out.println("À¶Çò"+random.nextInt(1,16));
            }
            else {
                int redNum = random.nextInt(1,34);
                while (list.contains(redNum)){
                    redNum = random.nextInt(1,34);
                }
                list.add(redNum);
                System.out.println("ºìÇò"+redNum);
            }
        }
    }
}

