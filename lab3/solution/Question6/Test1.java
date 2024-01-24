interface IMessage {
    void print();
}

class Music implements IMessage{
    private String name = "÷ª“Úƒ„Ã´√¿";
    private String type = "POP";
    public void print(){
        System.out.println(name);
        System.out.println(type);
    }
}

class Mobile implements IMessage{
    private String name = "Apple";
    private String type = "iPhone12";
    public void print(){
        System.out.println(name);
        System.out.println(type);
    }
}

public class Test1 {
    public static void main(String[] args) {
        IMessage music = new Music();
        IMessage mobile = new Mobile();
        music.print();
        mobile.print();
    }
}
