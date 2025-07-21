class NumberThread extends Thread {
    @Override
    public void run() {
        System.out.println("NumberThread starting...");
        for (int i = 1; i <= 5; i++) {
            System.out.println("NumberThread: " + i);
            try {
                Thread.sleep(1000); // sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("NumberThread interrupted.");
            }
        }
        System.out.println("NumberThread finished.");
    }
}

class MessageThread extends Thread {
    private Thread threadToWaitFor;

    public MessageThread(Thread threadToWaitFor) {
        this.threadToWaitFor = threadToWaitFor;
    }

    @Override
    public void run() {
        System.out.println("MessageThread waiting for NumberThread to finish...");
        try {
            threadToWaitFor.join(); 
        } catch (InterruptedException e) {
            System.out.println("MessageThread interrupted.");
        }
        System.out.println("MessageThread: Now NumberThread is done, I can run.");
    }
}

public class ThreadCoordinationDemo {
    public static void main(String[] args) {
        NumberThread numberThread = new NumberThread();
        MessageThread messageThread = new MessageThread(numberThread);

        numberThread.start();
        messageThread.start();
    }
}
