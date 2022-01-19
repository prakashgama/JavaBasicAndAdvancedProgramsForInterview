/*
 * package mutltithred;
 * 
 * import java.util.concurrent.ExecutorService; import
 * java.util.concurrent.Executors;
 * 
 * public class MyThread extends Thread {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * new MyThread();
 * 
 * ExecutorService e=Executors.newCachedThreadPool();
 * 
 * e.execute(new MyThread());
 * 
 * e.shutdown();
 * 
 * }
 * 
 * @Override public void run() { // TODO Auto-generated method stub
 * 
 * System.out.println("My Thread" +Thread.currentThread().getName());
 * super.run(); }
 * 
 * 
 * public MyThread() { // TODO Auto-generated constructor stub this.start(); } }
 */