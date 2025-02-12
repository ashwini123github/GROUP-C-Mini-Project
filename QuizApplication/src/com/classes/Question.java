package com.classes;

public class Question {
	
	   private int questionId;
	    private String questionText;
	    private String optionA;
	    private String optionB;
	    private String optionC;
	    private String optionD;
	    private char correctOption;
	    
		public Question(int questionId, String questionText, String optionA, String optionB, String optionC,
				String optionD, char correctOption) {
			this.questionId = questionId;
			this.questionText = questionText;
			this.optionA = optionA;
			this.optionB = optionB;
			this.optionC = optionC;
			this.optionD = optionD;
			this.correctOption = correctOption;
		}

		public int getQuestionId() {
			return questionId;
		}

		public void setQuestionId(int questionId) {
			this.questionId = questionId;
		}

		public String getQuestionText() {
			return questionText;
		}

		public void setQuestionText(String questionText) {
			this.questionText = questionText;
		}

		public String getOptionA() {
			return optionA;
		}

		public void setOptionA(String optionA) {
			this.optionA = optionA;
		}

		public String getOptionB() {
			return optionB;
		}

		public void setOptionB(String optionB) {
			this.optionB = optionB;
		}

		public String getOptionC() {
			return optionC;
		}

		public void setOptionC(String optionC) {
			this.optionC = optionC;
		}

		public String getOptionD() {
			return optionD;
		}

		public void setOptionD(String optionD) {
			this.optionD = optionD;
		}

		public char getCorrectOption() {
			return correctOption;
		}

		public void setCorrectOption(char correctOption) {
			this.correctOption = correctOption;
		}

		@Override
		public String toString() {
			return "Question [questionId=" + questionId + ", questionText=" + questionText + ", optionA=" + optionA
					+ ", optionB=" + optionB + ", optionC=" + optionC + ", optionD=" + optionD + ", correctOption="
					+ correctOption + "]";
		}
	    
		
		
	    
}
