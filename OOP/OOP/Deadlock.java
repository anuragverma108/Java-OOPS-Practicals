/******** Deadlock ********/

/** Deadlock is a special type of error that need to avoid that relates specifically 
    to multitasking. It mainly occurs when two threads have a circular dependency on 
    a pair of synchronized objects.
**/

class A{
	synchronized void foo(B b){
		String name = Thread.currentThread().getName();
		System.out.println(name + "entered A.foo");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("A interrupted");
		}
		
		System.out.println(name + " try to call B.last()");
		b.last();
	}
	synchronized void last(){
		System.out.println("Inside A.last");
	}
}

class B{
	synchronized void bar(A a){
		String name = Thread.currentThread().getName();
		System.out.println(name + "entered B.bar");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("B interrupted");
		}
		
		System.out.println(name + " try to call A.last()");
		a.last();
	}
	synchronized void last(){
		System.out.println("Inside B.last");
	}
}

class Deadlock implements Runnable{
	A a = new A();
	B b = new B();

	Deadlock(){
		Thread.currentThread().setName("Main Thread");
		Thread t = new Thread(this, "Child Thread");
		t.start();
		a.foo(b);
		System.out.println("Back in main thread");
	}

	public void run(){
		b.bar(a); 
		System.out.println("Back in child thread");
	}

	public static void main(String args[]){
		new Deadlock();
	}
}
		