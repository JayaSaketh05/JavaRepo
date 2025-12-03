package homework;

public class Assignment6 {

		    // 1. Set and Get Name & Age
			static String name;
		    static int age;

		    static void setDetails(String n, int a) {
		        name = n;
		        age = a;
		    }

		    static void getDetails() {
		        System.out.println("Name & Age ");
		        System.out.println("Name: " + name);
		        System.out.println("Age: " + age);
		    }

		    // 2. Find Factorial 
		    static void findFactorial(int num) {
		        int fact = 1;
		        for (int i = 1; i <= num; i++) {
		            fact *= i;
		        }
		        System.out.println("\nFactorial ");
		        System.out.println("Factorial of " + num + " is " + fact);
		        System.out.println();
		    }

		    // 3. Palindrome Check
		    static int findReverse(int num) {
		        int rev = 0;
		        while (num != 0) {
		            rev = rev * 10 + num % 10;
		            num /= 10;
		        }
		        return rev;
		    }

		    static void checkPalindrome(int num) {
		        int rev = findReverse(num);
		        System.out.println("Palindrome Check");
		        if (num == rev)
		            System.out.println(num + " is a Palindrome.");
		        else
		            System.out.println(num + " is Not a Palindrome.");
		        System.out.println();
		    }

		    // 4. Voting Eligibility
		    static boolean isEligibleForVote(int age) {
		        return age >= 18;
		    }

		    static void checkVotingEligibility(int age) {
		        System.out.println("Voting Eligibility");
		        if (isEligibleForVote(age))
		            System.out.println("Age " + age + " is Eligible for Voting.");
		        else
		            System.out.println("Age " + age + " is Not Eligible for Voting.");
		        System.out.println();
		    }

		    // 5. Discount Calculation 
		    static double calculateTotal(double item1, double item2, double item3) {
		        return item1 + item2 + item3;
		    }

		    static double applyDiscount(double total) {
		        System.out.println("Discount Check");
		        if (total > 5000) 
		        {
		            double discount = total * 0.20; // 20% discount
		            total = total - discount;
		            System.out.println("Discount applied: 20%");
		        } 
		        else 
		        {
		            System.out.println("No discount applied.");
		        }
		        return total;
		    }

		    // MAIN METHOD with all 5 Tasks
		    public static void main(String[] args) {

		        // Task 1: Set & Get Name and Age
		        setDetails("Jaya", 26);
		        getDetails();

		        // Task 2: Factorial
		        findFactorial(5);

		        // Task 3: Palindrome
		        checkPalindrome(929);
		        checkPalindrome(387);

		        // Task 4: Voting Eligibility
		        checkVotingEligibility(26);
		        checkVotingEligibility(14);

		        // Task 5: Discount Calculation
		        double total = calculateTotal(2000, 1800, 1500);
		        double finalAmount = applyDiscount(total);
		        System.out.println("Final Amount to Pay: " + finalAmount);
		    }


}
