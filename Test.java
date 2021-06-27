package greatExercises;

import java.util.Scanner;

import BTL_Java.Condition;

public class Test {
	
	public static void main(String[] args) {
		SwitchStat ss = new SwitchStat();
		StringInSwitchCase st = new StringInSwitchCase();
		Scanner in = new Scanner(System.in);
		int sw;
		do {
			// 1
			System.out.println("\n1.Method If Demo: ");
			// 2
			System.out.println("2.Method If-Else Demo: ");
			// 3
			System.out.println("3.Method Nested-If Demo: ");
			// 4
			System.out.println("4.Method If-Else-If Demo: ");
			// 5
			System.out.println("5.Method Switch-Case Default: ");
			// 6
			System.out.println("6.Method Switch-Case Demo: ");
			// 7
			System.out.println("7.Method Break Demo: ");
			// 8
			System.out.println("8.Method Break Label: ");
			// 9
			System.out.println("9.Method Continue Demo: ");
			// 10
			System.out.println("10.Method Return Demo: ");
			// 11
			System.out.println("11.Method Return Value Demo: ");
			
			System.out.println("=============================================");
			// 12
			System.out.println("12. Switch statement example:");
			// 13
			System.out.println("13. Switch statement without break example:");
			// 14
			System.out.println("14. Nested switch example:");
			// 15
			System.out.println("15. Multiple values per case example:");
			// 16
			System.out.println("16. Switch statement with yield example:");
			// 17
			System.out.println("17. Using switch such as expression example:");
			//18
			System.out.println("18. Switch with arrow syntax example:");
			//19
			System.out.println("=============================================");
			//20
			System.out.println("19. Determine a number by inputString: ");
			
			System.out.println("20.Exit.");
			System.out.println("------------------------------");

			System.out.println("Mời chọn : ");
			
			sw = in.nextInt();
			String str;
			int i;
			switch (sw) {
			case 1:
				System.out.println("Nhập giá trị truyền vào:");
				i = in.nextInt();
				Condition.IfDemo(i);
				break;
			case 2:
				System.out.println("Nhập giá trị truyền vào:");
				i = in.nextInt();
				Condition.IfElseDemo(i);
				break;
			case 3:
				System.out.println("Nhập giá trị truyền vào:");
				i = in.nextInt();
				Condition.NestedIfDemo(i);
				break;
			case 4:
				System.out.println("Nhập giá trị truyền vào:");
				i = in.nextInt();
				Condition.IfElseIfDemo(i);
				break;
			case 5:
				Condition.SwitchCaseDefault();
				break;
			case 6:
				System.out.println("Nhập giá trị truyền vào:");
				i = in.nextInt();
				Condition.SwitchCaseDemo(i);
				break;
			case 7:
				System.out.println("Nhập giá trị truyền vào:");
				i = in.nextInt();
				Condition.BreakDemo(i);
				break;
			case 8:
				Condition.BreakLabel();
				break;
			case 9:
				System.out.println("Nhập giá trị truyền vào:");
				i = in.nextInt();
				Condition.ContinueDemo(i);
				break;
			case 10:
				Condition.ReturnDemo();
				break;
			case 11:
				System.out.println("Nhập giá trị truyền vào:");
				i = in.nextInt();
				System.out.println(Condition.ReturnValueDemo(i));
				break;
			case 12:
				//Phương thức sử dụng switch cơ bản
				ss.switchExample1();
				break;
			case 13:
				//Phương thức sử dụng switch bỏ lệnh break
				ss.switchExample2();
				break;
			case 14:
				//Phương thức sử dụng switch case lồng nhau
				ss.switchExample3();
				break;
			case 15:
				//Phương thức sử dụng switch vơi nhiều giá trị trên mỗi case
				ss.switchExample4();
				break;
			case 16:
				//Phương thức sử dụng switch case với yield
				ss.switchExample5();
				break;
			case 17:
				//Phương thức sử dụng switch case như một biểu thức
				ss.switchExample6();
				break;
			case 18:
				//Phương thức sử dụng switch case với cú pháp ->
				ss.switchExample7();
				break;
			case 19:
				System.out.println("Nhập vào một chuỗi yêu cầu: one, two, hoặc three");
				str = in.nextLine();
				System.out.println(st.getExpendedMessage(str));
				break;
			
			case 20: {
				System.out.println("Ðã thoát!");
				System.exit(0);
			
				}
			}
		} while (sw != 0);

	}

}
