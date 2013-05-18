package org.repitedwordcounter;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Tokenizer {

    private List<String> wordsFound;
    private final StringTokenizer tokenizer;

    public Tokenizer(String textToProcess) {
        this.wordsFound = new ArrayList<>();
        this.tokenizer = new StringTokenizer(textToProcess, getSpecialCharacters(), false);
    }

    public String nextWord() {
        return (tokenizer.hasMoreElements())  ? getNextWord() : null;
    }

    private String getSpecialCharacters() {
        return ",._- ";
    }

    private String getNextWord() {
        String nextToken = tokenizer.nextToken();
        wordsFound.add(nextToken);
        return nextToken;
    }
}
