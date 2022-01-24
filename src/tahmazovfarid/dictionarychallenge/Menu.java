package tahmazovfarid.dictionarychallenge;

import java.util.Scanner;

public class Menu {
    static Integer lang = 0;
    public Integer choice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("|-------Language Challenge-------|\n" +
                "[1] English To Azerbaijan\n" +
                "[2] Azerbaijan To English\n" +
                "[3] Print All Words\n" +
                "[4] Exit");
        System.out.println("---------------");
        System.out.print("Which: ");
        Integer result = scanner.nextInt();
        while(true){
            if (result==1 || result==2 || result==3 || result==4){
                break;
            }else{
                result = scanner.nextInt();
            }
        }
        lang = result;
        return result;
    }
}
