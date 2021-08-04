public class MyThread extends Thread {
    private boolean isAlive = true;

    @Override
    public void run() {
        while (isAlive) {
            System.out.println("I am alive");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("I am not alive");
    }

    public void stopThread() {
        isAlive = false;
    }
}
