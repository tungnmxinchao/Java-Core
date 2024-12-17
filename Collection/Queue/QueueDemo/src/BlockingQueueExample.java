import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) {
        // Khởi tạo tài khoản ngân hàng
        BankAccount account = new BankAccount(1000);

        // Tạo hàng đợi cho các giao dịch
        BlockingQueue<Transaction> transactionQueue = new LinkedBlockingQueue<>();

        // Worker thread xử lý giao dịch
        Thread worker = new Thread(() -> {
            while (true) {
                try {
                    // Lấy giao dịch từ hàng đợi
                    Transaction transaction = transactionQueue.take();
                    System.out.println("Processing transaction for account: " + transaction.getAccountId());
                    account.withdraw(transaction.getAmount());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        });

        // Bắt đầu worker thread
        worker.start();

        // Các thread gửi yêu cầu trừ tiền
        Thread producer1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    transactionQueue.put(new Transaction("Account1", 200)); // Yêu cầu trừ 200
                    System.out.println("Producer1 added transaction: -200");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread producer2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    transactionQueue.put(new Transaction("Account1", 150)); // Yêu cầu trừ 150
                    System.out.println("Producer2 added transaction: -150");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Bắt đầu các producer threads
        producer1.start();
        producer2.start();

        // Chờ các thread hoàn thành
        try {
            producer1.join();
            producer2.join();
            Thread.sleep(1000); // Chờ worker xử lý xong
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Dừng worker thread
        worker.interrupt();
        System.out.println("Final balance: " + account.getBalance());
    }
}
