package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student Danny = new Student ("Danny");
        Danny.addGrade(90);
        Danny.addGrade(80);
        Danny.addGrade(70);

        System.out.println(Danny.getGrades());
        System.out.println(Danny.getGradeAverage());
    }
}
