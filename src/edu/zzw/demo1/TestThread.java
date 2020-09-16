package edu.zzw.demo1;

public class TestThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 20; i++) {
            System.out.println("找琪琪");
        }
    }

    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        testThread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("曹丕");
        }
    }
}
