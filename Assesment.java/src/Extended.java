class Exam extends Assessment {
    private int questions;
    private int missed;


    public Exam(int q, int m) {
        this.questions = q;
        this.missed = m;
        setScore(calculateScore());
    }


    private int calculateScore() {
        return (questions - missed) * 100 / questions;
    }
    public double getPointsEach() {
        return 100.0 / questions;
    }
}