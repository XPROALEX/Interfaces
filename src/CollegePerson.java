public class CollegePerson {
    private String name;
    private String surname;
    private int collegeId;

    public CollegePerson(String name, String surname, int collegeId) {
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
    }

    public void goToCollege() {
        System.out.println(name + " " + surname +
                "\nCollege ID: " + collegeId);
    }
}
