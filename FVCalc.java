// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int investedSum = Integer.parseInt(args[0]);
		double annualInterestRate = Double.parseDouble(args[1]);
		int investmentPeriodInYears = Integer.parseInt(args[2]);

		double rate = annualInterestRate / 100 + 1;

		double futureAmount = investedSum * Math.pow(rate, investmentPeriodInYears);
		System.out.println("After " + investmentPeriodInYears + " years, $" + investedSum + " saved at " + annualInterestRate + "% will yield $" + (int)futureAmount);
	}
}