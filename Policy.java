import java.util.Scanner; // for reading user input

public class Policy
{
    //Declare all the variables
    private int policyNumber, policyholderAge;
    private double policyholderHeight, policyholderWeight, bmi, policyPrice;
    private String providerName, policyholderFirstname, policyholderLastname, smokingStatus;

    /**
     * No-arg constructor that explicitly initializes all instance fields.  
     */
    public Policy()
    {
        this.policyNumber = 000000;
        this.policyholderAge = 0;
        this.policyholderHeight = 0.0;
        this.policyholderWeight = 0.0;
        this.bmi = 0.0;
        this.policyPrice = 0.0;
        this.providerName = "none";
        this.policyholderFirstname = "none";
        this.policyholderLastname = "none";
        this.smokingStatus = "none";
    }

    /**
     * Constructor that accpets arguments.
     * @param policyNumber
     * @param policyholderAge
     * @param policyholderHeight
     * @param policyholderWeight
     * @param providerName
     * @param policyholderFirstname
     * @param policyholderLastname
     * @param smokingStatus
     */
    public Policy(int policyNumber, int policyholderAge, double policyholderHeight, double policyholderWeight, String providerName, String policyholderFirstname, String policyholderLastname, String smokingStatus)
    {
        this.policyNumber = policyNumber;
        this.policyholderAge = policyholderAge;
        this.policyholderHeight = policyholderHeight;
        this.policyholderWeight = policyholderWeight;
        this.bmi = bmi;
        this.policyPrice = policyPrice;
        this.providerName = providerName;
        this.policyholderFirstname = policyholderFirstname;
        this.policyholderLastname = policyholderLastname;
        this.smokingStatus = smokingStatus;
    }

    /**
     * Setter.
     * @param policyNumber
     */
    public void setPolicyNumber(int policyNumber)
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
    public void setPolicyolderWeight(double policyholderWeight)
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
    public int getPolicyNumber()
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
     * @return bmi
     */
    public double getBmi()
    {
        return bmi;
    }

    /**
     * Getter.
     * @return policyPrice
     */
    public double getPolicyPrice()
    {
        return policyPrice;
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
    public String getpolicyholderLastname()
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
     * @param policyholderWeight
     * @param policyholderHeight
     * @return BMI
     */
    public double bmiCalcualtor(double policyholderWeight, double policyholderHeight)
    {
        bmi = (policyholderWeight * 703) / ((policyholderHeight) * (policyholderHeight));
        return bmi;
    }

    /**
     * Calculates the price of the insurance policy.
     * @param policyholderAge
     * @param smokingStatus
     * @param bmi
     * @return policyPrice
     */
    public double policyPriceCalculator(int policyholderAge, String smokingStatus, double bmi)
    {
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
        if (smokingStatus.equals("smoker"))
        {
            policyPrice += SMOKER_FEE;
        }
        if (bmi > MAX_BMI)
        {
            bmiFee = (bmi - MAX_BMI) * BMI_FEE_CONSTANT;
            policyPrice += bmiFee;
        }
        
        return policyPrice;
    }



}