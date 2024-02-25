package HW9.Practice_HW9_2;

public class Mom extends Thread {
    AccountManager accountManager;

    public Mom(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            accountManager.transferMoneyToBear(2000); // 每次媽媽會存款1000元
        }
    }
}
