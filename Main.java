package practice.harsha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string: ");
        String test = sc.nextLine();
        System.out.println("String is : "+test);
        count(test);
    }
    public static void count(String x){
        char[] ch = x.toCharArray();
        int letters = 0;
        int num = 0;
        int space = 0;
        int others = 0;
        for(int i = 0; i < x.length(); i++){
            if(Character.isLetter(ch[i])){
                letters++;
            }else if(Character.isDigit(ch[i])){
                num++;
            }else if(Character.isSpaceChar(ch[i])){
                space++;
            }else{
                others++;
            }
        }
        System.out.println("Letters: "+letters);
        System.out.println("Numbers: "+num);
        System.out.println("Spaces: "+space);
        System.out.println("Others: "+others);
    }
}

