package HW9.Practice_HW9_2;

public class BigBear extends Thread {
    AccountManager accountManager;

    public BigBear(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            accountManager.withdrawMoneyFromBear(1000); // 每次熊大會提款1000元
        }
    }
}
