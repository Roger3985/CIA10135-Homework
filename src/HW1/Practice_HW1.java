package HW1;

public class Practice_HW1 {

	public static void main(String[] args) {
		/* 請設計一隻Java程式，計算12，6這兩個數值的和與積 */
		int a = 12;
		int b = 6;
		
		System.out.println("第一題");
		System.out.println(a + b); // 12 + 6
		System.out.println(a * b); // 12 * 6
		
		System.out.println("-----------------------------");
		
		/* 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆) */
		int c = 200;
		int d = 12;
		
		System.out.println("第二題");
		System.out.println("200顆蛋共是" + c / d + "打" + c % d + "顆");
		
		System.out.println("-----------------------------");
		
		/* 請由程式算出256559秒為多少天、多少小時、多少分與多少秒 */
		int sum = 256559;
		int D = sum / 86400; // 利用總秒數除與一天的秒數(86400)即可以知道有幾天
		int H = (sum % 86400) / 3600; // 利用總秒數取除以一天剩餘的秒數並除以一小時的秒數(3600)即可以知道有幾小時
		int M = (sum - D * 86400 - H * 3600) / 60; // 利用總秒數減去幾天跟幾小時剩餘的秒數並除以一分鐘的秒數(60)即可以知道有幾分鐘
		int S = sum - (D * 86400) - (H * 3600) - (M * 60); // 利用總秒數減去幾天幾小時幾分鐘即可以知道剩下多少的秒數
		 
		System.out.println("第三題");
		System.out.println("256559秒為" + D + "天" + H + "小時" + M + "分" + S + "秒");
		
		System.out.println("-----------------------------");
		
		/* 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長 */
		final double PI = 3.1415; // 定義常數PI為3.1415並且因為有final使其不能進行修改
		int r = 5;
		double circle_area = Math.pow(r, 2) * PI;
		double circum = 2 * r * PI;
		
		System.out.println("第四題");
		System.out.println("半徑為5的圓面積為" + circle_area);
		System.out.println("半徑為5的圓周長為" + circum);
		
		System.out.println("-----------------------------");
		
		/* 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
		   金加利息共有多少錢 (用複利計算，公式請自行google) */
		int y, firstmoney = 1500000;
		double rate = 0.02;
		double saving = firstmoney * (1 + rate); 
		
		for(y = 1; y <= 10; y++) {
			saving *= (1 + rate);  
		}
		
		System.out.println("第五題");
		System.out.println("10年後本金加利息共有" + saving + "元");
		
		System.out.println("-----------------------------");
		
		/* 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
		   (1) 5 + 5
		   (2) 5 + ‘5’
		   (3) 5 + “5”
		   並請用註解各別說明答案的產生原因 */
		System.out.println(5+5);
		//(1)整數型別int數值5+一樣為整數型別int數值5，所得為十進位之和int數值10
		System.out.println(5+'5');
		//(2)整數型別int數值5+字元型別中的字元char5，依Unicode編碼char5代表十六進位值為0x35，換算十進位數值為整數型別int數值53，所得十進位之和int數值58
		System.out.println(5+"5");
		//(3)整數型別int數值5+字串型別String中的字串5，整數與字串相加為串接相連，所得為String字串55
		
	}

}

