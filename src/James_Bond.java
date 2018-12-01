
public class James_Bond {
	Vault v = new Vault();
	int findCode() {
		for (int i = 0; i < 610; i++) {
			if(v.tryCode(i)==true) {
				return i;
			}
			
		}
		return -1;
		}
		
public static void main(String[] args) {
James_Bond Bond= new James_Bond();
Bond.findCode();
System.out.println(Bond.findCode());
}
}

