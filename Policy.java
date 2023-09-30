public class Policy
{
    //Declare all the variables
    private int policyholderAge;
    private double policyholderHeight, policyholderWeight, bmi, policyPrice;
    private String policyNumber, providerName, policyholderFirstname, policyholderLastname, smokingStatus;

    /**
     * No-arg constructor that explicitly initializes all instance fields.  
     */
    public Policy()
    {
        this.policyNumber = "";
        this.policyholderAge = 0;
        this.policyholderHeight = 0.0;
        this.policyholderWeight = 0.0;
        this.providerName = "none";
        this.policyholderFirstname = "none";
        this.policyholderLastname = "none";
        this.smokingStatus = "none";
    }

    /**
     * Constructor that accepets arguments.
     * @param policyNumber
     * @param policyholderAge
     * @param policyholderHeight
     * @param policyholderWeight
     * @param providerName
     * @param policyholderFirstname
     * @param policyholderLastname
     * @param smokingStatus
     */
    public Policy(String policyNumber, int policyholderAge, double policyholderHeight, double policyholderWeight, 
                  String providerName, String policyholderFirstname, String policyholderLastname, String smokingStatus)
    {
        this.policyNumber = policyNumber;
        this.policyholderAge = policyholderAge;
        this.policyholderHeight = policyholderHeight;
        this.policyholderWeight = policyholderWeight;
        this.providerName = providerName;
        this.policyholderFirstname = policyholderFirstname;
        this.policyholderLastname = policyholderLastname;
        this.smokingStatus = smokingStatus;
    }

    /**
     * Setter.
     * @param policyNumber
     */
    public void setPolicyNumber(String policyNumber)
    {
        this.policyNumber = policyNumber;
    }

    /**
     * Setter.
     * @param policyholderAge
     */
    public void setPolicyholderAge(int policyholderAge)
    {
        this.policyholderAge = policyholderAge;
    }

    /**
     * Setter.
     * @param policyholderHeight
     */
    public void setPolicyholderHeight(double policyholderHeight)
    {
        this.policyholderHeight = policyholderHeight;
    }

    /**
     * Setter.
     * @param policyholderWeight
     */
    public void setPolicyholderWeight(double policyholderWeight)
    {
        this.policyholderWeight = policyholderWeight;
    }

    /**
     * Setter.
     * @param bmi
     */
    public void setBmi(double bmi)
    {
        this.bmi = bmi;
    }

    /**
     * Setter.
     * @param policyPrice
     */
    public void setPolicyPrice(double policyPrice)
    {
        this.policyPrice = policyPrice;
    }

    /**
     * Setter.
     * @param providerName
     */
    public void setProviderName(String providerName)
    {
        this.providerName = providerName;
    }

    /**
     * Setter.
     * @param policyholderFirstname
     */
    public void setPolicyholderFirstname(String policyholderFirstname)
    {
        this.policyholderFirstname = policyholderFirstname;
    }

    /**
     * Setter.
     * @param policyholderLastname
     */
    public void setPolicyholderLastname(String policyholderLastname)
    {
        this.policyholderLastname = policyholderLastname;
    }

    /**
     * Setter.
     * @param smokingStatus
     */
    public void setSmokingStatus(String smokingStatus)
    {
        this.smokingStatus = smokingStatus;
    }

    /**
     * Getter.
     * @return policyNumber
     */
    public String getPolicyNumber()
    {
        return policyNumber;
    }

    /**
     * Getter.
     * @return policyholderAge
     */
    public int getPolicyholderAge()
    {
        return policyholderAge;
    }

    /**
     * Getter.
     * @return policyholderHeight
     */
    public double getPolicyholderHeight()
    {
        return policyholderHeight;
    }

    /**
     * Getter.
     * @return policyholderWeight
     */
    public double getPolicyholderWeight()
    {
        return policyholderWeight;
    }

    /**
     * Getter.
     * @return providerName
     */
    public String getProviderName()
    {
        return providerName;
    }

    /**
     * Getter.
     * @return policyholderFirstname
     */
    public String getPolicyholderFirstname()
    {
        return policyholderFirstname;
    }

    /**
     * Getter.
     * @return policyholderLastname
     */
    public String getPolicyholderLastname()
    {
        return policyholderLastname;
    }

    /**
     * Getter.
     * @return smokingStatus
     */
    public String getSmokingStatus()
    {
        return smokingStatus;
    }

    /**
     * Calculates BMI.
     * @return BMI
     */
    public double bmiCalcualtor()
    {
        final double CONVFACTOR = 703;
        return (policyholderWeight * CONVFACTOR) / ((policyholderHeight) * (policyholderHeight));
    }

    /**
     * Calculates the price of the insurance policy.
     * @return policyPrice
     */
    public double policyPriceCalculator()
    {
        //Declare all the constants.
        final int BASE_FEE = 600;
        final int MAX_YEARS = 50;
        final int MAX_YEARS_FEE = 75;
        final int SMOKER_FEE = 100;
        final int MAX_BMI = 35;
        final int BMI_FEE_CONSTANT = 20;
        double bmiFee = 0;
        policyPrice = BASE_FEE;

        if (policyholderAge > MAX_YEARS)
        {
            policyPrice += MAX_YEARS_FEE;
        }
        if (smokingStatus.equalsIgnoreCase("smoker"))
        {
            policyPrice += SMOKER_FEE;
        }
        if (bmiCalcualtor() > MAX_BMI)
        {
            bmiFee = (bmiCalcualtor() - MAX_BMI) * BMI_FEE_CONSTANT;
            policyPrice += bmiFee;
        }
        
        return policyPrice;
    }

    /**
     * Display all the information.
     */
    public void displayInformation()
    {
        //Print all the information.
        System.out.println("\nPolicy Number: " + policyNumber);
        System.out.println("Provider Name: " + providerName);
        System.out.println("Policyholder's First Name: " + policyholderFirstname);
        System.out.println("Policyholder's Last Name: " + policyholderLastname);
        System.out.println("Policyholder's Age: " + policyholderAge);
        System.out.println("Policyholder's Smoking Status: " + smokingStatus);
        System.out.printf("Policyholder's Height: %.1f inches\n" , policyholderHeight);
        System.out.printf("Policyholder's Weight: %.1f pounds\n" , policyholderWeight);
        System.out.printf("Policyholder's BMI: %.2f\n" , bmiCalcualtor());
        System.out.printf("Policy Price: $%.2f\n" , policyPriceCalculator());
    }

}