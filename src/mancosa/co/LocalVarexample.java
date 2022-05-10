/*These are declared inside a method of the class.
 * Author: Thabo Pitso
 * Date:2022 May 10
 */

package mancosa.co;

public class LocalVarexample 
{
	//Instance variable
	public String myVar = "instance variable";
	
	public void myMethod()
	{
		//local variable
		String myVar = "Inside a Method";
		System.out.println(myVar);
	}

	public static void main(String[] args) 
	{
		//creating an object
		LocalVarexample obj = new LocalVarexample();
		
		/*We are calling the method, that changes the value
		 * of myVar. We are displaying myVar again after the
		 * method call, demonstrate that the local variable
		 * scope is limited to the method itself.
		 *
	
		 */
		
		System.out.println("Calling the method");
		obj.myMethod();
		System.out.println(obj.myVar);
	}
	
	

}
