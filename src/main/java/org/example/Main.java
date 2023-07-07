package org.example;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;


import static java.nio.charset.StandardCharsets.UTF_8;
import static java.nio.file.Files.lines;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> lines = lines(Paths.get("src", "main", "resources", "firstText.txt"), UTF_8).toList();
        System.out.println(new Characters().findCharacter(lines));

        List<String> lines2 = lines(Paths.get("src", "main", "resources", "secondText.txt"), UTF_8).toList();
        System.out.println(new Characters().findCharacter(lines2));

        List<String> lines3 = lines(Paths.get("src", "main", "resources", "wap.txt"), UTF_8).toList();
        System.out.println(new Characters().findCharacter(lines3));

        List<String> lines4 = lines(Paths.get("src", "main", "resources", "failTestText.txt"), UTF_8).toList();
        System.out.println(new Characters().findCharacter(lines4));
    }
}
