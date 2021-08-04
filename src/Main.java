public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        try {
            Thread.sleep(3000);
            thread.stopThread();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(thread.getState());
    }
}
