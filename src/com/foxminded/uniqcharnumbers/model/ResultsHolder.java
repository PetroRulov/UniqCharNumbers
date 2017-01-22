package com.foxminded.uniqcharnumbers.model;

import java.util.HashMap;
import java.util.Map;

public class ResultsHolder {
    private Map<String, ResultFinder> resultsMap = new HashMap<>();

    public Map<String, ResultFinder> getResultsMap() {
        return resultsMap;
    }

    public void putResultIntoResultsMap(String str, ResultFinder result) {
        resultsMap.put(str, result);
    }
}
