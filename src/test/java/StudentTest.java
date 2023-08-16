<<<<<<< HEAD
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
=======
import org.junit.Test;

import java.util.ArrayList;
>>>>>>> cohorts-feature

import static org.junit.Assert.*;

public class StudentTest {
<<<<<<< HEAD
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
=======
    @Test
    public void testCreateStudent(){
        Student fer = new Student(1L, "fer");
        Student ryan = null;
        assertNull(ryan);
        assertNotNull(fer);
    }

    @Test
    public void testStudentFields(){
        Student fer = new Student(1L, "fer");
        assertSame(1L, fer.getId());
        assertSame("fer", fer.getName());
        assertSame(0, fer.getGrades().size());
    }


    @Test
    public void testAddGrade(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(100);
        assertSame(100, fer.getGrades().get(0));
        fer.addGrade(80);
        assertSame(80, fer.getGrades().get(1));
    }

    @Test
    public void testAverageGrade(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(100);
        fer.addGrade(80);
        assertEquals(90, fer.getGradeAverage(), 0);
    }
}
>>>>>>> cohorts-feature
