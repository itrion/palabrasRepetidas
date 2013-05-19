package org.repitedwordcounter;

import java.util.ArrayList;
import java.util.List;

public class WordRepitedRemover {

    private List<String> textProcessed;
    private Tokenizer tokenizer;

    public WordRepitedRemover(String textToProcess) {
        this.textProcessed = new ArrayList<>();
        this.tokenizer = new Tokenizer(textToProcess);
    }

    public int size() {
        return textProcessed.size();
    }

    public void removeRepited() {
        String nextWord;
        while ((nextWord = tokenizer.nextWord()) != null) {
            if (textProcessed.contains(nextWord)) continue;
            textProcessed.add(nextWord);
        }
    }

    public List<String> getProcessedWords() {
        return textProcessed;
    }
}
