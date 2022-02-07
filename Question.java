public class Question {
    public String value;
    public ArrayList<Answer> answers;
    public String correct;

    public Question(String value, ArrayList<Answer> answers, String correct) {
        this.value = value;
        this.answers = answers;
        this.correct = correct;
    }
}
