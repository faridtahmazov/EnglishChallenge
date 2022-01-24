package tahmazovfarid.dictionarychallenge;

import java.util.HashMap;
import java.util.Map;

public class DictionayOperations extends AbstractFile implements DictOpInter{
    int max = 0;
    public void printAllWords() throws Exception{
        FileComponents fc = new FileComponents();
        HashMap<String, String> dict = fc.readFile(file);
        int count = 1;
        int braceLen = 35;

        while(braceLen>0){
            if (braceLen%2==0)
                System.out.print("#");
            else
                System.out.print(" ");
            braceLen--;
        }

        System.out.println("\n# Word size: " + fc.linesTxt + "\n#");

        for (Map.Entry line: dict.entrySet()){
            String words = count + ". " + line.getKey() + " => " + line.getValue();
            Integer lineLen = words.length();
            if (lineLen>max){
                max = lineLen;
            }

            System.out.println("# " + words);
            count++;
        }
        braceLen = max+3;

        while(braceLen>0){
            if (braceLen%2==0)
            System.out.print("#");
            else
                System.out.print(" ");
            braceLen--;
        }
        System.out.println("\n");
    }
}
