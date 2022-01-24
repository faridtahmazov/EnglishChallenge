package tahmazovfarid.dictionarychallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static tahmazovfarid.dictionarychallenge.Menu.lang;

public class Challenge extends AbstractFile {
    RandomQuery randomQuery = new RandomQuery();
    Integer correct = 0;
    Integer wrong = 0;

    public void translateToAze() throws Exception {

        FileComponents fc = new FileComponents();
        Scanner scanner = new Scanner(System.in);
        String eng = null;
        String aze = null;

        HashMap<String, String> dicts = fc.readFile(file);
        Integer random = randomQuery.randomWords(fc.linesTxt);
        Integer countLoop = 0;
//        System.out.println(random);
//        System.out.println(countLoop);

        for (Map.Entry dict : dicts.entrySet()) {
            if (countLoop == random) {
                eng = dict.getKey().toString();
                aze = dict.getValue().toString();
            }
            countLoop++;
        }

        System.out.print(eng + " => ");
        String translate = scanner.nextLine();

        checkTranslate(aze, translate);
    }

    public void translateToEng() throws Exception {

        FileComponents fc = new FileComponents();
        Scanner scanner = new Scanner(System.in);
        String eng = null;
        String aze = null;

        HashMap<String, String> dicts = fc.readFile(file);
        Integer random = randomQuery.randomWords(fc.linesTxt);
        Integer countLoop = 0;
//        System.out.println(random);
//        System.out.println(countLoop);

        for (Map.Entry dict : dicts.entrySet()) {
            if (countLoop == random) {
                eng = dict.getKey().toString();
                aze = dict.getValue().toString();
            }
            countLoop++;
        }

        System.out.print(aze + " => ");
        String translate = scanner.nextLine();

        checkTranslate(eng, translate);
    }

    private boolean checkTranslate(String word, String translate){
        boolean check = false;
        if (lang == 1) {
            check = cheackAze(word, translate);

        } else if (lang == 2) {
            check = checkEng(word, translate);
        }

        return check;
    }



    private boolean cheackAze(String word, String translate){
        boolean check = false;
        if (translate.equalsIgnoreCase(word)) {
            correct++;
            String message = "It is correct!";
            Integer msgLen = message.length();
            System.out.println(message);
            while (msgLen > 0) {
                System.out.print("-");
                if (msgLen == 1) {
                    System.out.println();
                }
                msgLen--;
            }

            check = true;
        } else {
            wrong++;
            String message = "It is wrong!";
            Integer msgLen = message.length();
            System.out.println(message);
            while (msgLen > 0) {
                System.out.print("-");
                if (msgLen == 1) {
                    System.out.println();
                }
                msgLen--;
            }

            check = false;
        }
        return check;
    }

    private boolean checkEng(String word, String translate){
        boolean check = false;
        if (translate.equalsIgnoreCase(word)) {
            correct++;
            String message = "It is correct!";
            Integer msgLen = message.length();
            System.out.println(message);
            while (msgLen > 0) {
                System.out.print("-");
                if (msgLen == 1) {
                    System.out.println();
                }
                msgLen--;
            }

            check = true;
        } else {
            wrong++;
            String message = "It is wrong!";
            Integer msgLen = message.length();
            System.out.println(message);
            while (msgLen > 0) {
                System.out.print("-");
                if (msgLen == 1) {
                    System.out.println();
                }
                msgLen--;
            }

            check = false;
        }

        return check;
    }
}
