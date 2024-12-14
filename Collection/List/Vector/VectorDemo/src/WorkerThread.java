import java.util.Vector;

public class WorkerThread extends Thread{
    private Vector<Integer> vector;

    public WorkerThread(Vector<Integer> vector) {
        this.vector = vector;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            vector.add(i);

            System.out.println(Thread.currentThread().getName() + " thêm: " + i);

//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
