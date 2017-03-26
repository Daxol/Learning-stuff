package zadanie15;

public class HTMLColor {

	public static void main(String[] args) {

		for (int value : HTMLColor2RBG("#FF0050")) {
			System.out.print(value + ", ");
		}
	}

	public static int[] HTMLColor2RBG(String col) {
		col = col.toUpperCase();
		String col1 = "";
		col1 += col.charAt(1);
		col1 += col.charAt(2);
		String col2 = "";
		col2 += col.charAt(3);
		col2 += col.charAt(4);
		String col3 = "";
		col3 += col.charAt(5);
		col3 += col.charAt(6);
		int[] returnArray = new int[3];
		returnArray[0] = Integer.parseInt(col1, 16);
		returnArray[1] = Integer.parseInt(col2, 16);
		returnArray[2] = Integer.parseInt(col3, 16);

		return returnArray;
	}
}
