import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

           max(10,20,30);
           min(10,2,3);
           checknumber(9);
           checkVoter(19);
           sum(10,20);
           product(10,20);




    }


    //q1:Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.


    static void max(int a, int b, int c){
        int max=0;

        if(a >max){

            max=a;
        }
        if (b > max){

            max =b;
        }
        if ( c> max){
            max=c;
        }

        System.out.println("maximum number is"+max);
    }

    static void min(int a, int b, int c){
        int min=0;

        if( a < b && a< c ){
            min=a;
        }else if ( b <a && b<c ){
            min=b;

        }else{
            min=c;
        }

        System.out.println("minimum number is"+ min);
    }


    // q2 :Define a program to find out whether a given number is even or odd.

    static void checknumber(int n){

        if ( n % 2==0){

            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }


    //q3:A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

     static void checkVoter(int age){

        if (age >= 18){
            System.out.println("eligible to vote");

        }else{
            System.out.println("eligible to vote");
        }
     }

  //q4  Write a program to print the sum of two numbers entered by user by defining your own method.

    static void sum(int num1 ,int num2){

        int res=num1+num2;
        System.out.println(res);
    }

   //5 Define a method that returns the product of two numbers entered by user.

    static void product(int num1 ,int num2){

        int res=num1*num2;
        System.out.println(res);
    }

}