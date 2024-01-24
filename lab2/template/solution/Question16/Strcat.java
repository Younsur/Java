public class Strcat {
    public static String strscat(String... args){
        for (int i = 1;i < args.length;i++) {
            args[0] += args[i];
        }
        return args[0];
    }
}
