package com.multi.lambda;

import com.multi.lambda.a_basic.A_lambda;
import com.multi.lambda.a_basic.B_Functional;
import com.multi.lambda.b_standard_func.*;

public class App {
	public static void main(String[] args) {
		
		
		/*A_lambda l1= new A_lambda();
		l1.method1();*/
		
		new A_lambda().method1();
		
		B_Functional b = new B_Functional();
		b.method();
		
		
		new B_Functional().method22();
		
		new B_Functional().method3();
		
		new A_Consumer().method1();
		
		new B_Supplier().method1();
		
		new C_Function().method1();
		
		new D_Operator().method1();
		
		new E_Predicate().method1();
		
		
	}
}
