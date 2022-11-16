package qwerty;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Podaj ciag znaków: ");
            System.out.println(encode(sc.nextLine().toUpperCase()));
        }while(!(sc.nextLine().equals("exit")));

    }

    public static String fromMap(String letter){
        return Quwerty.map.getOrDefault(letter,"");
    }


    public static String encode(String text) {
        String result ="";
        if(Objects.nonNull(text)){
            for(int i = 0; i <text.length(); i++){
                String letter = String.valueOf(text.charAt(i));
                result += fromMap(letter) + " ";
            }
        }
        return result;
    }

}
