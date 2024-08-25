public class StaticKey {
    public static void main(String[] args) {
        Student s1 = new Student();
        //no name addded yet
        s1.getName();

        Student s2 = new Student();
        s2.schoolName = "School name changed";
        System.out.println(s1.schoolName);

        Student s3 = new Student();

        //school name is changed for all schools
        System.out.println(s1.schoolName);
        System.out.println(s3.schoolName);
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;

    void getName(){
        System.out.println(this.name);
    }

    void setName(String nm){
        this.name = nm;
    }
}
