class Student {


    String name;
    String studentId;
    String email;
    double finalGrade;
    int value;

    String toString(int value) {
        return(this.value.toString())
    }

    public Student() {

    }
    Student(String name, String studentId, String email, double finalGrade )
    {
        name = this.name; studentId = this.studentId; email = this.email; finalGrade = this.finalGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }
}