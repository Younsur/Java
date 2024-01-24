import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Test {
    public static void copyFile (String sourceFile, String targetFile) throws IOException {
        Path source = Paths.get(sourceFile);
        Path target=Paths.get(targetFile);
        if (target.toFile().exists()){
            Files.delete(target);
            target.toFile().createNewFile();
        }
        else {
            target.toFile().createNewFile();
        }
        try {
            Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println("file operation failed");
        }
    }
    public static void main(String[] args) throws IOException {
        String input = "input.txt";
        Scanner scanner = new Scanner(System.in);
        String output = scanner.nextLine();
        copyFile(input,output);
    }
}
