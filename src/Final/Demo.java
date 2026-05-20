package Final;

class Student{
    String name;
    int age;
    int rollNumber;
    static String CollegeName;

    Student(String name,int age,int rollNumber){
        this.name=name;
        this.age=age;
        this.rollNumber=rollNumber;
    }
    //static block
    static{
        CollegeName="Bpit";
    }
}

public class Demo {
    public static void main(String[] args) {
        Student s1=new Student("Achyut",20,101);
        Student s2=new Student("Aditiya",28,102);

        Student.CollegeName="Bpit";
        System.out.println(s1.name+" , "+s1.age+" , "+s1.rollNumber+" , "+ Student.CollegeName);
        System.out.println(s2.name+" , "+s2.age+" , "+s2.rollNumber+" , "+ Student.CollegeName);
    }
}

