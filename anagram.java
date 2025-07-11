import java.util.Scanner;
import java.util.Arrays;
public class anagram {
    public static void main(String[] args) {
        String name;
        String anagram;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        name = sc.nextLine();
        System.out.println("Enter the second string:");
        anagram = sc.nextLine();
        char[] nameArray = name.toCharArray();
        char[] anagramArray = anagram.toCharArray();
        Arrays.sort(nameArray);
        Arrays.sort(anagramArray);
        if (Arrays.equals(nameArray, anagramArray)) {
            System.out.println(name + " and " + anagram + " are anagrams.");
        } else {
            System.out.println(name + " and " + anagram + " are not anagrams.");
        }
        sc.close();
    }
}
