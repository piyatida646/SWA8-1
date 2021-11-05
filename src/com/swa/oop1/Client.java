class Client {
	public static void main(String[] args) {
		Person john = new Person ("Mr.","John",25);
		employee emp = new Employee (john, 50000);
		emp.showDetail();
	}
}
