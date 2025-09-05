package OOPs;

public class Student {
    String name;
    int rollNo;
    double percentage;

    final String schoolName="ABC";
    private int noOfStudent;


    //Default constructor
    public Student(){

    }

    public Student(String name, int rollNo, double percentage){
        this.name= name;
        this.rollNo= rollNo;
        this.percentage= percentage;
        noOfStudent++;
    }

    public int getNoOfStudent(){
        return noOfStudent;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int roll){
        rollNo= roll;
    }
}
