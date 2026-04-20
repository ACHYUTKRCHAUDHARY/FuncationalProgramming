package OOPs;

public class Demo {
    class Student{
        String name;
        int age;
        long Rollno;
        String College;

        Student(){}
        Student(String name){
            this.name=name;

        }

        Student(String name,int age){
            this.name=name;
            this.age=age;
        }
        Student(String name,int age,String college){
            this.name=name;
            this.age=age;
            this.College=college;
        }



        void markAttendance(){
            System.out.println("Marking Attendance");
        }
    }
}
