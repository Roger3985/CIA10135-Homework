package HW9.Practice_HW9_2;

public class Test {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        Mom mom = new Mom(accountManager);
        BigBear bigBear = new BigBear(accountManager);
        mom.start();
        bigBear.start();
    }
}
