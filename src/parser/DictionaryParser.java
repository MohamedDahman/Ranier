package parser;

import Dictionary.Word;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DictionaryParser {

    public static List<Word> loadDictionary(String filePath) {
        try {
            Path path = Paths.get(filePath);

            Stream<String> lines = Files.lines(Paths.get(filePath));
            return lines
                    .map(e->toWord(e))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();


        }

    }

    private static Word toWord(String columns)
    {

                String[] data = columns.split(";");
                String englishWord = data[0];
                String germanWord = data[1];
                Word word = new Word(englishWord, germanWord);
                return word;

    }

}
