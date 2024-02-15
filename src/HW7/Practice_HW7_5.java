package HW7;

import java.io.*;
import java.util.ArrayList;

abstract class Animal implements Serializable {
    abstract void speak();
}

class Dog2 extends Animal {
    String name;

    Dog2(String name) {
        this.name = name;
    }

    @Override
    void speak() {
        System.out.println(name + " says Woof!");
    }
}

class Cat2 extends Animal {
    String name;

    Cat2(String name) {
        this.name = name;
    }

    @Override
    void speak() {
        System.out.println(name + " says Meow!");
    }
}

public class Practice_HW7_5 {
    public static void main(String[] args) {
        /* 承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何 (請利用多
           型簡化本題的程式設計) */
        // 讀取物件
        String filename = "C:\\data\\Object.ser";
        ArrayList<Animal> animals = readObjects(filename);

        // 執行 speak() 方法
        if (animals != null) {
            for (Animal animal : animals) {
                animal.speak();
            }
        }
    }

    // 讀取物件方法
    public static ArrayList<Animal> readObjects(String filename) {
        ArrayList<Animal> animals = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            while (true) {
                Object obj = in.readObject();
                if (obj instanceof Animal) {
                    animals.add((Animal) obj);
                }
            }
        } catch (EOFException e) {
            // 到達檔案結尾
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return animals;
    }
}