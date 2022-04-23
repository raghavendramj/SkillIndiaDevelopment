class TestClass{	
	//Instance variables
	private int result = 0;	
	
	//Access Modifier -> Return Data type -> function name (ParameterType paramVariable, ...)
	public int addNumber(int a, int b){
		int localResult = a + b;
		this.result = localResult;
		System.out.println("Result is : "+ this.result);
		return localResult;
	}
}

public class PrivateMemebers{
	private int counter = 0;
	
	private void incrementNumber(int incrementValue){		
		counter += incrementValue; // ==> counter = counter + incrementValue
		System.out.println("Incremented counter value is: "+ this.counter);
	}
		
	public static void main(String args[]){		
		//incrementNumber(5); // error: non-static method incrementNumber(int) cannot be referenced from a static context
		PrivateMemebers object = new PrivateMemebers();
		//Reference Type reference Variable = new(Memory from heap) constructor(for initializing the object)
		object.incrementNumber(5);
		object.incrementNumber(6);
		object.incrementNumber(3);
		TestClass testClass = new TestClass();
		testClass.addNumber(10, 20); //error: addNumber(int,int) has private access in TestClass
	}
}

