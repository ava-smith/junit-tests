import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;

public class StudentTest {
    private Student actualStudent;
    private ArrayList<Integer> grades;

    @Before
    public void setup() {
        grades = new ArrayList<>();
        grades.add(70);
        grades.add(80);
        grades.add(90);
        actualStudent = new Student(1, "Ava", grades);
    }

    @Test
    public void testStudentConstructor() {
        actualStudent = new Student();
        assertNotNull(actualStudent);
    }

    @Test
    public void testTwoArgConstructor() {
        assertNotNull(actualStudent);
    }

    @Test
    public void testStudentGetters() {
        assertEquals(actualStudent.getId(), 1);
        assertEquals(actualStudent.getName(), "Ava");
        assertEquals(actualStudent.getGrades(), grades);

    }

    @Test
    public void testAddGrade() {
        ArrayList<Integer> newGrades = grades;
        actualStudent.addGrade(50);
        newGrades.add(50);
        assertEquals(actualStudent.getGrades(), newGrades);
    }

    @Test
    public void testGetGradeAverage() {
        assertEquals(actualStudent.getGradeAverage(), 80, 0.0000001);
    }
}
