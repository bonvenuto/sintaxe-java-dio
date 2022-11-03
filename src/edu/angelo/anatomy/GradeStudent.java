package edu.angelo.anatomy;

public class GradeStudent {
    public static void main(String[] args) {
        int gradeFinal = 7;
        if(gradeFinal<6)
            System.out.println("REPROVED");
        else if(gradeFinal==6)
            System.out.println("EXAM");
        else
            System.out.println("APPROVED");
    }
}
