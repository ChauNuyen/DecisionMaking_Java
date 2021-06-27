package greatExercises;

public class SwitchStat {
	/**
	 * Phương thức sinh ngẫu nhiên một số nguyên có giá trị nhỏ hơn hoặc bằng
	 * MAX_VALUE
	 * 
	 * @param MAX_VALUE giá trị lớn nhất có thể sinh ra
	 * @return một số nguyên
	 */
	public static int generateInt(int MAX_VALUE) {
		return (int) (Math.random() * MAX_VALUE);
	}

	/**
	 * Phương thức minh họa cho câu lệnh switch để in ra các thứ trong tuần<br>
	 * Sử dụng các câu lệnh break để ngắt case tránh trường hợp kết quả hiển thị
	 * không mong muốn <br>
	 * 1 => Monday<br>
	 * 2 => Tuesday<br>
	 * 3 => Wednesday<br>
	 * 4 => Thurday<br>
	 * 5 => Friday<br>
	 * 6 => Saturday<br>
	 * 7 => Sunday<br>
	 * other => Invalid day<br>
	 * 
	 */
	public void switchExample1() {
		int day = generateInt(8);
		System.out.println("Lựa chọn là: " + day);
		String dayString;
		// lệnh switch với kiểu dữ liệu int
		switch (day) {
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString = "Tuesday";
			break;
		case 3:
			dayString = "Wednesday";
			break;
		case 4:
			dayString = "Thurday";
			break;
		case 5:
			dayString = "Friday";
			break;
		case 6:
			dayString = "Saturday";
			break;
		case 7:
			dayString = "Sunday";
			break;
		default:
			dayString = "Invalid day";
		}
		System.out.println(dayString);
	}

	/**
	 * Phương thức minh họa cho câu lệnh switch để in ra ngày trong tuần hay ngày
	 * cuối tuần<br>
	 * 
	 * Bỏ qua câu lệnh break để duyệt qua các trường hợp<br>
	 * 
	 * 1 => Monday is a Weekday<br>
	 * 2 => Tuesday is a Weekday<br>
	 * 3 => Wednesday is a Weekday<br>
	 * 4 => Thurday is a Weekday<br>
	 * 5 => Friday is a Weekday<br>
	 * 6 => Saturday is a Weekend<br>
	 * 7 => Sunday is a Weekend<br>
	 * other => Invalid day is a Invalid daytype<br>
	 */
	public void switchExample2() {
		int day = generateInt(7);
		System.out.println("Lựa chọn là: " + day);
		String dayString;
		String dayType;
		switch (day) {
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString = "Tuesday";
			break;
		case 3:
			dayString = "Wednesday";
			break;
		case 4:
			dayString = "Thurday";
			break;
		case 5:
			dayString = "Friday";
			break;
		case 6:
			dayString = "Saturday";
			break;
		case 7:
			dayString = "Sunday";
			break;
		default:
			dayString = "Invalid day";
		}
		switch (day) {
		// Nhiều case không sử dụng lệnh break
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			dayType = "Weekday";
			break;
		case 6:
		case 7:
			dayType = "Weekend";
			break;
		default:
			dayType = "Invalid daytype";
		}

		System.out.println(dayString + " is a " + dayType);
	}

	/**
	 * phương thức minh họa sử dụng switch case lông nhau<br>
	 * 
	 * 1 => elective courses : Advance english, Algebra 2 + CSE,CCE => elective
	 * courses : Machine Learning, Big Data<br>
	 * 2 + ECE => elective courses : Antenna Engineering<br>
	 * other => elective courses : Optimization<br>
	 * 
	 */
	public void switchExample3() {
		int year = generateInt(2);
		System.out.println("Lựa chọn là: " + year);
		String Branch = "CSE";
		switch (year) {
		case 1:
			System.out.println("elective courses : Advance english, Algebra");
			break;
		case 2:
			System.out.println("Branch is "+Branch);
			switch (Branch) // Switch lồng
			{
			case "CSE":
			case "CCE":
				System.out.println("elective courses : Machine Learning, Big Data");
				break;
			case "ECE":
				System.out.println("elective courses : Antenna Engineering");
				break;
			default:
				System.out.println("elective courses : Optimization");
			}
		default:
			System.out.println("year invalid");
		}
	}

	/**
	 * Phương thức minh họa sử dụng nhiều giá trị cho 1 case<br>
	 * 
	 * 1,2,3 => It's an electronic gadget!<br>
	 * 4,5 => It's a mechanical device!<br>
	 * other => Item code invalid
	 * 
	 */
	public void switchExample4() {
		int itemCode = generateInt(5);
		System.out.println("Lựa chọn là: " + itemCode);
		switch (itemCode) {
		case 001, 002, 003:
			System.out.println("It's an electronic gadget!");
			break;
		case 004, 005:
			System.out.println("It's a mechanical device!");
			break;
		default:
			System.out.println("Item code invalid");
		}
	}

	/**
	 * Phương thức minh họa sử dụng yield để trả về 1 giá trị<br>
	 * 
	 * 1,2 => Type of product: 1<br>
	 * 3,4 => Type of product: 2<br>
	 * other => Type of product: 0<br>
	 * 
	 */
	public void switchExample5() {
		int code = generateInt(4);
		System.out.println("Lựa chọn là: " + code);
		int typeProduct = switch (code) {
		case 1, 2:
			yield 1;
		case 3, 4:
			yield 2;
		default:
			yield 0;
		};
		System.out.println("Type of product: " + typeProduct);
	}

	/**
	 * Phương thức minh họa sử dụng switch như 1 biểu thức<br>
	 * 
	 * 1 => It's a laptop!<br>
	 * 2 => It's a desktop!<br>
	 * 3 => It's a mobile phone!<br>
	 * other => other is an unknown device!<br>
	 * 
	 */
	public void switchExample6() {
		int itemCode = generateInt(3);
		System.out.println("Lựa chọn là: " + itemCode);
		String text = switch (itemCode) {
		case 001:
			yield "It's a laptop!";
		case 002:
			yield "It's a desktop!";
		case 003:
			yield "It's a mobile phone!";
		default:
			yield itemCode + " is an unknown device!";
		};
		System.out.println(text);
	}

	/**
	 * Phương thức minh họa sử dụng cú pháp mũi tên (->)<br>
	 * 
	 * 1,2,3 => It's an electronic gadget!<br>
	 * 4,5 => It's a mechanical device!<br>
	 * other => Item code invalid
	 * 
	 */
	public void switchExample7() {
		int itemCode = generateInt(5);
		System.out.println("Lựa chọn là: " + itemCode);
		switch (itemCode) {
		case 001, 002, 003 -> System.out.println("It's an electronic gadget!");
		case 004, 005 -> System.out.println("It's a mechanical device!");
		default -> System.out.println("Item code invalid");
		}
	}
}
