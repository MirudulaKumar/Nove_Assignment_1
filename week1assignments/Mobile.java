package week1assignments;

public class Mobile {
	public void makecall() {
		String mobileModel="Samung GalaxyM32";
		float mobileWeight=6.35f;
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
			}
		
	public void sendMsg() {
		boolean IsfullCharge=true;
		int mobileCost=16500;
		System.out.println(IsfullCharge);
		System.out.println(mobileCost);
	}
		public static void main(String[]args) {
			Mobile Mobileinfo=new Mobile();
			Mobileinfo.makecall();
			Mobileinfo.sendMsg();
			System.out.println("This is my Mobile");
			
		}
		
		
		
	}
	


