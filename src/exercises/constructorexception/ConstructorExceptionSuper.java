package exercises.constructorexception;

import java.io.IOException;

//a super constructor cannot catch errors from the base or vice versa
public class ConstructorExceptionSuper {
	ConstructorExceptionSuper(){
		try {
			throw new IOException("SUPER THROW");
		}catch(IOException e) {
			System.out.println("SUPER CATCH");
		}finally {
			System.out.println("SUPER FINALLY");
		}
	}
}
