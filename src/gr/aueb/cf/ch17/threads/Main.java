package gr.aueb.cf.ch17.threads;

public class Main {

    public static void main(String[] args) {
        WorkerThread workerThread = new WorkerThread();
        Thread thread = new Thread();
        thread.start();     //όχι blocking call - είναι ασύγχρονο, δηλαδή παράλληλο

        System.out.println("Hello from Main!");
    }
}
