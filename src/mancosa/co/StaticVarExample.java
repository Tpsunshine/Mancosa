/*Java Program to demonstrate Static Variable.
 * Author: Thabo Pitso
 * Date: 2022 May 10
 */
package mancosa.co;

public class StaticVarExample 
{
	public static String myclassVar = "class or static variable";

	public static void main(String[] args) 
	{
		StaticVarExample obj = new StaticVarExample();
		StaticVarExample obj2 = new StaticVarExample();
		StaticVarExample obj3 = new StaticVarExample();
		
		//All three will display "class static variable"
		System.out.println(obj.myclassVar);
		System.out.println(obj2.myclassVar);
		System.out.println(obj3.myclassVar);
		
		//changing the value of static variable using obj2
		obj2.myclassVar = "Changed Text";
		
		//All three will display "Changed Text"
		System.out.println(obj.myclassVar);
		System.out.println(obj2.myclassVar);
		System.out.println(obj3.myclassVar);
		

	}

}
