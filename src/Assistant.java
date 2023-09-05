public class Assistant extends CollegePerson implements TeachingPerson, LearningPerson {
    private boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int collegeId, boolean willBeAPhD) {
        super(name, surname, collegeId);
        this.isGoingToBeAPhD = willBeAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.println("Student! (Assistant)");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("Professor! (Assistant)");
    }
}
