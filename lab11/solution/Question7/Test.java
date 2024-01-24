import java.util.concurrent.atomic.AtomicBoolean;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        AtomicBoolean tag = new AtomicBoolean();
        new Thread(() -> {
            synchronized (lock) {
                for (int i = 1; i <= 51; i += 2) {
                    tag.set(true);
                    System.out.print(i);
                    System.out.print(i+1);
                    lock.notify();
                    try {
                        lock.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                lock.notify();
            }
        }).start();

        new Thread(() -> {
            synchronized (lock) {
                while (!tag.get()){
                    try {
                        lock.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                for (int i = 0; i < 26; i++) {
                    char letter = (char)('A' + i);
                    if (i != 25){
                        System.out.print(letter + " ");
                    }
                    else {
                        System.out.print(letter);
                    }
                    lock.notify();
                    try {
                        lock.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
