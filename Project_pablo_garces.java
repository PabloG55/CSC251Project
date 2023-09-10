import java.util.Scanner; // for reading user input

public class Project_pablo_garces
{
    private static Scanner scnr = new Scanner(System.in); // Initialize the scanner object
    public static void main (String[]args)
    {
        //Declare all the variables.
        int policyNumber, policyholderAge;
        double policyholderHeight, policyholderWeight;
        String providerName, policyholderFirstname, policyholderLastname, smokingStatus;

        //Get all the information from the user.
        System.out.print("Please enter the Policy Number: ");
        policyNumber = scnr.nextInt();
        scnr.nextLine();
        System.out.print("Please enter the Provider Name: ");
        providerName = scnr.nextLine();
        System.out.print("Please enter the Policyholder's First Name: ");
        policyholderFirstname = scnr.nextLine();
        System.out.print("Please enter the Policyholder's Last Name: ");
        policyholderLastname = scnr.nextLine();
        System.out.print("Please enter the Policyholder's Age: ");
        policyholderAge = scnr.nextInt();
        scnr.nextLine();
        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        smokingStatus = scnr.nextLine();
        validateSmokingStatus(smokingStatus);
        System.out.print("Please enter the Policyholder's Height (in inches): ");
        policyholderHeight = scnr.nextDouble();
        validatePolicyholderHeight(policyholderHeight);
        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        policyholderWeight = scnr.nextDouble();
        validatePolicyholderWeight(policyholderWeight);    

        //Create an instance of the Policy class.
        Policy policy = new Policy(policyNumber, policyholderAge, policyholderHeight, policyholderWeight, providerName, policyholderFirstname, policyholderLastname, smokingStatus);

        //Print all the information.
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

    

    /**
     * Validate the smoking status from the user.
     * @param smokingStatus
     */
    public static void validateSmokingStatus(String smokingStatus)
    {
         while (!(smokingStatus.equalsIgnoreCase("smoker") || smokingStatus.equalsIgnoreCase("non-smoker")))
        {
            System.out.print("Please enter smoker or non-smoker: ");
            smokingStatus = scnr.nextLine();
        }
    }

    /**
     * Validate the policy holder height from the user.
     * @param policyholderHeight
     */
    public static void validatePolicyholderHeight(double policyholderHeight)
    {
        while (policyholderHeight <= 0)
        {
            System.out.print("Please enter a valid number: ");
            policyholderHeight = scnr.nextDouble();
        }
    }

    /**
     * Validate the policy holder height from the user.
     * @param policyholderWeight
     */
    public static void validatePolicyholderWeight(double policyholderWeight)
    {
        while (policyholderWeight <= 0)
        {
            System.out.print("Please enter a valid number: ");
            policyholderWeight = scnr.nextDouble();
        }
    }
}