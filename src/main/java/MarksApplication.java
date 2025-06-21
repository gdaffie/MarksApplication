/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unico
 */


//import the java decimalformat class
import java.math.BigDecimal;
import java.math.RoundingMode;
        
public class MarksApplication {
    private String moduleName;
    private int[][] marks;
    
    // Constructor to initialize course names and marks
    public MarksApplication(String moduleName, int[][] marks) {
        this.moduleName = moduleName;
        this.marks = marks;
    }

    // Get the module name
    public String getModuleName() {
        return moduleName;
    }

    // Set the module name
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    // Get the marks
    public int[][] getMarks() {
        return marks;
    }

    // Set the marks
    public void setMarks(int[][] marks) {
        this.marks = marks;
    }

    // Find the lowest mark
    public int findLowestMark() {
        int lowestMark = Integer.MAX_VALUE;

        for (int[] studentMarks : marks) {
            for (int mark : studentMarks) {
                if (mark < lowestMark) {
                    lowestMark = mark;
                }
            }
        }

        return lowestMark;
    }

    // Find the highest mark
    public int findHighestMark() {
        int highestMark = Integer.MIN_VALUE;

        for (int[] studentMarks : marks) {
            for (int mark : studentMarks) {
                if (mark > highestMark) {
                    highestMark = mark;
                }
            }
        }

        return highestMark;
    }

 

