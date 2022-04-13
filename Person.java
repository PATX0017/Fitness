/*
 * Justin Palso
 * 02/25/2022
 * Quiz 3
 */
public class Person {

	// Attributes
 String firstName;
 String lastName;
 char lastNameInitial;
int age;
 double weight;
 int feet;
 int inches;

	// Constructors
	Person(String firstName, String lastName, double weight, int feet, int inches) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;

	}

	Person(String firstName, char lastNameInitial, double weight, int feet, int inches) {
		this.firstName = firstName;
		this.lastNameInitial = lastNameInitial;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;

	}

	Person(String firstName, String lastName, char lastNameInitial, double weight,int age, int feet, int inches) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastNameInitial = lastNameInitial;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
		this.age=age;
	}

String calculateBMI() {
	int heightInInches= (feet * 12) +inches;
	double BMI = (weight * 703) / (heightInInches * heightInInches);
	
	String bmiLevel;
	
	if ( BMI <= 18.5f) {
	 bmiLevel="Underweight";
	}
	else if (BMI <= 18.5f || BMI <= 24.9f) {
	bmiLevel="Normal";
	}
	else if(BMI >= 25 || BMI <=29.9f) {
	bmiLevel="Overweight";
	}
	 else  {
	bmiLevel="Obese";
	}
	return BMI + ":" + bmiLevel;
	
	}

}
