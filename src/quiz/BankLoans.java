package quiz;

public class BankLoans {
	class PersonalLoanDept implements Bank {
		 int[] loanAmounts;
		 public PersonalLoanDept(int clients) {
		 loanAmounts = new int[clients];
		 }
		 public void assignLoans(int[] loans) {
		 for (int i = 0; i < loanAmounts.length; i++) {
		 if (i < loans.length) {
		 loanAmounts[i] = loans[i];
		 }
		 }
		 System.out.println("Loans for clients processed");
		 }
		 public void averageLoan() {
		 double average = Arrays.stream(loanAmounts).average().orElse(0);
		 System.out.printf("Average loan amount for clients is %.2f", average);
		 System.out.println();
		 }
		 public void maxLoan() {
		 int max = Arrays.stream(loanAmounts).max().orElse(0);
		 System.out.println("Maximum loan amount amongst clients is " + max);
		 }
		 public void minLoan() {
		 int min = Arrays.stream(loanAmounts).min().orElse(0);
		 System.out.println("Minimum loan amount amongst clients is " + min);
		 }
		}
		class BusinessLoanDept implements Bank {
		 int[] loanAmounts;
		 public BusinessLoanDept(int business) {
		 loanAmounts = new int[business];
		 }
		 public void assignLoans(int[] loans) {
		 for (int i = 0; i < loanAmounts.length; i++) {
		 if (i < loans.length) {
		 loanAmounts[i] = loans[i];
		 }
		 }
		 System.out.println("Loans for businesses processed");
		 }
		 public void averageLoan() {
		 double average = Arrays.stream(loanAmounts).average().orElse(0);
		 System.out.printf("Average loan amount for businesses is %.2f", average);
		 System.out.println();
		 }
		 public void maxLoan() {
		 int max = Arrays.stream(loanAmounts).max().orElse(0);
		 System.out.println("Maximum loan amongst businesses is " + max);
		 }
		 public void minLoan() {
		 int min = Arrays.stream(loanAmounts).min().orElse(0);
		 System.out.println("Minimum loan amongst businesses is " + min);
		 }
		}
}
