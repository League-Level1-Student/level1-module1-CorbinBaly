

public class CatRunner {
		public static void main(String[] args) {
			String cat= "kitty";
			Cat fc= new Cat(cat);
			
			
		
		
		

	        // 1. Make the Cat meow
			fc.meow();
			// 2. Get the Cat to print it's name
			fc.printName();
			// 3. Kill the Cat!
			for (int i = 0; i < 9; i++) {
			fc.kill();
			}
		}
	}
