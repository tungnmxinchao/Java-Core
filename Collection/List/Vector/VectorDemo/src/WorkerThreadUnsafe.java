import java.util.ArrayList;

public class WorkerThreadUnsafe extends Thread{
    private ArrayList<Integer> list;

    public WorkerThreadUnsafe(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            list.add(i);
            System.out.println(Thread.currentThread().getName() + " thêm: " + i);
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                System.out.println(e.getMessage());
//            }
        }
    }
}
