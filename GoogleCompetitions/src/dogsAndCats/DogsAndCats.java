package dogsAndCats;

public class DogsAndCats {
	public static String dogsAndCats(String input) {

		int numberOfTests = input.charAt(0) - '0';
		String[] output = new String[numberOfTests];

		String[] inputArray = input.split("\\r\\n");

		for (int i = 1; i < inputArray.length; i++) {
			String[] values = inputArray[i].split(" ");
			int N = Integer.valueOf(values[0]); // NUMBER OF ANIMALS
			int D = Integer.valueOf(values[1]); // NUMBER OF DOG FOOD
			int C = Integer.valueOf(values[2]); // NUMBER OF CAT FOOD
			int M = Integer.valueOf(values[3]); // NUMBER OF ADDITIONALS PORTIONS OF CAT FOOD

			String order = inputArray[i + 1];

			for (int j = 0; j < N; j++) {
				char c = order.charAt(j);

				if (c == 'D') {
					D -= 1;
					C += M;
					if (D == -1) {
						output[(i + 1) / 2 - 1] = "Case #" + (i + 1) / 2 + ": NO";
						j = N;
					}
				} else if (c == 'C') {
					C -= 1;
					if (C == -1) {
						output[(i + 1) / 2 - 1] = "Case #" + (i + 1) / 2 + ": NO";
						j = N;
					}
				}
				if (output[(i + 1) / 2 - 1] == null) {
					output[(i + 1) / 2 - 1] = "Case #" + (i + 1) / 2 + ": YES";
				}
			}
			i++;
		}

		String toReturn = "";

		for (int i = 0; i < output.length; i++) {
			if (!(i == 0)) {
				toReturn += "\r";
			}
			toReturn += output[i];
		}

		return toReturn;

	}
}
