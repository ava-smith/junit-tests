import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student() {}
    public Student(long id, String name,ArrayList<Integer> grades){
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        int sum = 0;
        for (int grade : this.grades){
            sum += grade;
        }
        return (double) sum / this.grades.size();
    }
}
