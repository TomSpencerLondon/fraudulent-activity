package org.example;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'activityNotifications' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY expenditure
     *  2. INTEGER d
     */

    public static int activityNotifications(List<Integer> expenditure, int d) {
        int[] counts = new int[201];
        int activityNotifications = 0;

        for (int i = 0; i < d; i++) {
            counts[expenditure.get(i)]++;
        }

        for (int i = d; i < expenditure.size(); i++) {
            double median = getMedian(d, counts);

            if (expenditure.get(i) >= (median * 2)) {
                activityNotifications++;
            }

            counts[expenditure.get(i  - d)]--;
            counts[expenditure.get(i)]++;
        }

        return activityNotifications;
    }

    public static double getMedian(int d, int[] counts) {
        if (d % 2 != 0) {
            int count = 0;
            int median = ((d / 2) + 1);
            for (int i = 0; i < counts.length; i++) {
                count += counts[i];

                if (count >= median) {
                    return i;
                }
            }
        } else {
            int count = 0;
            int firstMedian = (d / 2);
            int secondMedian = (d / 2) + 1;
            boolean firstFound = false;
            double first = 0;
            double second = 0;

            for (int i = 0; i < counts.length; i++) {
                count += counts[i];

                if (!firstFound && count >= firstMedian) {
                    firstFound = true;
                    first = i;
                }

                if (firstFound && count >= secondMedian) {
                    second = i;
                    return (first + second) / 2;
                }
            }
        }

        return 0.0;
    }

}

