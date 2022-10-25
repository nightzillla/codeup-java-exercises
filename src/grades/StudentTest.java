package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student Danny = new Student ("Danny");
        Danny.addGrade(99);
        Danny.addGrade(60);
        Danny.addGrade(71);
        Student Steven = new Student("Steven");
        Steven.addGrade(99);
        Steven.addGrade(50);
        Steven.addGrade(70);

        System.out.println(Danny.getGrades());
        System.out.println(Danny.getGradeAverage());
    }
}
