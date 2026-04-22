package ImmutuableClass;

public class Demo {
    static void main() {
        Student s1=new Student(28,"Achyut");
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
    }
}

final class Student{
    private final int age;
    private final String name;
    Student(int age,String name){
        this.age=age;
        this.name=name;
    }
    //getters

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
