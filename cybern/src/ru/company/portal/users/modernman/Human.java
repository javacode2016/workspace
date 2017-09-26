package ru.company.portal.users.modernman;

public class Human {

	public Human() {}
	
	//конструктор для телефона
	public Human(String PhoneModel) {this.PhoneModel = PhoneModel;}
	
	
	private String PhoneModel;//переменная
	public String getPhoneModel() {//гетер
		return PhoneModel;
	}
	public void setPhoneModel(String phoneModel) {//сетер
		PhoneModel = phoneModel;
		}

	public void call() {print("Я звоню по телефону "+PhoneModel);}
	
	
	public void print(String src) {
		System.out.println(src);
	}
}
