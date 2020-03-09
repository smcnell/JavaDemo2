public class ScPassingCalculator extends PassingCalculator{

    public String caculatesPassingKindergarten(Score score) {

        if (score.getMathScore() > 70 && score.getReadingScore() > 70) {
            return "PASS";
        } else {
            return "FAIL";
        }

    }

}
