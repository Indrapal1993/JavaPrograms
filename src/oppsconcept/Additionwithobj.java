package oppsconcept;

public class Additionwithobj {
	public int a = 16, b = 5, sum;

	public void add() {
		System.out.println("Addition of two number");
		sum = a + b;
		System.out.println("Result is =" + sum);
	}

	public void mul() {
		System.out.println("Multiplication of two number");
		int mul;
		mul = a * b;
		System.out.println("Result is =" + mul);
	}

	public class Inherit extends Additionwithobj {
		public void divide() {
			System.out.println("Division of two number ");
			double div;
			div = a / b;
			System.out.println("Result is =" + div);
		}

		public void reminder() {
			System.out.println("Reminder of these two number");
			double rem;
			rem = a % b;
			System.out.println("Result is= " + rem);
		}
	}

	public static void main(String args[]) {

		Additionwithobj obj = new Additionwithobj();
		obj.add();
		obj.mul();
	}

	Inherit obj1 = new Inherit();
	{

		obj1.divide();
		obj1.reminder();

	}
}
