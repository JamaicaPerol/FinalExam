public class Main {

	public static void main(String[] args) {
		Customer c;
		RegularCustomer rc = new RegularCustomer("Leah", 10.00);
		SeniorCustomer sc = new SeniorCustomer("Aki", 10.00);

		c = rc;
		System.out.println(c.calculateBill());
		c = sc;
		System.out.println(c.calculateBill());
	}
}
