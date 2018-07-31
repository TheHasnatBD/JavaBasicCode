package association;

import java.util.ArrayList;

public class StudentInfo {

    /** POJO => Plain Old Java Object */

    private String studentName;
    private String studentID;
    private String studentDept;

    /* ONE-to-ONE association (because, has a relation btn these)
       One student has one address info*/
    private StudentAddress studentAddress;

    /* ONE-to-MANY association (because, has a relation btn these)
       One student has twice or, more than courses*/
    private ArrayList<StudentCourse> studentCourses;

    /* ONE-to-ONE association (because, has a relation btn these)
       One student has unique contact*/
    private StudentContact studentContact;




    // Constructor Overloading
    public StudentInfo(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public StudentInfo(String studentName, String studentID, String studentDept) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentDept = studentDept;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentDept() {
        return studentDept;
    }

    public void setStudentDept(String studentDept) {
        this.studentDept = studentDept;
    }

    public StudentAddress getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(StudentAddress studentAddress) {
        this.studentAddress = studentAddress;
    }

    public ArrayList<StudentCourse> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(ArrayList<StudentCourse> studentCourses) {
        this.studentCourses = studentCourses;
    }

    public StudentContact getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(StudentContact studentContact) {
        this.studentContact = studentContact;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "studentName='" + studentName + '\'' +
                ", studentID='" + studentID + '\'' +
                ", studentDept='" + studentDept + '\'' +
                ", studentAddress=" + studentAddress +
                ", studentCourses=" + studentCourses +
                ", studentContact=" + studentContact +
                '}';
    }
}
