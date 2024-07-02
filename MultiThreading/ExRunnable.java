public class ExRunnable implements Runnable {

    @Override
    public void run() {
        String fruits[] = { "Mango", "Apple", "Orange", "Kiwi" };
        for (int i = 0; i < fruits.length; i++) {
            try {
                Thread.sleep(500);
                System.out.println(fruits[i]+" "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // System.out.println("Run Method");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread th1 = new Thread(new ExRunnable());
        Thread th2 = new Thread(new ExRunnable());
        Thread th3 = new Thread(new ExRunnable());
        th1.start();
        th1.setName("th1");

        th2.start();
        th2.sleep(1000);
        th2.setName("th2");

        th1.yield();

        th3.start();
        th3.setName("th3");
      
        th1.resume();

    }

}
