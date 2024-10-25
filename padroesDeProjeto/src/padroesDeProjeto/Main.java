package padroesDeProjeto;

public class Main {
	public static void main(String[] args) {
		
		Singleton  lazy = Singleton.getIntancia();
		System.out.println(lazy);
		
		Singleton  lazy1 = Singleton.getIntancia();
		System.out.println(lazy1);
	}
}
