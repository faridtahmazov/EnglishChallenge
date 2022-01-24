package tahmazovfarid.dictionarychallenge;

public class Learn {
    public static void language() throws Exception{
        Menu menu = new Menu();
        DictionayOperations dop = new DictionayOperations();
        Integer oper = menu.choice();

        switch (oper){
            case 1:
                Translate.toAzerbaijan();
                break;
            case 2:
                Translate.toEnglish();
                break;
            case 3:
                dop.printAllWords();
                language();
                break;
            case 4:
                System.out.println("System exit..");
                System.exit(-1);
        }
    }

}
