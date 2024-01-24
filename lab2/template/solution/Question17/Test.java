import java.util.Random;
import java.util.Scanner;

class Information{
    public static String name = "Xiao Wang";

    public static int weight = 70;
}

class Exercise extends Information{
    public static int RunTimes = 0;
    public static int SkippingropeTimes = 0;
    public static int HulahoopTimes = 0;


    public void Run(){
        RunTimes++;
    }

    public void Skip(){
        SkippingropeTimes++;
    }

    public void Hula(){
        HulahoopTimes++;
    }
}

public class Test extends Information{
    public static int choice = 0;
    public static Exercise exercise = new Exercise();
    public static void Test(){
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight + "Kg");
        if (weight > 45) {
            System.out.println("You are a little overweight. Go to exercise! Come on!");
            choice = 1;
        }
        else {
            System.out.println("Teach me how to keep in shape. Please! www!");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Test();
        if (choice == 1){
            System.out.println("Xiao Wang choose to ?");
        }
        Scanner scanner = new Scanner(System.in);
        String choices = scanner.next();
        if (choices.equals("exercise")){
            int day = 0;
            int week = 7;
            Random random = new Random();
            int rd;
            while (day <= week){
                day++;
                for (int i = 0; i < 3; i++) {
                    rd = random.nextInt(3) + 1;
                    if (rd == 1){
                        exercise.Run();
                    }
                    else if (rd == 2){
                        exercise.Skip();
                    }
                    else if (rd == 3){
                        exercise.Hula();
                    }
                }
                if (day == 7){
                    if(Exercise.RunTimes >= 7 || Exercise.SkippingropeTimes >= 7 || Exercise.HulahoopTimes >= 7){
                        weight -= 5;
                        if (Exercise.RunTimes >= 7){
                            System.out.println("Runing...");
                        }
                        if (Exercise.SkippingropeTimes >= 7){
                            System.out.println("Skipping...");
                        }
                        if (Exercise.HulahoopTimes >= 7){
                            System.out.println("Hulaing...");
                        }
                    }try{
                        Thread.sleep(2100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("A week later...");
                    Test();
                    System.out.println("");
                    day = 0;
                    try{
                        Thread.sleep(2100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
        else if (choices.equals("lieflat")){
            System.out.println("College students should be like this!!!");
            System.exit(0);
        }
    }
}
