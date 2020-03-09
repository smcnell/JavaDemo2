public class HillsboroughCountyCalculator extends FlPassingCalculator {

    public boolean isStudentAtRisk(Score score) {
        return score.getAlphabetScore() < 40;
    }

//    public String caculatesPassingKindergarten(Score score) {
//
//        System.out.println("hillsboroughhhh");
//
//        if (score.getMathScore() > 75 && score.getReadingScore() > 65) {
//            return "PASS";
//        } else {
//            return "FAIL";
//        }
//
//    }

}
