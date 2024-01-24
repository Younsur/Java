import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class Test {
    public static void copyDirectory(String sourceDir,String targetDir) throws IOException{
        File source_dir = new File(sourceDir);
        File target_dir = new File(targetDir);
        if (!source_dir.isDirectory()) {
            return;
        }

        if(!target_dir.exists()){
            target_dir.mkdir();
        }
        File[] files = source_dir.listFiles();
        for (File file : files) {
            String source_path = sourceDir + File.separator + file.getName();
            String target_path = targetDir + File.separator + file.getName();
            if (file.isDirectory()) {
                copyDirectory(source_path,target_path);
            }
            else if (file.isFile()) {
                copyFile(source_path,target_path);
            }
        }
    }
    public static void copyFile (String sourceFile, String targetFile) throws IOException {
        FileInputStream in = new FileInputStream(sourceFile);
        FileOutputStream out = new FileOutputStream(targetFile);
        byte[] b = new byte[1024 * 1024];
        int cnt = 0;
        while((cnt = in.read(b))!= -1) {
            out.write(b, 0, cnt);
        }
        in.close();
        out.flush();
        out.close();
    }
    public static void main(String[] args) throws IOException {
        String source = "source";
        Scanner scanner = new Scanner(System.in);
        String target = scanner.nextLine();
        copyDirectory(source,target);
    }
}
