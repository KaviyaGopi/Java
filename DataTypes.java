/* 

Data Types :
------------- 
Name			size/space(byte)            Digits surely accepting
1) byte			1			                             	2
2) short		2			                            	4
3) int			4			                            	9
4) long			8				                           18

5) float		4			                  6-7 significant decimal digits
6) double		8			                   15 significant decimal digits

7) char
8) String

9) boolean					                      	true/false


1 byte = 8 bits

Syntax : for variable declaration (datatype):

datatype variableName = value;
eg, int k = 22; byte a = 17; 
*/

public class DataType
{
    public void empDetails()
    {
        byte age = 19;
        System.out.println("Employee age is : "+age);

        short pin = 2217;
        System.out.println("Employee pin is : "+pin);

        int pinCode = 072217;
        System.out.println("Employee Pin Code is : "+pinCode);

        long mobNum = 9988776655l;
        System.out.println("Employee mobile Number is :"+mobNum);

        float weight = 52.35f;
        System.out.println("Employee weight is : "+weight);

        double Salary = 87432.334;
        System.out.println("Employee Salary is : "Salary);

        char gender = 'F';
        System.out.println("Employee Gender is "+gender);

        String compName = "3 Idiots Pvt Ltd";
        System.out.println("Company Name is : "+compName);

        boolean maritalStatus = true;
        System.out.println("Employee marital status is "+maritalStatus);
    }
    public static void main(String args[])
    {
        DataType d = new DataType();
        d.empDetails();
    }
}
