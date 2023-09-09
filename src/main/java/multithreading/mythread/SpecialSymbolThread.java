package src.main.java.multithreading.mythread;

public class SpecialSymbolThread extends Thread{
    public void run(){

        for(int i = 0; i < 10; i++) {
            System.out.println("Special Symbol Thread is executed!");
        }
    }

}
