public class FlPassingCalculator extends PassingCalculator{

    public String caculatesPassingKindergarten(Score score) {

        if (score.getMathScore() > 75 && score.getReadingScore() > 60) {
            return "PASS";
        } else {
            return "FAIL";
        }

    }
}
