package week03;

class Student extends Person
{

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    private String studentID;

    public void hello()
    {
        System.out.println("hello i am a student");
    }


}