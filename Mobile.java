package week1.day1.assignments;

public class Mobile {
		
		public static void main(String[] args) {
			Mobile mb = new Mobile();			
			mb.sendMssg();
			mb.makeCall();
			mb.saveContact();
			}
		
		public void sendMssg() {
			System.out.println("This is sendMesage Method");
			}
		
		public void makeCall() {
			System.out.println("This is makeCall Method");
			}
		
		public void saveContact() {
			System.out.println("This is saveContact Method");
			}
}
