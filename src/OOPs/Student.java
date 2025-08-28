package OOPs;

public class Student {
    String name;
    int rollNo;
    double percentage;

    //Default constructor
    public Student(){

    }

    public Student(String name, int rollNo, double percentage){
        this.name= name;
        this.rollNo= rollNo;
        this.percentage= percentage;
    }


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int roll){
        rollNo= roll;
    }
}
