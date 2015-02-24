package vsol;

import java.io.FileWriter;

import vsol.HttpUtil;

public class Runner {

	private static final int MIN_AGE = 16;
	private static final int MAX_AGE = 34;
	private static final int MIN_SKILL = 10;
	private static final int MAX_SKILL = 319;
	private static final int SKILLS_PER_PAGE = 13;
	private static final int START_SKILL = MIN_SKILL + (SKILLS_PER_PAGE / 2);
	private static final int STOP_SKILL = MAX_SKILL + (SKILLS_PER_PAGE / 2);

	public static void main(String[] args) throws Exception {
		System.setOut(new java.io.PrintStream(System.out, true, "Cp866"));
		System.out.println("the program is started");
		System.out.println("тест кириллицы");
		System.out.println("data length: " + ( (MAX_AGE + 1) * (MAX_SKILL + 1) ));
		int[][] playersBasePrices = new int[MAX_AGE + 1][MAX_SKILL + 1];
		int downloadCounter = 0;
		for (int skill = START_SKILL; skill <= STOP_SKILL; skill += SKILLS_PER_PAGE) {
			downloadCounter++;
			System.out.println("#" + downloadCounter + "\t\tcurrent skill: " + skill);
		}
//		String content = HttpUtil.getHttpContent("http://virtualsoccer.ru/player_reprice.php");
//		System.out.println(content);
		try {
			FileWriter fw = new FileWriter("downloadedContent.html");
			System.out.println(fw.getEncoding());
			fw.write("запись русских букв");
//			fw.write(content);
			fw.close();
		} catch (Exception e) {

		}
		System.out.println("the program is finished");
	}
}