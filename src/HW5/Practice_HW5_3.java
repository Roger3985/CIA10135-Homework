package HW5;

public class Practice_HW5_3 {
    public static void main(String[] args) {
        // 利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，可以找出二維陣列的最大值並回傳
        int[][] intArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[][] doubleArray = {{1.1, 2.2, 3.3}, {4.4, 5.5, 6.6}, {7.7, 8.8, 9.9}};

        System.out.println("整數陣列中的最大值: " + maxElement(intArray));
        System.out.println("浮點數陣列中的最大值: " + maxElement(doubleArray));
    }

    // 找出整数陣列的最大值
    public static int maxElement(int[][] x) {
        int max = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                int num = x[i][j];
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    // 找出浮點数陣列的最大值
    public static double maxElement(double[][] x) {
        double max = 0.0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                double num = x[i][j];
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

}
