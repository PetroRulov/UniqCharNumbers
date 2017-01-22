package com.foxminded.uniqcharnumbers;

import com.foxminded.uniqcharnumbers.model.ResultFinder;
import com.foxminded.uniqcharnumbers.model.ResultsHolder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        boolean isExit = false;
        String prober = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ResultsHolder resultsHolder = new ResultsHolder();

        while (!isExit) {
            try {
                prober = reader.readLine();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            if ("exit".equals(prober)) {
                isExit = true;
            } else {
                ResultFinder result = new ResultFinder();
                if (resultsHolder.getResultsMap().containsKey(prober)) {
                    resultsHolder.getResultsMap().get(prober).printResult(prober);
                } else {
                    result.printResult(prober);
                    resultsHolder.putResultIntoResultsMap(prober, result);
                }
            }
        }
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}
