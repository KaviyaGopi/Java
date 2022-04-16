/*
INHERITANCE : 
-------------

1) Single Inheritance
2) Multiple Inheritance
3) Multilevel Inheritance
4) Heirarchial Inheritance
5) Hybrid  Inheritance

In Java, Inheritance is achieved generally using extends keywords (Can be achieved using implements also)

1) Single Inheritance : 
-----------------------
- When one class inherits properties from another class, we call it single inheritance. 
- Here, the class that is inheriting properties or data members(methods) is known as Child Class
	And the class from whose properties are being inherited is Parent Class.

2) Multiple Inheritance : 
-------------------------
- When one class inherits properties from MORE THAN ONE classes, we call it multiple inheritance. 
- Here, again, the class that is inheriting properties or data members(methods) is known as Child Class
	And the classes from whose properties are being inherited are Parent Class.
**Note : Multiple Inheritance cannot be achieved in Java using "extends" keyword**

3) Multilevel Inheritance : 
---------------------------
- Lets say Class B inherits properties from Class A, then class C inherits properties from Class B.
  Such case is called multilevel inheritance.

4) Hierarchial Inheritance : 
----------------------------
- When MORE THAN ONE classes are inheriting properties from one class, we call it Hierarchial Inheritance.

5) Hybrid Inheritance : 
------------------------
- Lets say Class Q, R and S inherit properties from Class P, and then Class T inherits properties from classes
   Q, R and S. This case is a combination of Single and Multiple Inheritance. 
   Such a case is called Hybrid Inheritance. 

Note : Hybrid Inheritance cannot be achieved in Java using "extends" keyword**


Syntax : 
--------

1) Single Inheritance : 
	class A
	{
		body
	}
	class B extends class A 
	{
		main method
	}
	In the above program, Class A is the Parent Class and Class B is the Child Class.


*/

// Example Program :
class Kaviya
{
    public void empDetails()
    {
        System.out.println("This method contains details of employees");
    }
}
class Madhu extends Kaviya
{
    public static void main(String args[])
    {
        Madhu k = new Madhu();
        k.empDetails();
    }
}
