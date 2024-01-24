public class Dog {
    public Dog(int age){
        System.out.println(age);
    }
    public Dog(int age,String name){
        this(age);
        System.out.println(name);
    }

    public void bark(String bark){
        System.out.println("barking");
    }

    public void bark(char bark){
        System.out.println("howling");
    }

    public void bark(int age,String name){
        System.out.println("barking");
    }

    public void bark(String name,int age){
        System.out.println("howling");
    }

}
