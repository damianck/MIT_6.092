package assn02;

public class FooCorporation {

	public static void main(String[] args) {
		final int maxHours = 60;
		final double minWages = 8;

		salaryCalculation("Employee 1", 7.50, 35, minWages, maxHours);
		salaryCalculation("Employee 2", 8.20, 47, minWages, maxHours);
		salaryCalculation("Employee 3", 10.0, 73, minWages, maxHours);

	}

	public static void salaryCalculation(String name, double basePay, int hoursWorked, final double minWages,
			final int maxHours) {

		if (basePay < minWages || hoursWorked > maxHours) {
			System.out.println("Error! U have too small wage or have too much hours.");
		} else {
			double salary = 0;
			if (hoursWorked > 40) {
				salary = basePay * 40 + basePay * (maxHours - hoursWorked);

			} else {
				salary = basePay * hoursWorked;
			}
			System.out.println(name + " - total salary is " + salary);
		}

	}

}
