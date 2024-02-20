package HW8.Practice_HW8_2;

import java.util.*;

public class Practice_HW8_2_2 {
    public static void main(String[] args) {
        /*  在main方法裡透過建構子產生以下7個Train的物件，放到每小題需使用的集合裡
            - (202, “普悠瑪”, “樹林”, “花蓮”, 400)
            - (1254, “區間”, “屏東”, “基隆”, 700)
            - (118, “自強”, “高雄”, “台北”, 500)
            - (1288, “區間”, “新竹”, “基隆”, 400)
            - (122, “自強”, “台中”, “花蓮”, 600)
            - (1222, “區間”, “樹林”, 七堵, 300)
            - (1254, “區間”, “屏東”, “基隆”, 700)
            • 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
            • (以上三題請根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等) */

        // 建立Train物件並放到集合中
        List<Train> trains = new ArrayList<>();

        Train train1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
        Train train2 = new Train(1254, "區間", "屏東", "基隆", 700);
        Train train3 = new Train(118, "自強", "高雄", "台北", 500);
        Train train4 = new Train(1288, "區間", "新竹", "基隆", 400);
        Train train5 = new Train(122, "自強", "台中", "花蓮", 600);
        Train train6 = new Train(1222, "區間", "樹林", "七堵", 300);
        Train train7 = new Train(1254, "區間", "屏東", "基隆", 700);

        trains.add(train1);
        trains.add(train2);
        trains.add(train3);
        trains.add(train4);
        trains.add(train5);
        trains.add(train6);
        trains.add(train7);

        // Train物件以班次編號由大到小排序
        Collections.sort(trains);

        // 班次編號由大到小印出的Train物件(使用迭代器(iterator)) :
        System.out.println("班次編號由大到小印出的Train物件(使用迭代器(iterator)) : ");
        Iterator<Train> iterator = trains.iterator();
        while (iterator.hasNext()) {
            Train train = iterator.next();
            System.out.println(train);
        }

        System.out.println("---------------------------------------------------------------------------------");
        // 班次編號由大到小印出的Train物件(使用傳統for) :
        System.out.println("班次編號由大到小印出的Train物件(使用傳統for) : ");
        Object[] array = trains.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("---------------------------------------------------------------------------------");
        // 班次編號由大到小印出的Train物件(使用foreach)
        System.out.println("班次編號由大到小印出的Train物件(使用foreach) : ");
        for (Train train : trains) {
            System.out.println(train);
        }
    }
}
