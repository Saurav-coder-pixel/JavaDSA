package OOPs;

public class StudentClass {
    public static void main(String[] args){
        Student s1= new Student();

        s1.name= "Saurav";
        s1.percentage=99.9;
//        s1.rollNo=22;

//        System.out.println(s1.getRollNo());
        s1.setRollNo(33);
        System.out.println(s1.getRollNo());
    }
}
