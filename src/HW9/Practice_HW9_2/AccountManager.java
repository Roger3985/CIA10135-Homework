package HW9.Practice_HW9_2;

public class AccountManager {
    // 初始餘額設定為0
    private int INITIAL_BALANCE = 0;
    // 帳戶的最大餘額限制：超過3000元就媽媽不會再匯款給熊大
    private int MAX_BALANCE = 3000;
    // 帳戶的最小餘額限制：如果帳戶餘額低於2000元，熊大就會要求媽媽匯款給他
    private int MIN_BALANCE = 2000;

    // 追蹤帳戶的餘額狀況，並在媽媽匯款給熊大或熊大提款時進行相應的更新
    private int accountBalance = INITIAL_BALANCE;

    synchronized public void transferMoneyToBear(int TRANSFER_AMOUNT) {
        while (accountBalance > MAX_BALANCE) {
            try {
                System.out.println("媽媽看到餘額在3000元以上，暫停匯款");
                if (accountBalance >= MAX_BALANCE) {
                    System.out.println("熊大被老媽告知帳號已經有錢了");
                }
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        accountBalance += TRANSFER_AMOUNT;
        System.out.println("媽媽存了2000元，帳號共有：" + accountBalance + "元");
        notify();
    }

    // 從帳戶提款給熊大，並在帳戶餘額低於最小限制時等待。一旦帳戶餘額達到最小限制，就會執行提款操作，並且通知其他可能在等待的執行緒
    synchronized public void withdrawMoneyFromBear(int WITHDRAWAL_AMOUNT) {
        while (accountBalance < MIN_BALANCE) {
            if (accountBalance == 0) {
                System.out.println("熊大看到帳戶沒錢，暫停提款");
            }
            System.out.println("媽媽被熊大要求匯款！");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        accountBalance -= WITHDRAWAL_AMOUNT;
        System.out.println("熊大領了1000元，帳號共有：" + accountBalance + "元");
        notify();
    }
}