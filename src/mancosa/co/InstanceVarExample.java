/*Java Program to demonstrate Instance Variable
 * Author: Thabo Pitso
 * Date: 2022/05/10
 */

package mancosa.co;

public class InstanceVarExample 
{
	String InstanceVar = "instance variable";

	public static void main(String[] args) 
	{
		InstanceVarExample obj = new InstanceVarExample();
		InstanceVarExample obj2 = new InstanceVarExample();
		InstanceVarExample obj3 = new InstanceVarExample();
		
		System.out.println(obj.InstanceVar);
		System.out.println(obj2.InstanceVar);
		System.out.println(obj3.InstanceVar);
		
		System.out.println();
		
		obj2.InstanceVar = "Changed Text";
		
		System.out.println(obj.InstanceVar);
		System.out.println(obj2.InstanceVar);
		System.out.println(obj3.InstanceVar);
		

	}

}
