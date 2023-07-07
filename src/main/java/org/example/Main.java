package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> text = new ArrayList<>(Arrays.asList("The Tao gave birth to machine language.",
                        "Machine language gave birth to the assembler.",
                        "The assembler gave birth to the compiler.",
                        "Now there are ten thousand languages.",
                        "Each language has its purpose, however humble.",
                        "Each language expresses the Yin and Yang of software.",
                        "Each language has its place within the Tao.",
                        "But do not program in COBOL if you can avoid it. -- Geoffrey James, \"The Tao of Programming\""));
        System.out.println(new Characters().findCharacter(text));

        List<String> text2 = new ArrayList<>(Arrays.asList("C makes it easy for you to shoot yourself in the foot.",
                "C++ makes that harder, but when you do, it blows away your whole leg. (с) Bjarne Stroustrup)"));
        System.out.println(new Characters().findCharacter(text2));
    }
}
