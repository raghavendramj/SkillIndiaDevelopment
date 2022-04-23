class Animal {
	static String name = "Cheetah";
	public static String getAnimal(){
		return "Tiger";
	}
}

public class StaticMembers{

	public void callMembers(){
			System.out.println("Animal.name :- "+ Animal.name);
			System.out.println("Animal.getAnimal() :- "+ Animal.getAnimal());
	}
	public static void main(String args[]){
		StaticMembers object =	new StaticMembers();
		object.callMembers();
	}
}
