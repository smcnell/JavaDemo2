public class KindergartenApp {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Mary");
        student.setAge(1);

        Score score = new Score();
        score.setAlphabetScore(80);
        score.setMathScore(90);
        score.setReadingScore(100);

        HillsboroughCountyCalculator hillsboroughCountyCalculator = new HillsboroughCountyCalculator();
        System.out.print(hillsboroughCountyCalculator.caculatesPassingKindergarten(score));
        System.out.print(hillsboroughCountyCalculator.isStudentAtRisk(score));



    }
}
