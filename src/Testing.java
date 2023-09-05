public class Testing {
    public static void main(String[] args) {
        Student student = new Student("Alessandro", "Venuti", 123, 2);
        Professor professor = new Professor("Giovanni", "Verdi", 456, "Mathematics");
        Assistant assistant = new Assistant("Alice", "Rossi", 789, true);
        student.goToCollege();
        student.studyAtHome();

        professor.goToCollege();
        professor.teachToOtherPeople();

        assistant.goToCollege();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }

}
