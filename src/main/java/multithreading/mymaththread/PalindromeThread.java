package src.main.java.multithreading.mymaththread;

public class PalindromeThread extends Thread{

    public void run(){
        int sum=0;
    for(int i=1;i<100;i++) {
        while (i >= 0) {
            int rem = i % 10;
            sum = rem * 10 + sum;
            i = i / 10;
            System.out.println("palindrome number is: " + sum);
        }
        }
    }
}
