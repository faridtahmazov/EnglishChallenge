package tahmazovfarid.dictionarychallenge;

public class Translate {
    public static void toAzerbaijan() throws Exception{
        Challenge challenge = new Challenge();
        Integer part = 0;
        while (part<10){
            challenge.translateToAze();
            part++;
        }
        System.out.println("Game end!" +
                "\nCorrect answer: " + challenge.correct +
                "\nWrong answer: " + challenge.wrong);
        System.out.println("---------------\n");
        Learn.language();
    }

    public static void toEnglish() throws Exception{
        Challenge challenge = new Challenge();
        Integer part = 0;
        while (part<10){
            challenge.translateToEng();
            part++;
        }
        System.out.println("Game end!" +
                "\nCorrect answer: " + challenge.correct +
                "\nWrong answer: " + challenge.wrong);
        System.out.println("---------------\n");
        Learn.language();
    }
}
