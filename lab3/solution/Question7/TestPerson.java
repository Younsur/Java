class Person {
    private String name;
    private int age;
    private String sex;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age < 0 || age > 130){
            System.out.println("The age you set is illegal. Please set again");
        }
        else {
            this.age = age;
        }
    }

    public void setSex(String sex){
        if (sex.equals("man") || sex.equals("woman")){
            this.sex = sex;
        }
        else {
            System.out.println("Please enter \"man\" or \"woman\"");
        }
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getSex(){
        return sex;
    }

    public void work(){
        System.out.println("working");
    }

    public void showName(){
        System.out.println("Name: " + name);
    }
    public void showAge(){
        System.out.println("Age: " + age);
    }
    public void showSex(){
        System.out.println("Sex: " + sex);
    }
}
public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("young");
        person1.setAge(190);
        person1.setAge(19);
        person1.setSex("man");
        System.out.println(person1.getAge());
        person1.showName();
        person1.showAge();
        person1.showSex();
        person1.work();

        Person person2 = new Person();
        person2.setName("younsur");
        person2.setAge(20);
        person2.setSex("man");
        System.out.println(person2.getAge());
        person2.showName();
        person2.showAge();
        person2.showSex();
        person2.work();
    }
}
