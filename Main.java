public class Main {
    public static void main(String[] args) {
        Question[] questionBank = Data.getQuestionData();
        QuizBrain quiz = new QuizBrain(questionBank);
        while (quiz.stillHasQuestions()) {
            quiz.nextQuestion();
        }
        System.out.println("\nYou've completed the quiz");
        System.out.println("Your final score was: " + quiz.getScore() + "/" + quiz.getQuestionNumber());
    }
}