/*Justin Palso
 * 02/25/2022
 * Quiz 3
 */
public class Fitness {
	public static void main(String[] agrs) {
		Person p1 = new Person("Tom", "H", 152, 5, 6);
		Person leslie = new Person("Leslie", "Knope", 'K', 122.9,32, 4, 11);
		Person man = new Person("Ron", "Swanson", 222.2, 6, 0);
		Person woman = new Person("April", "Ludgate", 110.5, 5, 5);

		System.out.println(p1.firstName + " : " +  p1.calculateBMI());
		System.out.println(leslie.firstName + " : " +  leslie.calculateBMI() );
		System.out.println(man.firstName + " : " +  man.calculateBMI());
		System.out.println(woman.firstName+ " : " +  woman.calculateBMI());
	}
}
