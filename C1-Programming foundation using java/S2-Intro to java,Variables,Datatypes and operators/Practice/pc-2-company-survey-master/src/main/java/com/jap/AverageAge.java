package com.jap;

public class AverageAge {

    public String averageAgeCalculator(String[] ageRawData) {
        double sum = 0;
        int validCount = 0;

        try {
            for (String ageStr : ageRawData) {
                double age = Double.parseDouble(ageStr);
                sum += age;
                validCount++;
            }
            if (validCount > 0) {
                double avg = sum / validCount;
                return String.format("Average Age – %.2f", avg);
            } else {
                throw new IllegalArgumentException("No valid ages found in the input");
            }

        } catch (NumberFormatException e) {
            return "java.lang.NumberFormatException: " + e.getMessage();
        } catch (Exception exception) {
            return exception.toString();
        }
    }

}
