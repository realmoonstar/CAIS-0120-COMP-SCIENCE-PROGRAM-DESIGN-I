//CSCI120 Final Exam Review

//1 – Student is a class inherited from Person. Is the following code correct? If not, mention what are the errors. 
Student student1 = new Student("Joe", 'm', 40, 22,"12345");
Person  person1 = new Person(“Mark”, ‘m’, 33, 22);
Person  person2  = new Student(“Fred”,’m’,34, 27,”67777”);  
Student student2 = null; 
     
student2  = (Student)person2;//student cannot inherit Person class
person2 = student1;
student1.setEyeColor("green");
person2.setHairColor(“blond”);
        	System.out.println("The eye color of the student is:" + student1.getEyeColor());
System.out.println("The eye color of the student is:" + person2.getEyeColor());
System.out.println("The id number of the student is:" + student2.getStudentId());
              student2 = (Student)person1;//student cannot inherit Person class
        	student2.setAge(20);
        	student1.growOlder(2);
        	System.out.println("The student age is: " + student1.getAge()); 


//2 – What will be the output of the following code: Hello World , mouse, none class C message void?
Class A
{
		public A()
		{
	}
	
	public String info()
	{
	return “world”; 
	}
	
	public void Message()
	{
		System.out.println(“Hello ” + info());
	}
	
	public static void main(String[] args)
	{
		A a = new B();
		B  b = new C();    
		A  c = new A();
		a.Message();
		b.Message();
		c.Message();	
	} 
}
 Class B extends A 
{
	Public B()
	{
	    super();
	}
	public String info()
	{
	return “mouse”; 
	}
	}
	
	Class C extends B
	{
		Public C()
		{
		    super();
	}
	Public void Message()
	{
			System.out.println(“Goodbye World”);
	}
}


//3  – 
//Given the following simple Person class:
Class Person
{
	private String name;
	private int age;
               public Person( String name, int age)
{
	this.name = name;
	this.age = age;
}

public int getAge()
{
   return age;
}
public void setAge(int age)
{
   this.age = age;
}
public void growOlder(int years)
{
	age += years;
} 
}

//Write a Student class that extends the Person class by adding an id property and a number of courses taken property,
//also change the functionality of the growOlder behavior to increment the age by twice the amount of years if the student is taking more than ten courses at a time.
//Do this in two different ways, first do it by using Containment/Composition and then do it by using Inheritance.
Class Student extends Class Person
{
	private int idNum;
	private int courses;
	
	Public Student(String name, int age, int idNum, int courseNum)
	{
		super(String name, int age);
		this.idNum = idNum;
		this.courseNum = courseNum;
	}

	public int getidNum()
	{
		return idNum;
	}

	public void setidNum(int idNum)
	{
		this.idNum = idNum;
	}
	public int getcourseNum()
	{
		return courseNum;
	}

	public void setcourseNum(int courseNum)
	{
		this.courseNum = courseNum;
	}
	public void growOlder(int years)
	{
		if courseNum > 10:
			age += 2*years;
	} 
}


//4 – The constructor of a Balloon class takes as parameter a string specifying the color of the balloon. 
//Write some code to declare and allocate an array of ten balloons and initialize all the balloons to be white.
//
Class Balloon
{
	private String color;
    public Balloon(String color, int amount)
	{
		this.color = color;
		this.amount = amount;
	}

	public int getColor()
	{
	   return color;
	}
	public void setColor(String color)
	{
	   this.color = color;
	}
	public int getAmount()
	{
	   return amount;
	}
	public void setAmount(int amount)
	{
	   this.amount = amount;
	}

	public void changeColor(String white)
	{
		for 10 in amount://every array set of 10 balloons set the color white
			color = white;
	} 
}


//5 – Create a two dimensional array of integers, fill it with random values and write some code that finds the maximum even element in the array. 
import random from randit
Public class Numbers
{
	array = array[]
	private int randomValues;
	randomValues = array[].append(randint.random)
	
}


//6- 
//Part 1:
//The following is a simple Car class:
Public  class Car
{ 
	private String licensePlate;
private int mileage;
private int totalGasCapacity;
private int curGasAmount;
private final int gallonsPerMile;

public Car(String initLicensePlate, int initTotalCapacity )
{
 licensePlate = initLicensePlate; 
 totalGasCapacity = initTotalCapacity;
 curGasAmount = totalGasCapacity;
mileage = 0;

}

public boolean drive(int miles)
    	{
        		boolean outOfGas = false;
        		int newMilesDriven = 0;
       		int gasConsumption = gallonsPerMile * miles;
        
       		if (gasConsumption > curGasAmount)
        		{
            			outOfGas = true;
            			newMilesDriven = curGasAmount / gallonsPerMile;
			curGasAmount = 0;

        		}
        		else
        		{
            			curGasAmount = curGasAmount - gasConsumption;
            			newMilesDriven = miles;
        		}
        		mileage = mileage + newMilesDriven;

        		return !outOfGas;
    	}

     public int getGasAmount()
             {
        	               return curGasAmount;
             }

public int getMileage( )
{ 
return mileage; 
}

    public void setMileage(int newMileage )
    {
        	if ( newMileage >= 0)
            	      mileage = newMileage;
    }

    public String getLicensePlate()
    {
              return licensePlate;
    }
}

//Derive a new class called HybridCar, a hybrid car can use both electricity and gas, therefore it will need new attributes to measure its total power charge and current charge (in power units) and also a constant attribute powerUnitsPerMile. Even though the hybrid car can use both gas and power, 
//it doesn’t use any gas unless there is currently no electrical power.


//Part 2:
//Write a program that gives the user the option to either create a new car, select an existing car and do a set of actions with it, or list all the mileage information for all vehicles and the average mileage.  When the user chooses to create a new car the program allows them to decide the type of car: regular (only gas powered) or hybrid and then prompts them for the other car information.  When the user chooses to perform actions with an existing car, the system asks them to enter the licensePlate of the car, retrieves the vehicle and then allows them to perform any of the following actions: 
//1)	drive it for an amount of miles
//2)	check the current amount of gas
//3)	check the current mileage
//The final option just displays the mileage for each vehicle in the system, and then displays the average of all.
