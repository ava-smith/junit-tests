import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class StudentTest {
    private Student emptyStudent;
    private Student actualStudent;
    private ArrayList<Integer> grades;

    @Before
    public void setup() {
        grades = new ArrayList<>();
        actualStudent = new Student(1L, "Ava");
    }

    @Test
    public void testStudentConstructor() {
        assertNull(emptyStudent);
        assertNotNull(actualStudent);
    }

    @Test
    public void testTwoArgConstructor() {
        assertNotNull(actualStudent);
    }

    @Test
    public void testStudentGetters() {
        assertEquals(actualStudent.getId(), 1L);
        assertEquals(actualStudent.getName(), "Ava");
        assertNotNull(actualStudent.getGrades());
        assertEquals(actualStudent.getGrades(), grades);

    }

    @Test
    public void testAddGrade() {
        actualStudent.addGrade(50);
        actualStudent.addGrade(75);
        actualStudent.addGrade(100);
        ArrayList<Integer> newGrades = new ArrayList<>(Arrays.asList(50, 75, 100));
        assertEquals(actualStudent.getGrades(), newGrades);
    }

    @Test
    public void testGetGradeAverage() {
        actualStudent.addGrade(50);
        actualStudent.addGrade(75);
        actualStudent.addGrade(100);
        assertEquals(actualStudent.getGradeAverage(), 75, 0.0000001);
    }
}
