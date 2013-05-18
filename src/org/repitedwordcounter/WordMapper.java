package org.repitedwordcounter;

import java.util.ArrayList;
import java.util.List;

public class WordMapper {

    private String textToMap;
    private List<String> map;

    public WordMapper(String textToMap) {
        this.textToMap = textToMap;
        this.map = new ArrayList<>();
    }

    public int size() {
        return map.size();
    }

    public void map() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
