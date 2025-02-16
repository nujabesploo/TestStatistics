package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {
        // Array of test scores
        int[] testScores = {10, 7, 3, 9, 2, 14, 5, 8, 6, 4};

        // Initialize variables for calculations
        int sum = 0;
        int highScore = testScores[0];   // Start with first score
        int lowScore = testScores[0];    // Start with first score
        double median;
        double average;
        double difference;

        // Loop through array to find high, low scores and calculate sum
        for(int i = 0; i < testScores.length; i++) {
            // Update low score if current score is lower
            if(testScores[i] < lowScore) {
                lowScore = testScores[i];
            }
            // Update high score if current score is higher
            if(testScores[i] > highScore) {
                highScore = testScores[i];
            }
            // Add current score to sum
            sum += testScores[i];
        }

        // Calculate average by dividing sum by number of scores
        average = (double) sum / testScores.length;

        // Calculate median as average of highest and lowest scores
        median = (double) (highScore + lowScore) / 2;

        // Calculate difference between average and median
        difference = average - median;

        // Print all results formatted to 2 decimal places
        System.out.printf("Average is: %.2f%n", average);
        System.out.printf("High Score is: %d%n", highScore);
        System.out.printf("Low Score is: %d%n", lowScore);
        System.out.printf("Median is: %.2f%n", median);
        System.out.printf("Difference is: %.2f%n", difference);
    }
}