import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class StudentTest {
    Student jordan;
    Student studentWithManyGrades;

    @Before
    public void init(){
        jordan = new Student(1, "Jordan Witt");
        jordan.addGrade(90);
        studentWithManyGrades = new Student(2, "Han Solo");
        studentWithManyGrades.addGrade(90);
        studentWithManyGrades.addGrade(80);
        studentWithManyGrades.addGrade(50);
        System.out.println(jordan.getName());
        System.out.println(studentWithManyGrades.getName() + studentWithManyGrades.getGrades());
    }

    @Test
    public void ifUserObjectCanBeCreated(){
        assertEquals("Jordan Witt", jordan.getName());
        assertEquals(1, jordan.getId());
        System.out.println(jordan.getId());
    }

    @Test
    public void testIfAddGradeWorks(){
        assertSame(90, jordan.getGrades().get(0));
        System.out.println(jordan.grades);
    }

    @Test
    public void testIfAvgIsCorrect(){
        assertEquals(90, jordan.getGradeAverage(), 0);
        assertEquals(73.33333333333333, studentWithManyGrades.getGradeAverage(), 0);
        System.out.println(studentWithManyGrades.getName() + " " + studentWithManyGrades.getGradeAverage() + " " + jordan.getName() + jordan.getGradeAverage());
    }
}
