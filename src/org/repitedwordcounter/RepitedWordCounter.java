package org.repitedwordcounter;

import java.util.List;

public class RepitedWordCounter {

    private String sourceText;
    private String toCompareTest;

    public RepitedWordCounter(String textSource, String textToCompare) {
        this.sourceText = textSource;
        this.toCompareTest = textToCompare;
    }

    public int count() {
        List<String> sourceTextMapped = mapText(sourceText);
        List<String> toCompareTextMapped = mapText(toCompareTest);
        return compareLists(toCompareTextMapped, sourceTextMapped);
    }

    private List<String> mapText(String sourceText) {
        WordRepitedRemover wordRepitedRemover = new WordRepitedRemover(sourceText);
        wordRepitedRemover.removeRepited();
        return wordRepitedRemover.getProcessedWords();
    }

    private int compareLists(List<String> toCompareTextMapped, List<String> sourceTextMapped) {
        int repitedWordCounter = 0;
        for (String toCompareWord : toCompareTextMapped)
            for (String sourceWord : sourceTextMapped)
                if (toCompareWord.equals(sourceWord)) repitedWordCounter++;
        return repitedWordCounter;
    }
}
