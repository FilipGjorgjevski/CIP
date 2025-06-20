

package org.example;

public class GradeSystemMain {
    public static void main(String[] args) {
        String name = 'Filip';
        String studentId = "1";
        String email ="Filip@filip.filip"
        double finalGrade = 99.99;
        Student s1 = new Student(name, studentId, email, finalGrade );
        GradeFileManager.saveStudentToFile(s1,"student_data");
        Student loadeds1 = GradeFileManager.loadStudentFromFile("student_data");
        System.out.println("Student name: "+loadeds1.getName()+" Student Id: "+loadeds1.getStudentId()+" student email: "+loadeds1.getEmail() )

    }
}