import java.util.Scanner;

public class SercetMsg {

	public static void main(String[] qrgs) {

		System.out.println("Enter a messego to encode/decode");

		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		int intKey;
		while (message.length() > 0) {
			String out = "";
			do {
				System.out.print("enter a key between -26 and 26: ");
				intKey = Integer.parseInt(scan.nextLine());
			} while (intKey > 26 || intKey < -26);
			char key = (char) intKey;

			for (int i = 0; i < message.length(); i++) {

				char in = message.charAt(i);
				if (in >= 'A' && in <= 'Z') {
					in += key;
					if (in > 'Z')
						in -= 26;
					if (in < 'A')
						in += 26;

				}
				if (in >= 'a' && in <= 'z') {
					in += key;
					if (in > 'z')
						in -= 26;
					if (in < 'a')
						in += 26;

				}
				

				out += in;
				
				
				
			}	System.out.println();
				System.out.println(out);
				System.out.println("write text to encode or press enter to finish");
				message = scan.nextLine();
		}
		scan.close();
	}
}
