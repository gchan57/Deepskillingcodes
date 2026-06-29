public class Student {
    private String name;
    private int marks;
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public boolean isPass() {
        return marks >= 35;
    }
}
