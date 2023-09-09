package src.main.java.multithreading.mythread;

public class AlphabetThread extends Thread{
    public void run(){

        for(int i = 0; i < 10; i++) {
            System.out.println("Alphabet Thread is executed!");
        }
    }
}
