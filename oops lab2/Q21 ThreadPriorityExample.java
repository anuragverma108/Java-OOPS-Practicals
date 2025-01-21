// File Name: ThreadPriorityExample.java

class MyThread extends Thread {
    public MyThread(String name) {
        super(name); // Set thread name
    }

    @Override
    public void run() {
        // Print the thread's name and priority
        System.out.println("Thread Name: " + Thread.currentThread().getName() +
                           ", Priority: " + Thread.currentThread().getPriority());
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        // Create 3 threads with different priorities
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");
        MyThread thread3 = new MyThread("Thread-3");

        // Set different priorities
        thread1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        thread2.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default)
        thread3.setPriority(Thread.MAX_PRIORITY);  // Priority 10

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

/*
Steps to run the file:

1. Save the file as "ThreadPriorityExample.java".
2. Open a terminal or command prompt.
3. Navigate to the directory where the file is saved.
4. Compile the Java file:
   javac ThreadPriorityExample.java
5. Run the compiled program:
   java ThreadPriorityExample

Sample Output:

Thread Name: Thread-1, Priority: 1
Thread Name: Thread-2, Priority: 5
Thread Name: Thread-3, Priority: 10
*/
