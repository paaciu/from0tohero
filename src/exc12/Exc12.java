package exc12;

import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person{
    private int[] testScores;
    public Student(
            String firstName,
            String lastName,
            int id,
            int[] testScores){
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    char calculate() {
        int sumOfGrades = 0;
        int avg;
        char grade;
        for (int i = 0; i <testScores.length; i++) {
            sumOfGrades += sumOfGrades+testScores[i];
        }
        avg = sumOfGrades/testScores.length;

        if (avg>=90){
            grade ='O';
        } else if (avg>=80) {
            grade ='E';
        } else if (avg>=70){
            grade ='A';
        } else if (avg>=55){
            grade ='P';
        } else if (avg>=40){
            grade ='D';
        } else grade = 'T';

        return grade;
    }
}

class Exc12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}