package assn07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MagicSquares {
	public static boolean testMagic(String pathName) {
		// Open the file
		
		BufferedReader reader = null;
		boolean isMagic = true;
		int lastSum = -1;
		String line;
		try {
			reader = new BufferedReader(new FileReader(pathName));
			while ((line = reader.readLine()) != null) {
				// ... sum each row of numbers
				String[] parts = line.split("\t");
				if (parts.length == 1)
					continue;
				int sum = 0;
				for (String part : parts) {
					sum += Integer.valueOf(part);
				}
				
				if (lastSum == -1) {
					// If this is the first row, remember the sum
					lastSum = sum;
				} else if (lastSum != sum) {
					// if the sums don't match, it isn't magic, so stop reading
					isMagic = false;
					break;
				}
			}
			reader.close();

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return isMagic;
	}

	public static void main(String[] args) throws IOException {
		String[] fileNames = { "Mercury.txt", "Luna.txt" };
		for (String fileName : fileNames) {
			System.out.println(fileName + " is magic? " + testMagic(fileName));
		}
	}
}
