package Exceptions;

public class IllegalArgumentException {
    public static void main(String[] args) {
        voteEligibility(2);
    }
    public static void voteEligibility(int age){
        try{
            if(age<18){
                throw new java.lang.IllegalArgumentException("You are not eligible to vote");
            }
            else{
                System.out.println("You are eligible to vote");
            }
        }
        catch(Exception e){
            System.out.println("Exception is: " + e);
        }
    }
}
