package OOPs;

public class StudentClass {
    public static void main(String[] args){
//        Student s1= new Student();
//
//        s1.name= "Saurav";
//        s1.percentage=99.9;
//        s1.rollNo=22;

//        System.out.println(s1.getRollNo());
//        s1.setRollNo(33);
//        System.out.println(s1.getRollNo());

        Student s1= new Student();
        s1.name= "Saurav";
        s1.percentage= 99;
        s1.rollNo=1;

        Student s2= new Student("Sarvesh", 9, 98.9);

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s1.percentage);
        System.out.println(s2.rollNo);
    }
}
