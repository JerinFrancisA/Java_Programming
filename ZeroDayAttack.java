import java.util.Scanner;

public class ZeroDayAttack {

	
		private int item_id;
		private String item_name;
		private int item_type;
		private int item_quantity;
		private double item_price;
		
		void getDetails() {
			System.out.println("Item ID : " + item_id);
			System.out.println("Item Name : " + item_name);
			System.out.println("Item Price : " + item_price);
			System.out.println("Item Quantity : " + item_quantity);
			System.out.println("Item Type : " + item_type);
		}
		
		void setDetails() {
			System.out.println("success");
			Scanner in = new Scanner(System.in);
			System.out.println("Enter Item Details : \n");
			System.out.println("Enter Item ID : ");
			item_id = in.nextInt();
			System.out.println("Enter Item Name : ");
			item_name = in.next();
			System.out.println("Enter Item Type : ");
			item_type = in.nextInt();
			System.out.println("Enter Item Quantity : ");
			item_quantity = in.nextInt();
			System.out.println("Enter Item Price : ");
			item_price = in.nextDouble();
			in.close();
		}
		
		private double calculateTax(int type, double price) {
			double tax = 0.0;
			switch(type) {
			case 1: tax = price * (0.05); break;
			case 2: tax = price * (0.12); break;
			case 3: tax = price * (0.18); break;
			case 4: tax = price * (0.28); break;
			default: tax = 0.0;
			}
			return tax;
		}
		
		void printInvoice() {
			System.out.println("INVOICE : \n");
			getDetails();
			System.out.println("Tax : " + calculateTax(item_type, item_price));
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How many items : ");
		int n = in.nextInt();
		ZeroDayAttack obj[] = new ZeroDayAttack[20];
		for(int i = 0; i < n; i++) {
			obj[i] = new ZeroDayAttack();
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter Item " + (i + 1) + " details : \n");
			obj[i].setDetails();
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println("INVOICE " + (i + 1) + " details : \n");
			obj[i].printInvoice();
		}
		in.close();
	}
}