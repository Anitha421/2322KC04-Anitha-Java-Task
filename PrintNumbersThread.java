class NumberPrinter extends Thread {
    @Override
    public void run() {
        System.out.println("Thread started: Printing numbers 1 to 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
        System.out.println("Thread finished.");
    }
}

public class PrintNumbersThread {
    public static void main(String[] args) {
        NumberPrinter thread = new NumberPrinter();
        thread.start();  
    }
}
