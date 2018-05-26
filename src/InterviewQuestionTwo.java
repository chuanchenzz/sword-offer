public class InterviewQuestionTwo {

    private InterviewQuestionTwo(){}
    private static class InterviewQuestionTwoHolder{
        private static InterviewQuestionTwo  instance = new InterviewQuestionTwo();
    }

    public InterviewQuestionTwo getINSTANCE() {
        return InterviewQuestionTwoHolder.instance;
    }
}
