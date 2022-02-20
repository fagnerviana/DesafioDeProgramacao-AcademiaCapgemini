package questoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questoes03 {

    public static Scanner scan = new Scanner(System.in);

    public static void Anagrams(String _word) {

        int count = 0;
        List<String> anagram = new ArrayList<String>();

        for (int i = 0; i < _word.length(); i++) {
            for (int j = 1; j < _word.length(); j++) {
                if (_word.charAt(i) == _word.charAt(j) && i != j && i < j) {
                    if (_word.charAt(i) == _word.charAt(i + 1)) {
                        String aux = _word.substring(i, i + 1);
                        anagram.add(aux);
                    } else {
                        String aux2 = _word.substring(i, j);
                        String aux3 = _word.substring(i + 1, j + 1);
                        String aux4 = _word.substring(i, i + 1);
                        anagram.add(aux2);
                        anagram.add(aux3);
                        anagram.add(aux4);
                    }
                }
            }
        }

        for (int i = 1; i < anagram.size(); i++) {
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {

        System.out.println("Digite a palavra:");
        String word = scan.next();
        Anagrams(word);

    }

}