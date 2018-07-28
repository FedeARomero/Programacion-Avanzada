package polinomio;

public class Pascal {

	private long[][] vector;

	public Pascal(int n) {
		vector = new long[n + 1][];

		for (int i = 0; i < vector.length; i++) {
			vector[i] = new long[i + 1];
			vector[i][0] = vector[i][i] = 1;
		}

		for (int i = 2; i < vector.length; i++) {
			vector[i][1] = vector[i][i - 1] = i;

			if (i % 2 == 0)
				vector[i][i / 2] = vector[i - 1][i / 2 - 1] + vector[i - 1][i / 2];

			for (int j = 2; j <= i / 2; j++)
				vector[i][j] = vector[i][i - j] = vector[i - 1][j - 1] + vector[i - 1][j];
		}
	}

	public long[] numeros(int n) {
		return vector[n];
	}

	public long numero(int n, int k) {
		return vector[n][k];
	}

	public void mostrar() {
		for (int i = 0; i < vector.length; i++) {
			System.out.print("" + (i / 10) + (i % 10) + ": ");
			for (int j = 0; j < vector[i].length; j++)
				System.out.print(vector[i][j] + " ");
			System.out.println();
		}
	}
}
