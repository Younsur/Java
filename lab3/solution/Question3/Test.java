public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog(5);
        Dog dog = new Dog(5,"WangCai");

        dog.bark("bark");
        dog.bark('b');
        dog.bark(5,"Wangcai");
        dog.bark("Wagcai",5);
    }

}
