import java.util.*; // for reading user input and ArrayList
import java.io.*; //For IOException and Files

public class Project_pablo_garces
{
    public static void main (String[] args)
    {
        //Initialize try to later catch any problem.
        try
        {
            //Declare the file and the scanner object.
            File policyInfo = new File("PolicyInformation.txt");
            Scanner inputFile = new Scanner(policyInfo);
            
            
            //Declare and initialize all the variables.
            int policyholderAge = 0, smokers = 0, nonSmokers = 0;
            double policyholderHeight = 0.0, policyholderWeight = 0.0;
            String policyNumber = "", providerName = "", policyholderFirstname = "", policyholderLastname = "", smokingStatus = "", fileInput = "";
            
            //Initialize the ArrayList.
            ArrayList<Policy> policies = new ArrayList<Policy>();

            //Initialize the while loop to check if the docuement continues.
            while(inputFile.hasNext())
            {
                //Read all the inputs of the document
                policyNumber = inputFile.nextLine();

                providerName = inputFile.nextLine();

                policyholderFirstname = inputFile.nextLine();

                policyholderLastname = inputFile.nextLine();

                fileInput = inputFile.nextLine();
                policyholderAge = Integer.parseInt(fileInput);

                smokingStatus = inputFile.nextLine();
                //Check if the policy is of a smoker or not.
                if(smokingStatus.equalsIgnoreCase("smoker"))
                {
                    smokers++;
                } else
                {
                    nonSmokers++;    
                }

                fileInput = inputFile.nextLine();
                policyholderHeight = Double.parseDouble(fileInput);

                fileInput = inputFile.nextLine();
                policyholderWeight = Double.parseDouble(fileInput);

                //Skip the blank line if we have not reached the end of the file.
                if(inputFile.hasNext())
                { 
                inputFile.nextLine();
                }

                //Create an instance of the Policy class.
                Policy p = new Policy(policyNumber, policyholderAge, policyholderHeight, policyholderWeight,
                                    providerName, policyholderFirstname, policyholderLastname, smokingStatus);
                
                //Add the policy object to the ArrayList.
                policies.add(p);
            }//Close loop.

            //Close the file.
            inputFile.close();

            //Use a for loop to get each object of the arraylist  and display all the information.
            for(int i = 0; i < policies.size(); i++)
            {
                policies.get(i).displayInformation();    
            }

            //Display all the smokers and non-smokers.
            System.out.println();
            System.out.println("The number of policies with a smoker is: " + smokers);
            System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
            System.out.println();

        }//Close the "try" block of code.
        
        //Catch any IOException to deal with it.
        catch(IOException ex)
        {
            //use the getMessage method of the exception we "caught" to print out it's message about what went wrong.
            System.out.println("Something went wrong reading the file: " + ex.getMessage());
        }
        
    }//Close main.
}//Close the class container.