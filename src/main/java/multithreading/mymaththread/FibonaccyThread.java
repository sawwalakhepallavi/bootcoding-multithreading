package src.main.java.multithreading.mymaththread;

public class FibonaccyThread extends Thread{
    int p1=1;
    int p2=1;
    int sum=1;

    public void run(){

        for (int i = 1; i <=10; i++) {
            p2 = p1;
            p1 = sum;
            sum = p1 + p2;

            System.out.println("fibo number is :-"+sum);
        }


    }
}
