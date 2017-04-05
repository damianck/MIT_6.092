package assn03;

public class Marathon {

	static int findFirst(final int[] times) {
		int x = Integer.MAX_VALUE;
		int first = -1;

		for (int i = 0; i < times.length; i++) {
			if (times[i] < x) {
				x = times[i];
				first = i;
			}
		}
		return first;
	}

	static int findSecond(final int[] times, final int first) {
		int x = Integer.MAX_VALUE;
		int second = -1;
		for (int i = 0; i < times.length; i++) {
			if (i == first)
				continue;
			if (times[i] < x) {
				x = times[i];
				second = i;
			}
		}
		return second;
	}

	public static void main(String[] arguments) {
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James",
				"Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };

		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + ": " + times[i]);
		}

		System.out.println("*****************************");
		int first = findFirst(times);
		int second = findSecond(times, first);

		System.out.println("First runner: " + names[first] + " with " + times[first] + " minutes.");
		System.out.println("Second runner: " + names[second] + " with " + times[second] + " minutes.");

	}
}
