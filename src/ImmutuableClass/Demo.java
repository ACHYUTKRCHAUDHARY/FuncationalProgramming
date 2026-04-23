package ImmutuableClass;

public class Demo {
    static void main() {
        College college=new College("IIT G","Assam");
        Student s1=new Student(28,"Achyut",college);
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        System.out.println(college.name);

    }
}

final class Student{
    private final int age;
    private final String name;
    private final College college;
    Student(int age,String name,College college){
        this.age=age;
        this.name=name;
        this.college=college;
    }
    //getters

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public College getCollege() {
        return college;
    }
}
//mutuable
class College{
    String name;
    String address;
    College(String name,String address){
        this.name=name;
        this.address=address;
    }
}