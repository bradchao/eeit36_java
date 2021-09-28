package tw.brad.myjava;

public class Brad13 {

	public static void main(String[] args) {
		int year = 2020;
		// 年份月份天數
		int month = 2; //(int) (Math.random() * 12) + 1;	// 1,2,3 ,...12
		int days;

		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				days = 31;
				break;
			//---------------------------------------
			case 4: case 6: case 9: case 11:
				days = 30;
				break;
			//---------------------------------------
			case 2:
				if (year % 4 == 0) {
					if (year % 100 == 0) {
						if (year % 400 == 0) {
							days = 29;
						}else {
							days = 28;
						}
					}else {
						days = 29;
					}
				}else {
					days = 28;
				}
				break;
				
			default:
				days = 0;
				break;
		}

//		switch (month) {
//			case 1,3,5,7,8,10,12:
//				days=31;
//				break;
//			case 4,6,9,11:
//				days=30;
//				break;
//			case 2:
//				days=28;
//				break;
//				
//		}
		
//		days = switch(month) {
//			case 1 , 3 , 5 ,7 , 8 , 10 , 12 -> 31 ;
//			case 2 -> 28;
//			case 4 , 6 , 9 , 11 -> 30;
//			default -> 0;
//		}; 
		
		System.out.printf("%d年%d月有%d天", year, month, days);
	}

}
