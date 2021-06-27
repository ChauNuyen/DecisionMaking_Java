package greatExercises;

import java.io.Console;
import java.util.Scanner;

public class Condition {

	/**
	 * Phương thức Demo cho câu lệnh if<br>
	 * <br>
	 * Nếu giá trị truyền vào <b>khác</b> 20 thì hiển thị câu lệnh <b>không nằm
	 * trong</b> if<br>
	 * Nếu giá trị truyền vào <b>bằng</b> 20 thì hiển thị <b>thêm</b> câu lệnh
	 * <b>nằm trong</b> if<br>
	 * <br>
	 * <i><b>Cập nhật 28/05/2021</b></i>
	 */
	public static void IfDemo(int i) {
		if (i == 20)
			System.out.println("Câu lệnh nằm trong IF");

		System.out.println("Câu lệnh không nằm trong IF");
	}

	/**
	 * Phương thức Demo cho câu lệnh if - else<br>
	 * <br>
	 * 
	 * Nếu giá trị truyền vào <b>nhỏ hơn</b> 0 thì hiển thị thông báo số tuổi không
	 * hợp lệ<br>
	 * Nếu giá trị truyền vào <b>lớn hơn hoặc bằng</b> 0 thì hiển thị số tuổi đó ra
	 * màn hình console<br>
	 * <br>
	 * <i><b>Cập nhật 28/05/2021</b></i>
	 */
	public static void IfElseDemo(int age) {

		if (age < 0) {
			System.out.println("Số tuổi không hợp lệ");
		} else {
			System.out.println("Số tuổi được truyền vào: "+age);
		}
	}

	/**
	 * Phương thức Demo cho câu lệnh nested - if<br>
	 * <br>
	 * Nếu giá trị truyền vào <b>nhỏ hơn</b> 15 thì hiển thị i < 15<br>
	 * Nếu giá trị truyền vào <b>nhỏ hơn</b> 12 thì hiển thị i < 12<br>
	 * Nếu giá trị truyền vào <b>lớn hơn</b> 12 thì hiển thị 12 < i < 15<br>
	 * 
	 * @param i - giá trị truyền vào<br>
	 *          <i><b>Cập nhật 28/05/2021</b></i>
	 */
	public static void NestedIfDemo(int i) {
		if (i < 15) {
			System.out.println("i < 15");

			if (i <= 12) {
				System.out.println("i <= 12");
			} else {
				System.out.println("12 < i < 15");
			}
		}
	}

	/**
	 * Phương thức Demo cho câu lệnh if - else - if<br>
	 * <br>
	 * Kết quả hiển thị khoảng giá trị mà i nằm trong<br>
	 * <br>
	 * 
	 * @param i - giá trị truyền vào<br>
	 *          <i><b>Cập nhật 28/05/2021</b></i>
	 */
	public static void IfElseIfDemo(int i) {
		if (i < 10)
			System.out.println("i < 10");
		else if (i < 15)
			System.out.println("10 <= i < 15");
		else if (i < 20)
			System.out.println("15 <= i < 20");
		else
			System.out.println("20 <= i");
	}

	/**
	 * Phương thức Demo cho câu lệnh switch - case chạy demo<br>
	 * <br>
	 * Trường hợp này trả về giá trị Default<br>
	 * <br>
	 * 
	 * @param i - giá trị truyền vào<br>
	 *          <i><b>Cập nhật 28/05/2021</b></i>
	 */
	public static void SwitchCaseDefault() {
		int i = 9;
		switch (i) {
		case 0:
			System.out.println("i  0");
			break;
		case 1:
			System.out.println("i = 1");
			break;
		case 2:
			System.out.println("i = 2");
			break;
		default:
			System.out.println("i > 2.");
		}
	}

	/**
	 * Phương thức Demo cho câu lệnh switch - case<br>
	 * <br>
	 * Trường hợp này trả về giá trị của case<br>
	 * <br>
	 * 
	 * @param i - giá trị truyền vào<br>
	 *          <i><b>Cập nhật 28/05/2021</b></i>
	 */
	public static void SwitchCaseDemo(int i) {
		switch (i) {
		case 1:
			System.out.println("Thứ Hai");
			break;
		case 2:
			System.out.println("Thứ Ba");
			break;
		case 3:
			System.out.println("Thứ Tư");
			break;
		case 4:
			System.out.println("Thứ Năm");
			break;
		case 5:
			System.out.println("Thứ Sáu");
			break;
		case 6:
			System.out.println("Thứ Bảy");
			break;
		case 7:
			System.out.println("Chủ Nhật");
			break;
		default:
			System.out.println("Giá trị truyền vào nằm trong khoảng từ 1 đến 7");
				
		}

	}

	/**
	 * Phương thức Demo cho câu lệnh break<br>
	 * <br>
	 * 
	 * @param n - giá trị truyền vào<br>
	 *          <i><b>Cập nhật 28/05/2021</b></i>
	 */
	public static void BreakDemo(int n) {
		for (int i = 0; i < 2*n; i++) {
			if (i == n)
				break;
			System.out.println("i :" + i);
		}
		System.out.println("Đã thoát vòng lặp!!");
	}

	/**
	 * Phương thức Demo cho câu lệnh break, áp dụng với label<br>
	 * <br>
	 * 
	 * <i><b>Cập nhật 28/05/2021</b></i>
	 */
	public static void BreakLabel() {
		boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    // Before break
                    System.out.println("Trước lệnh break");
  
                    // lệnh break sẽ thoát khỏi khối lệnh second
                    if (t)
                        break second;
                    System.out.println("Lệnh này sẽ không được thực thi.");
                }
                System.out.println("Lệnh này sẽ không được thực thi.");
            }
  
            // First block
            System.out.println("Lệnh này nằm sau khối lệnh second.");
        }
	}
	
	/**
	 * Phương thức Demo cho câu lệnh continue<br>
	 * <br>
	 * Phương thức hiển thị các giá trị lẻ nhỏ hơn giá trị truyền vào<br>
	 * 
	 * @param n - Giá trị truyền vào <i><b>Cập nhật 28/05/2021</b></i>
	 */
	public static void ContinueDemo(int n) {
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				continue;

			// If number is odd, print it
			System.out.print(i + ", ");
		}
	}

	/**
	 * Phương thức Demo cho câu lệnh return<br>
	 * <br>
	 * Trường hợp này dùng return để kết thúc chương trình <br>
	 * <br>
	 * <i><b>Cập nhật 28/05/2021</b></i>
	 */
	public static void ReturnDemo() {
		boolean t = true;
		System.out.println("Câu lệnh trước return");
		if (t)
			return;
		System.out.println("Câu lệnh này sẽ không được hiển thị");
	}

	/**
	 * Phương thức Demo cho câu lệnh return<br>
	 * <br>
	 * Trường hợp này dùng return để trả về kiểu dữ liệu của phương thức <br>
	 * Kết quả trả về gấp 2 lần giá trị nhập vào<br>
	 * <br>
	 * <i><b>Cập nhật 28/05/2021</b></i>
	 */
	public static int ReturnValueDemo(int i) {
		return i * 2;
	}
	
}
