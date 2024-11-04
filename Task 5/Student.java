class Student {
    private String name;
    private int rollno;
    private String grade;

    public Student(String name, int rollno, String grade) {
        this.name = name;
        this.rollno = rollno;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollno;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollno + ", Grade: " + grade;
    }
}
