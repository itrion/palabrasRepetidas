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
        int counter = 0;
        List<String> sourceTextMapped = mapText(sourceText);
        List<String> toCompareTextMapped = mapText(toCompareTest);
        for (String toCompareWord : toCompareTextMapped)
            for (String sourceWord : sourceTextMapped)
                if (toCompareWord.equals(sourceWord))
                    counter++;
        return counter;
    }

    private List<String> mapText(String sourceText) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
