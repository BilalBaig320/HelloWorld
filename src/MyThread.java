 public class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run(){
        int i =0;
        while(i<20){
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am happy!");
            i++;
        }
    }

     public static void main(String[] args) {
         MyThread t1 = new MyThread("Bilal");
         MyThread2 t2 = new MyThread2();
         t1.start();
     try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
         System.out.println(t1.getId());
         System.out.println(t1.getName());
         t2.start();
     }
}
 class MyThread2 extends Thread{
     @Override
     public void run(){
         int i =0;
         while(i<20){
             System.out.println("My Study Thread is Running");
             System.out.println("I am sad!");
             i++;
         }
     }
 }
// class MyThreadRunnable1 implements Runnable{
//    public MyThreadRunnable1(){
//
//    }
//    public void run(){
//         for (int i =0;i<2;i++) {
//             System.out.println("I am a thread 1 not a threat 2");
//         }
//     }
// }
// class MyThreadRunnable2 implements Runnable{
//     public void run(){
//         for (int i =0;i<2;i++) {
//             System.out.println("I am a thread 2 not a threat 1");
//         }
//     }
// }
//class cwh_71_runnable {
//    public static void main(String[] args) {
//        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
//        Thread gun1 = new Thread(bullet1);
//
//        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
//        Thread gun2 = new Thread(bullet2);
//
//        gun1.start();
//        gun2.start();
//    }
//}

