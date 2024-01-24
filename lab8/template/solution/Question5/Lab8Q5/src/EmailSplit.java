import java.util.HashMap;
import java.util.Map;

public class EmailSplit {
    public static void main(String[] args)
    {
        String str = "aa@sohu.com,bb@163.com,cc@sina.com";
        Map<String, String> emailMap = new HashMap<String, String>();
        String[] temp1 = str.split(",");
        for (int i = 0; i < temp1.length; i++) {
            String[] temp2 = new String[2];
            temp2 = temp1[i].split("@");
            emailMap.put(temp2[0],temp2[1]);
        }
        System.out.println(emailMap.toString());
    }
}