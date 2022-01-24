package tahmazovfarid.dictionarychallenge;

import java.util.Random;

public class RandomQuery {
    Integer result;

    public Integer randomWords(Integer count){
       Random random = new Random();
       Integer r = random.nextInt(count);

       if (result!=null && r==result){
           r = random.nextInt(count);
           if (r==result){
               r = random.nextInt(count);
           }
       }
           result = r;
       return result;
    }
}
