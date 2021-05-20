package javaCode;

public class MethodTest {
	public static void main(String []args) {
	int newScore = calculateScore("tim", 500);
	System.out.println("new score is " + newScore);
}
public static int calculateScore(String playerName, int score) {
	System.out.println("player "+playerName+ " scored "+ score +" points");
	return score * 1000;
}
}
