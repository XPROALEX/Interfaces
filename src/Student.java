import java.time.Year;

public class Student extends CollegePerson implements LearningPerson {
    private int academicYear;

    public Student(String name, String surname, int collegeId, int year) {
        super(name, surname, collegeId);
        this.academicYear = year;
    }

    @Override
    public void studyAtHome() {
        System.out.println("Is a student!");
    }

}
