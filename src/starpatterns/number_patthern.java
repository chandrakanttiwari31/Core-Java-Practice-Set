package starpatterns;

public class number_patthern {

	

	public void Jtimes() {

		for (int i = 0; i <= 4; i++) {
			for (int j = (2 * i) + 1; j >= 1; j -= 2) {

				System.out.print(" " + j);
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		number_patthern n = new number_patthern();
		n.Jtimes();
	}

}
