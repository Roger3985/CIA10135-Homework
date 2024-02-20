package HW8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Practice_HW8_1 {
    public static void main(String[] args) {
        /*  請建立一個Collection物件並將以下資料加入：
            Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
            Object物件、“Snoopy”、BigInteger(“1000”)
            • 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
            • 移除不是java.lang.Number相關的物件
            • 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成 */
        Collection<Object> collection = new ArrayList<>();
        collection.add(Integer.valueOf(100));
        collection.add(Double.valueOf(3.14));
        collection.add(Long.valueOf(21L));
        collection.add(Short.valueOf("100"));
        collection.add(Double.valueOf(5.1));
        collection.add("Kitty");
        collection.add(Integer.valueOf(100));
        collection.add(new Object());
        collection.add("Snoopy");
        collection.add(new BigInteger("1000"));

        // 印出這個物件裡的所有元素(使用Iterator)
        System.out.println("印出所有元素(使用Iterator) : ");
        Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("-----------------------------");
        // 印出這個物件裡的所有元素(使用傳統for)
        System.out.println("印出所有元素(使用傳統for) : ");
        Object[] array = collection.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("-----------------------------");
        // 印出這個物件裡的所有元素(使用傳統for)
        System.out.println("印出所有元素(使用foreach) : ");
        for (Object obj : collection) {
            System.out.println(obj);
        }

        System.out.println("-----------------------------");
        // 移除不是java.lang.Number相關的物件
        Iterator<Object> removeIterator = collection.iterator();
        while (removeIterator.hasNext()) {
            Object obj = removeIterator.next();
            if (!(obj instanceof Number)) {
                removeIterator.remove();
            }
        }

        // 再次印出所有元素
        System.out.println("\n移除非Number相關的元素後：");
        for (Object obj : collection) {
            System.out.println(obj);
        }
    }
}
