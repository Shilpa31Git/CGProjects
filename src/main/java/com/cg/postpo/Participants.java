package com.cg.postpo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Participants implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String maker;

	private java.lang.String checker;

	public Participants() {
	}

	public java.lang.String getMaker() {
		return this.maker;
	}

	public void setMaker(java.lang.String maker) {
		this.maker = maker;
	}

	public java.lang.String getChecker() {
		return this.checker;
	}

	public void setChecker(java.lang.String checker) {
		this.checker = checker;
	}

	public Participants(java.lang.String maker, java.lang.String checker) {
		this.maker = maker;
		this.checker = checker;
	}

}