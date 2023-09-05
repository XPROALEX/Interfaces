public class Professor extends CollegePerson implements TeachingPerson {
    private String teachingSubject;
    public Professor(String name, String surname, int collegeId,String subject) {
        super(name, surname, collegeId);
        this.teachingSubject=subject;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("Professor!");
    }
}
