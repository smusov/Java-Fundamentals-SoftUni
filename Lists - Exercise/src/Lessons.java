public class Lessons {
    private String lesson;
    private String Exercise;

    public Lessons(String lesson, String exercise) {
        this.lesson = lesson;
        Exercise = exercise;
    }

    public Lessons(String lesson) {
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }

    public String getExercise() {
        return Exercise;
    }
}
