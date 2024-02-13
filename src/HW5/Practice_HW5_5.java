package HW5;

import java.util.Random;

public class Practice_HW5_5 {
    public static void main(String[] args) {
        // 身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫與數字的亂數組合
        String authCode = genAuthCode();
        System.out.println("生成驗證碼是：" + authCode);
    }

    public static String genAuthCode() {
        // 定義包含大小寫字母和數字的字元集合
        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder authCode = new StringBuilder();
        Random random = new Random();

        // 產生8位元隨機驗證碼
        for (int i = 0; i < 8; i++) {
            // 從字元集合中隨機選擇一個字符
            int index = random.nextInt(charSet.length());
            char randomChar = charSet.charAt(index);
            authCode.append(randomChar);
        }
        return authCode.toString();
    }

}
