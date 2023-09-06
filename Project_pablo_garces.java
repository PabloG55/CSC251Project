import java.util.Scanner; // for reading user input

public class Project_pablo_garces
{
    public static void main (String[]args)
    {

        //Create a Scanner object used to read input from the console.
        Scanner scnr = new Scanner(System.in);

        //Create an instance of the Policy class.
        Policy policy = new Policy();

        System.out.print("Please enter the Policy Number: ");
        policy.setPolicyNumber(scnr.nextInt());
        scnr.nextLine();
        System.out.print("Please enter the Provider Name: ");
        policy.setProviderName(scnr.nextLine());
        System.out.print("Please enter the Policyholder's First Name: ");
        policy.setPolicyholderFirstname(scnr.nextLine());
        System.out.print("Please enter the Policyholder's Last Name: ");
        policy.setPolicyholderLastname(scnr.nextLine());
        System.out.print("Please enter the Policyholder's Age: ");
        policy.setPolicyholderAge(scnr.nextInt());
        scnr.nextLine();
        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        policy.setSmokingStatus(scnr.nextLine());
        while (!(policy.getSmokingStatus().equalsIgnoreCase("smoker") || policy.getSmokingStatus().equalsIgnoreCase("non-smoker")))
        {
            System.out.print("Please enter smoker or non-smoker: ");
            policy.setSmokingStatus(scnr.nextLine());
        }

        System.out.print("Please enter the Policyholder's Height (in inches): ");
        policy.setPolicyholderHeight(scnr.nextDouble());
        while (policy.getPolicyholderHeight() <= 0)
        {
            System.out.print("Please enter a valid number: ");
            policy.setPolicyholderHeight(scnr.nextDouble());
        }
        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        policy.setPolicyholderWeight(scnr.nextDouble());
        while (policy.getPolicyholderWeight() <= 0)
        {
            System.out.print("Please enter a valid number: ");
            policy.setPolicyholderWeight(scnr.nextDouble());
        }


        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder's First Name: " + policy.getPolicyholderFirstname());
        System.out.println("Policyholder's Last Name: " + policy.getPolicyholderLastname());
        System.out.println("Policyholder's Age: " + policy.getPolicyholderAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
        System.out.printf("Policyholder's Height: %.1f inches\n" , policy.getPolicyholderHeight());
        System.out.printf("Policyholder's Weight: %.1f pounds\n" , policy.getPolicyholderWeight());
        System.out.printf("Policyholder's BMI: %.2f\n" , policy.bmiCalcualtor());
        System.out.printf("Policy Price: $%.2f\n" , policy.policyPriceCalculator());
    }

}