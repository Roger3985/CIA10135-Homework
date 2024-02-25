package HW9;

import java.util.Random;

public class Practice_HW9_1 {
    public static void main(String[] args) {
        /*
            • 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的 競賽過程。
            • 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。 Sleep時間由亂數產生500~3000之間的毫秒數，如圖所示
            • 參考範例:CounterRunnable.java
            • 需留意主執行緒執行順序
        */


        // 產生BunEnter物件
        BunEnter r1 = new BunEnter("饅頭人");
        // 再由BunEnter物件, 產生執行緒Thread物件
        Thread bunManThread = new Thread(r1);
        // 產生BunEnter物件
        BunEnter r2 = new BunEnter("詹姆士");
        // 再由BunEnter物件, 產生執行緒Thread物件
        Thread jamesThread = new Thread(r2);

        System.out.println("-----大胃王快食比賽開始！-----");
        // 呼叫執行緒物件的start()方法(即啟動執行緒) , 隨即執行物件中的run方法
        bunManThread.start();
        jamesThread.start();

        // 確保跑完t1跟t2才跑下方的-----大胃王快食比賽結束！-----
        try {
            // 等待bunManThread執行完畢
            bunManThread.join();
            // 等待jamesThread執行完畢
            jamesThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("-----大胃王快食比賽結束！-----");

    }
}

class BunEnter implements Runnable {
    int counter = 0;
    private String name;
    private Random random;

    // 空參建構子
    public BunEnter(){}

    // 有參建構子
    public BunEnter(String name) {
        this.name = name;
        this.random = new Random();
    }

    @Override
    public void run() {
        while (counter < 10) {
            counter++;
            System.out.println(name + "吃第" + counter + "碗飯");

            try {
                // 隨機等待時間500~3000毫秒
                Thread.sleep(random.nextInt(2500) + 500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + "吃完了！");
    }
}
