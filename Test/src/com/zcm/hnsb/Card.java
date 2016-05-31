package com.zcm.hnsb;

import java.util.Set;

public class Card {
	private String cardName;
	private int cardNum;
	private Set Person;
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public int getCardNum() {
		return cardNum;
	}
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	public Set getPerson() {
		return Person;
	}
	public void setPerson(Set person) {
		Person = person;
	}
	
}
