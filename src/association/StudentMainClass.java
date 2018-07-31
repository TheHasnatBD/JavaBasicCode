package Association;

import java.util.ArrayList;

public class StudentMainClass {

    public static void main(String[] args) {


        StudentInfo st1 = new StudentInfo("Hasnat", "s-019", "CSE");
        StudentInfo st2 = new StudentInfo("Zakaria", "s-010");

        StudentAddress address = new StudentAddress("H-13", "xyz road", "Dhaka", 1208);
        st1.setStudentAddress(address);

        System.out.println("--------------------");
        st1.setStudentID("s-101");
        System.out.println(st1.getStudentName());
        System.out.println(st1.getStudentID());

        System.out.println("--------------------");
        st2.setStudentName("Pavel");
        System.out.println(st2.getStudentName());
        st2.setStudentDept("CSE");
        System.out.println(st2.getStudentDept());

        System.out.println("--------------------");
        System.out.println(st1.getStudentAddress()); // for overriding "toString" method in "StudentAddress" Class
        System.out.println(st1); // for overriding "toString" method in "StudentInfo" Class



        System.out.println("--------------------");
        ArrayList<StudentCourse> courses = new ArrayList<StudentCourse>();
        StudentCourse course1 = new StudentCourse("Software Engineering", "CSE-321", 3.0);
        courses.add(course1);
        courses.add(new StudentCourse("Data Structure", "CSE-121", 3.0));

        st2.setStudentCourses(courses);
        System.out.println(st2);
        System.out.println(st2.getStudentCourses());
        System.out.println(st2.getStudentCourses().get(0).getCourseName());

        // get all courses of this student
        for (StudentCourse course : st2.getStudentCourses()){
            System.out.println(course.getCourseName());
        }


    }
}
