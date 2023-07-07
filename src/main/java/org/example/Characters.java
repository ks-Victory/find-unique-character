package org.example;

import java.util.*;

public class Characters {

    public char findCharacter(List<String> lines){
        List<String> words = lines.stream()
                .flatMap(line -> Arrays.stream(line.split("[^\\p{L}\\p{N}]+")))
                .toList();

        List<Character> characters = new ArrayList<>();
        for (String word: words) {
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (word.lastIndexOf(ch) == word.indexOf(ch)){
                    characters.add(ch);
                    break;
                }
            }
        }

        List<Character> uniqueChars = new ArrayList<>();
        characters.forEach(ch -> {
            if (characters.lastIndexOf(ch) == characters.indexOf(ch)){
                uniqueChars.add(ch);
            }
        });

        return uniqueChars.get(0);
    }
}
