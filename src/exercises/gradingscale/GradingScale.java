package exercises.gradingscale;

//gets the grading scale results
public class GradingScale {
	double score = 0.0;
	
	GradingScale(double score){
		this.score = score;
	}
	
	public double getGrade() {
		if(score <= 49.5)
			return 5.0;
		else if(score <= 59.5)
			return 4.7;
		else if(score <= 64.5)
			return 4.0;
		else if(score <= 69.5)
			return 3.7;
		else if(score <= 74.5)
			return 3.3;
		else if(score <= 79.5)
			return 3.0;
		else if(score <= 84.5)
			return 2.7;
		else if(score <= 89.5)
			return 2.3;
		else if(score <= 94.5)
			return 2.0;
		else if(score <= 99.5)
			return 1.7;
		else if(score <= 104.5)
			return 1.3;
		else
			return 1.0;
	}

}
