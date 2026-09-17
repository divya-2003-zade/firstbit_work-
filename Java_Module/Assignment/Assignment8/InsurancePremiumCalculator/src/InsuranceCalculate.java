import java.util.Scanner;
abstract class InsurancePolicy{
	String policyHolderName;
    double basePremium;
    InsurancePolicy() {
		this.policyHolderName = "NA";
		this.basePremium = 0.0;
	}
	InsurancePolicy(String policyHolderName, double basePremium) {
		
		this.policyHolderName = policyHolderName;
		this.basePremium = basePremium;
	}
	String getPolicyHolderName() {
		return policyHolderName;
	}
	void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	double getBasePremium() {
		return basePremium;
	}
	void setBasePremium(double basePremium) {
		this.basePremium = basePremium;
	}
    abstract double calculatePremium();
    void printPolicyDetails() {
    	 System.out.println("\n----- Policy Details -----");
         System.out.println("Policy Holder : " + this.policyHolderName);
         System.out.println("Base Premium  : " + this.basePremium);
         System.out.println("Final Premium : " + this.calculatePremium());
    }
    
}
class CarInsurance extends InsurancePolicy{
	int carAgeInYears;
    boolean hadAccidentInLastYear;
    double carValue;
    CarInsurance() {
		super();
		this.carAgeInYears = 0;
		this.hadAccidentInLastYear =false;
		this.carValue = 0.0;
	}
	CarInsurance(String policyHolderName, double basePremium,int carAgeInYears, boolean hadAccidentInLastYear, double carValue) {
		super(policyHolderName,basePremium);
		this.carAgeInYears = carAgeInYears;
		this.hadAccidentInLastYear = hadAccidentInLastYear;
		this.carValue = carValue;
	}
    //override calculatepremium
	double calculatePremium() {
		double premium = basePremium;
		//car age loading
		if(carAgeInYears<=3) {
			premium = premium + (premium * 0.10);

		}
		else if (carAgeInYears<=7) {
			premium = premium + (premium * 0.20);
		}
		else {
            premium = premium + (premium * 0.30);
        }
		//Accident loading
		if(hadAccidentInLastYear) {
			premium = premium + (premium * 0.25);
		}
		else {
			 premium = premium - (premium * 0.10);
		}
		//Car value condition
		if(carValue >1000000) {
			premium = premium +2000;
		}
		return premium;
	} 
	void printPolicyDetails() {
   	 super.printPolicyDetails();
        System.out.println("car Age In Years : " + this.carAgeInYears);
        System.out.println("Had Accident In LastYear ? : " + this.hadAccidentInLastYear);
        System.out.println("car Value : " + this.carValue);
   }
}
class HealthInsurance extends InsurancePolicy{
	int age;
    boolean isSmoker;
    boolean hasPreExistingDisease;
	HealthInsurance(String policyHolderName,double basePremium,int age, boolean isSmoker, boolean hasPreExistingDisease) {
		super(policyHolderName,basePremium);
		this.age = age;
		this.isSmoker = isSmoker;
		this.hasPreExistingDisease = hasPreExistingDisease;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	boolean isSmoker() {
		return isSmoker;
	}
	void setSmoker(boolean isSmoker) {
		this.isSmoker = isSmoker;
	}
	boolean isHasPreExistingDisease() {
		return hasPreExistingDisease;
	}
	void setHasPreExistingDisease(boolean hasPreExistingDisease) {
		this.hasPreExistingDisease = hasPreExistingDisease;
	}
    //override calculatePremium
	double calculatePremium() {
		double premium = basePremium;
		//Age loading
		if(age<30) {
			premium = premium + (premium*0.10);
		}else if(age <=45) {
			premium = premium + (premium *0.25);
		}else {
			premium = premium + (premium * 0.40);
		}
		//Smoker & non smoker
		if(isSmoker) {
			 premium = premium + (premium * 0.30);
		}else {
			premium = premium - (premium * 0.05);
		}
		//pre-existing disease
		if(hasPreExistingDisease) {
			premium = premium + (premium * 0.20);
		}
		return premium;
	}
	void printPolicyDetails() {
	   	 super.printPolicyDetails();
	        System.out.println(" Age : " + this.age);
	        System.out.println("is Smoker ? : " + this.isSmoker);
	        System.out.println("Has PreExisting Disease ?: " + this.hasPreExistingDisease);
	   }
}
class InsuranceCalculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Car Insurance ");
		System.out.println("2.Health Insurance ");
		
		System.out.println("Enter policy type ");
		int choice = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter policy holder name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter base premium : ");
		double basePremium = sc.nextDouble();
		
		InsurancePolicy policy;
		if (choice==1) {
			System.out.println("Enter Car age in years : ");
			int carAge= sc.nextInt();
			
			System.out.println("had Accident in last year ? (true/false)");
			boolean accident= sc.nextBoolean();
			
			System.out.println("Enter Car value : ");
			double carValue = sc.nextDouble();
			
			policy=new CarInsurance(name,basePremium,carAge,accident,carValue);
			//policy.printPolicyDetails();
			//sc.close();

		}
		else if (choice==2) {
			System.out.println("Enter Person Age : ");
			int age= sc.nextInt();
			
			System.out.println("is Smoker ? (true/false)");
			boolean smoker= sc.nextBoolean();
			
			System.out.println("Has PreExisting Disease ? : ");
			boolean disease = sc.nextBoolean();
			
			policy=new HealthInsurance(name,basePremium,age,smoker,disease);
			//policy.printPolicyDetails();
			//sc.close();

		}
		else {
			System.out.println("Invalide policy type ");
			sc.close();
			return;
		}
		policy.printPolicyDetails();
		sc.close();
		}

}
