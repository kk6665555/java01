package tw.org.iii;

public class java06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 11;
		switch (month){
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			System.out.println(31);
			break;
		case 2:
			System.out.println(28);
			break;
		case 4:case 6:case 9:case 11:
			System.out.println(30);
			break;
		default:
			System.out.println("xx");//default 可以放在任一地方
			
		}
	}
}
