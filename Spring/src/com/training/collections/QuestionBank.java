package com.training.collections;

import java.util.List;

public class QuestionBank {
  private String question;
  private List<String> option;
  
  
@Override
public String toString() {
	return "QuestionBank [question=" + question + ", option=" + option + "]";
}


public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public List<String> getOption() {
	return option;
}
public void setOption(List<String> option) {
	this.option = option;
}
}
