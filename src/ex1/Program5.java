package ex1;

import java.sql.SQLException;

import com.newlecture.app.console.NoticeConsole;

public class Program5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		NoticeConsole console = new NoticeConsole();

		//int page;
		
		EXIT: while (true) {
			console.printNoticeList();
			int menu = console.inputNoticeMenu();

			switch (menu) {
			case 1:
				break;
			case 2:
				//page--;
				console.movePrevList();
				break;
			case 3:
				console.moveNextList();
				//page++;
				break;
			case 4:
				break;
			case 5:
				console.inputSearchWord();
				break ;
			case 6:
				System.out.println("Bye~");
				break EXIT;
			default:
				System.out.println("<<사용방법 1~4번만 가능>>");
				break;
			}
		}
	}

}
