public class Quiz {
	public Student student;
	public int id;
	public int totalScore;
	public int maxScore;

	public Quiz(int id, Student student, int totalScore, int maxScore) {
		this.id = id;
		this.student = student;
		this.totalScore = totalScore;
		this.maxScore = maxScore;
	}

	public double grade() {
		return totalScore / maxScore;
	}
}
