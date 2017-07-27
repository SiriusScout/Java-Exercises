package exercise.equationsolver;

//This class solves for the quadratic formula
public class EquationSolver {
	
	EquationSolver(){
		
	}
	
	//takes in three constants and apply the quadratic formula to get the root values
	public Double[] solveQuadratic(Double constantA, Double constantB, Double constantC) {
		Double answer[] = {0.0,0.0};
		
		if(constantA != 0) {
			double sqrtPart = Math.sqrt(Math.pow(constantB,2)-4*constantA*constantC);
			
			answer[0] = ((-constantB) + sqrtPart)/(2*constantA);
			answer[1] = ((-constantB) - sqrtPart)/(2*constantA);
		}
		
		return answer;
	}

}
