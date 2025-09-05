/*
	1. A variable is a container used to store data values(14, Adrima). -->
	2. Each variable in Java is associated with a specific 
	   data type that determines the kind of data it can hold. -->
	3. Syntax:
				dataType variableName;

				where,
					dataType: Specifies the type of data the variable 
							  can hold (e.g., int, double, String, etc.).
					variableName: The name you give to the variable.
				Supppose,
					46; --> Wrong
					int a = 46; --> It's Ok

	4. Types of Variables in Java
		a.Local Variables
		b.Instance Variables (Non-static fields)
		c.Class Variables (Static fields)

	5. Starting of Variable Name => ( $ , _ , a-z , A-Z );
       Remaining of variable Name = ( a-z , A-Z ,Integer Numbers , $ , _ );
       Example:-
	    		int $ = 12;
        		int _ = 46;
        		int Ab@c = 8; ----> Error!
        		int _Abc = 8;

*/
public class Intro {
	public static void main(String[] args) {
		int a = 95; // dataType : int, variablename : a, data value: 95
		System.out.print(a);
	}
}
