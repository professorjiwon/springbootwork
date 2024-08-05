package com.study.springboot.multi;

public class Person {
	private String name;
	private String nickname;
	private Printer printer;
	
	public Person() {
	}
	public Person(String name, String nickname, Printer printer) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.printer = printer;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	public void print() {
		printer.print("Hello " + name + " : " + nickname);
	}
}
