package HW8.Practice_HW8_2;

import java.util.*;

public class Practice_HW8_2_3 {
    public static void main(String[] args) {
        /*  在main方法裡透過建構子產生以下7個Train的物件，放到每小題需使用的集合裡
            - (202, “普悠瑪”, “樹林”, “花蓮”, 400)
            - (1254, “區間”, “屏東”, “基隆”, 700)
            - (118, “自強”, “高雄”, “台北”, 500)
            - (1288, “區間”, “新竹”, “基隆”, 400)
            - (122, “自強”, “台中”, “花蓮”, 600)
            - (1222, “區間”, “樹林”, 七堵, 300)
            - (1254, “區間”, “屏東”, “基隆”, 700)
            • 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
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

        // 使用TreeSet集合排序並不重複印出Train物件
        TreeSet<Train> uniqueTrainsSorted = new TreeSet<>(new Comparator<Train>() {
            // 使用匿名類別實現Comparator介面的方式：
            @Override
            public int compare(Train t1, Train t2) {
                return Integer.compare(t2.getNumber(), t1.getNumber());
            }
        });
        uniqueTrainsSorted.addAll(trains);

        // 不僅能讓班次編號由大排到小， 還可以不重複Train物件(使用迭代器(iterator)) :
        System.out.println("不僅能讓班次編號由大排到小，還可以不重複Train物件(使用迭代器(iterator)) : ");
        Iterator<Train> iterator = uniqueTrainsSorted .iterator();
        while (iterator.hasNext()) {
            Train train = iterator.next();
            System.out.println(train);
        }

        System.out.println("---------------------------------------------------------------------------------");
        // 不僅能讓班次編號由大排到小， 還可以不重複Train物件(使用傳統for) :
        System.out.println("不僅能讓班次編號由大排到小，還可以不重複Train物件(使用傳統for) : ");
        Object[] array = uniqueTrainsSorted .toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("---------------------------------------------------------------------------------");
        // 不僅能讓班次編號由大排到小， 還可以不重複Train物件(使用foreach)
        System.out.println("不僅能讓班次編號由大排到小，還可以不重複Train物件(使用foreach) : ");
        for (Train train : uniqueTrainsSorted ) {
            System.out.println(train);
        }
    }
}
