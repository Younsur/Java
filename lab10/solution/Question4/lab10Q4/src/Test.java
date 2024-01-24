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
    public static void addLineNo(String inputPath,String outPath) throws IOException {
        List<String> input = new ArrayList<>();
        Path input_path = Paths.get(inputPath);
        Path out_path = Paths.get(outPath);
        try {
            input = Files.readAllLines(input_path);
            for (int i = 0; i < input.size(); i++) {
                StringBuffer str = new StringBuffer();
                str.append(i+1+" "+input.get(i));
                input.set(i,str.toString());
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

    public static void main(String[] args) throws IOException{
        String input = "input.txt";
        Scanner scanner = new Scanner(System.in);
        String output = scanner.nextLine();
        addLineNo(input,output);
    }
}
