public class Greet {
	static void GreetMethod(String name) {
		System.out.println("How's it going"+name+"? Good to see you again!");
	}

	public static void main(String[] args) {
		GreetMethod(" REDACTED");
		GreetMethod(" Jason");
		GreetMethod(" David");
	}
}



