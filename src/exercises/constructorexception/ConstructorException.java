package exercises.constructorexception;

import java.io.IOException;

public class ConstructorException extends ConstructorExceptionSuper {
	
	ConstructorException(){
		try {
			throw new IOException("CHILD THROW");
		}catch(IOException e) {
			System.out.println("CHILD CATCH");
		}finally {
			System.out.println("CHILD FINALLY");
		}
		
	}
}
