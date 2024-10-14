package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String a=s.nextLine();
        StringBuilder b= new StringBuilder();
        int ptr=a.length()-1;
        while(ptr>=0){
            b.append(a.charAt(ptr));
            ptr--;
        }
        System.out.println(b);
    }
}
