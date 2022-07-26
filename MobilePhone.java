package week1.day5;

public class MobilePhone {
	byte ramSize=12;
	int imeiNumber=568945256;
	short modelNumber=31258;
	String brandName="VIVO";
	String modelName="7.8";
	double mobilePrice=40000.39;
	public static void main(String[] args) {
		MobilePhone mob=new MobilePhone();
		int a=23;
		char p='c';
		System.out.println(p);
		System.out.println(a);
		System.out.println("RAM SIZE = "+mob.ramSize);
		System.out.println(mob.imeiNumber);
		System.out.println(mob.modelNumber);
		System.out.println(mob.brandName);
		System.out.println(mob.modelName);
		System.out.println(mob.mobilePrice);
		
		
	}

}
