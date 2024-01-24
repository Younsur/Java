import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void removeComments(String inputPath,String outPath) throws IOException {
        List<String> input = new ArrayList<>();
        Path input_path = Paths.get(inputPath);
        Path out_path = Paths.get(outPath);
        try {
            input = Files.readAllLines(input_path);
            int mul_judge = 0;
            for (int i = 0; i < input.size(); i++) {
                if (mul_judge == 0){
                    int flag = input.get(i).indexOf("//");
                    if (flag == -1){
                        int flag2 = input.get(i).indexOf("/*");
                        if (flag2 == -1){
                            continue;
                        }
                        StringBuilder newStr = new StringBuilder();
                        for (int j = 0; j < flag2; j++) {
                            newStr.append(input.get(i).charAt(j));
                        }
                        input.set(i,newStr.toString());
                        mul_judge = 1;
                    }
                    else {
                        StringBuilder newStr = new StringBuilder();
                        for (int j = 0; j < flag; j++) {
                            newStr.append(input.get(i).charAt(j));
                        }
                        input.set(i,newStr.toString());
                    }
                }
                else {
                    int flag3 = input.get(i).indexOf("*/");
                    if (flag3 == -1){
                        input.set(i, "");
                        continue;
                    }
                    input.set(i, "");
                    mul_judge = 0;
                }
            }
        }catch (IOException e){
            System.out.println("input operation failed");
        }
        File file = new File(outPath);
        if (!file.exists()){
            file.createNewFile();
        }
        else {
            Files.delete(file.toPath());
        }
        try {
            for (String str: input){
                Files.writeString(out_path,str, StandardOpenOption.APPEND,StandardOpenOption.CREATE);
                Files.writeString(out_path,"\r\n",StandardOpenOption.APPEND);
            }
        }catch (IOException e){
            System.out.println("output operation failed");
        }
    }

    public static void main(String[] args) throws IOException {
        String input = "input.txt";
        Scanner scanner = new Scanner(System.in);
        String output = scanner.nextLine();
        removeComments(input,output);
    }
}
