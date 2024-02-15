package HW7;

import java.io.*;

class Dog implements Serializable {
    String name;

    Dog(String name) {
        this.name = name;
    }
}

class Cat implements Serializable {
    String name;

    Cat(String name) {
        this.name = name;
    }
}

public class Practice_HW7_4 {
    public static void main(String[] args) {
    	/* 請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
           意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾 */
        // 建立 Dog 和 Cat 物件
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // 確保目錄存在，若不存在則建立
        File directory = new File("C:\\data");
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // 寫入物件到檔案
        String filename = "C:\\data\\Object.ser";
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            // 寫入 Dog 和 Cat 物件
            out.writeObject(dog);
            out.writeObject(cat);

            System.out.println("物件已成功寫入檔案 " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
