package tahmazovfarid.dictionarychallenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Stream;

public class FileComponents {
    HashMap<String, String> dict = new HashMap<>();
    Integer linesTxt=1;

    public HashMap<String, String> readFile(File file) throws Exception{
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;


        HashMap<String, String> dict = new HashMap<>();
        Integer count = 0;
        while ((line=br.readLine()) != null){
            dict = addElementHashMap(line);
            count++;
        }
//        int countLoop = 0;
//        for (Map.Entry list: dict.entrySet()){
//            if (countLoop == 39)
//            System.out.println(list.getKey() + " ==> " + list.getValue());
//
//            countLoop++;
//        }
        linesTxt = count;
        return dict;
    }


    private HashMap<String, String> addElementHashMap(String line){
        String arr[] = line.split(",");
        String eng = arr[0];
        String aze = arr[1];
        dict.put(eng.trim(), aze.trim());

        return dict;
    }
}
