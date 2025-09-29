package Strings;
/*
Count Vowels & Consonants / Character Frequency - Basic string frequency task (often seen in early rounds).
 */
import java.util.HashMap;

public class VowelConsonantFrequency {

    public static void countVowelsConsonants(String str){
        str = str.toLowerCase();

        int vowels =0,cons=0;
        HashMap <Character,Integer> freq = new HashMap<>();
        for(char ch:str.toCharArray()){
            if(ch>='a' && ch<='z'){
                if("aeiou".indexOf(ch) != -1){
                    vowels++;
                }
                else{
                    cons++;
                }
                freq.put(ch,freq.getOrDefault(ch,0)+1);
            }
        }

        System.out.println("String: " + str);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + cons);
        System.out.println("Character Frequencies: " + freq);
    }
    public static void main(String[] args) {
        countVowelsConsonants("Hello World");
        countVowelsConsonants("Java Programming");
        countVowelsConsonants("OpenAI GPT");
    }
}
