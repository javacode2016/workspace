package ru.company.portal.users.modernman;

public class Human {

	public Human() {}
	
	//����������� ��� ��������
	public Human(String PhoneModel) {this.PhoneModel = PhoneModel;}
	
	
	private String PhoneModel;//����������
	public String getPhoneModel() {//�����
		return PhoneModel;
	}
	public void setPhoneModel(String phoneModel) {//�����
		PhoneModel = phoneModel;
		}

	public void call() {print("� ����� �� �������� "+PhoneModel);}
	
	
	public void print(String src) {
		System.out.println(src);
	}
}