    // Display the report
    public void displayReport() {
        
        int lowestMark = findLowestMark();
        int highestMark = findHighestMark();
        int cat1 = 0;
        int cat2 = 0;
        int cat3 = 0;
        int cat4 = 0;
        int cat5 = 0;
        int cat6 = 0;
        int cat7 = 0;
        int cat8 = 0;
        int cat9 = 0;
        int cat10 = 0;
        int cat11 = 0;
        
       
        System.out.println("Welcome to CTU marks for: ");
        System.out.println(moduleName);
        System.out.println("");
        System.out.println("The marks are:");
        System.out.println("");
        
        System.out.println("            Formative 1  Formative 2  Formative 3  Average");
        for (int i = 0; i < marks.length; i++) {
             String mark1 = Integer.toString(marks[i][0]);
             String mark2 = Integer.toString(marks[i][1]);
             String mark3 = Integer.toString(marks[i][2]);
            
            double averageMark =((marks[i][0]+marks[i][1]+marks[i][2]) / 3.00);
            BigDecimal big = new BigDecimal(averageMark);
            big = big.setScale(2,RoundingMode.HALF_DOWN);
            String student = (" Student " + (i + 1) + ":    " + mark1 + "           " + mark2 + "            " + mark3 + "        " +big);
            System.out.println(student);
                   
            //Column 1 Mark Distribution
            
            if (marks[i][0] < 10 ) {
                cat1 = cat1 + 1;
            }
            else if (marks[i][0] <= 19 ) {
                cat2 = cat2 +  1;
            }
            else if (marks[i][0] <= 29 ) {
                cat3 = cat3 +  1;
            }
            else if (marks[i][0] <= 39 ) {
                cat4 = cat4 +  1;
            }
            else if (marks[i][0] <= 49 ) {
                cat5 = cat5 +  1;
            }
            else if (marks[i][0] <= 59 ) {
                cat6 = cat6 +  1;
            }
            else if (marks[i][0] <= 69 ) {
                cat7 = cat7 +  1;
            }
            else if (marks[i][0] <= 79 ) {
                cat8 = cat8 +  1;
            }
            else if (marks[i][0] <= 89 ) {
                cat9 = cat9 +  1;
            }
            else if (marks[i][0] <= 99 ) {
                cat10 = cat10 +  1;
            }
            else if (marks[i][0] == 100 ) {
                cat11 = cat11 +  1;
            }
            
            //Column 2 Mark Distribution
            
            if (marks[i][1] < 10 ) {
                cat1 = cat1 + 1;
            }
            else if (marks[i][1] <= 19 ) {
                cat2 = cat2 +  1;
            }
            else if (marks[i][1] <= 29 ) {
                cat3 = cat3 +  1;
            }
            else if (marks[i][1] <= 39 ) {
                cat4 = cat4 +  1;
            }
            else if (marks[i][1] <= 49 ) {
                cat5 = cat5 +  1;
            }
            else if (marks[i][1] <= 59 ) {
                cat6 = cat6 +  1;
            }
            else if (marks[i][1] <= 69 ) {
                cat7 = cat7 +  1;
            }
            else if (marks[i][1] <= 79 ) {
                cat8 = cat8 +  1;
            }
            else if (marks[i][1] <= 89 ) {
                cat9 = cat9 +  1;
            }
            else if (marks[i][1] <= 99 ) {
                cat10 = cat10 +  1;
            }
            else if (marks[i][1] == 100 ) {
                cat11 = cat11 +  1;
            }
            
            //Column 3 Mark Distribution
            
            if (marks[i][2] < 10 ) {
                cat1 = cat1 + 1;
            }
            else if (marks[i][2] <= 19 ) {
                cat2 = cat2 +  1;
            }
            else if (marks[i][2] <= 29 ) {
                cat3 = cat3 +  1;
            }
            else if (marks[i][2] <= 39 ) {
                cat4 = cat4 +  1;
            }
            else if (marks[i][2] <= 49 ) {
                cat5 = cat5 +  1;
            }
            else if (marks[i][2] <= 59 ) {
                cat6 = cat6 +  1;
            }
            else if (marks[i][2] <= 69 ) {
                cat7 = cat7 +  1;
            }
            else if (marks[i][2] <= 79 ) {
                cat8 = cat8 +  1;
            }
            else if (marks[i][2] <= 89 ) {
                cat9 = cat9 +  1;
            }
            else if (marks[i][2] <= 99 ) {
                cat10 = cat10 +  1;
            }
            else if (marks[i][2] == 100 ) {
                cat11 = cat11 +  1;
            }  
        }

        // Convert numbers to "[*]" 
        
        String mark_dist = ("[*]");
        String repeated_cat1 = mark_dist.repeat(cat1);
        String repeated_cat2 = mark_dist.repeat(cat2);
        String repeated_cat3 = mark_dist.repeat(cat3);
        String repeated_cat4 = mark_dist.repeat(cat4);
        String repeated_cat5 = mark_dist.repeat(cat5);
        String repeated_cat6 = mark_dist.repeat(cat6);
        String repeated_cat7 = mark_dist.repeat(cat7);
        String repeated_cat8 = mark_dist.repeat(cat8);
        String repeated_cat9 = mark_dist.repeat(cat9);
        String repeated_cat10 = mark_dist.repeat(cat10);
        String repeated_cat11 = mark_dist.repeat(cat11);
      
        // Display Mark Distribution
        
        System.out.println("");
        System.out.println("The lowest mark in the mark application is: " + lowestMark);
        System.out.println("The highest mark in the mark application is: " + highestMark);
        System.out.println("");
        System.out.println("Mark Distribution:");
        System.out.println("0-9: " + repeated_cat1);
        System.out.println("10-19: " + repeated_cat2);
        System.out.println("20-29: " + repeated_cat3);
        System.out.println("30-39: " + repeated_cat4);
        System.out.println("40-49: " + repeated_cat5);
        System.out.println("50-59: " + repeated_cat6);
        System.out.println("60-69: " + repeated_cat7);
        System.out.println("70-79: " + repeated_cat8);
        System.out.println("80-89: " + repeated_cat9);
        System.out.println("90-99: " + repeated_cat10);
        System.out.println("100: " + repeated_cat11);
        
        }
    
    // Define mark list
    public static void main(String[] args) {
        int[][] marks = {
            {87, 96, 70},
            {68, 87, 90},
            {94, 100, 90},
            {100, 81, 82},
            {83, 25, 85},
            {78, 87, 65},
            {85, 75, 83},
            {91, 94, 100},
            {76, 72, 40},
            {87, 93, 73}
        };

        MarksApplication marksApplication = new MarksApplication("Beginner Java [JD521]", marks);
        marksApplication.displayReport();
    }
}
