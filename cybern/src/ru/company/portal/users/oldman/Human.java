package ru.company.portal.users.oldman;

public class Human {

	//�����������
	public Human() {

	}
	
	public Human(String name, int age, int height,int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	private String name; //���
	public String getName() {return name;}//�����, ���������� ���
	public void setName(String name) {this.name = name;}//�����, ��������� ��� ��������� ����������
	
	private int age;//�������
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	
	private int height;	//����
	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}
	
	private int weight;	//���
	public int getWeight() {return weight;}
	public void setWeight(int weight) {this.weight = weight;}
	
	public void go() {print("i go home!"+" my name is "+name+" and my age is "+age);}
	public String speak() {return "Hi, i am a man!";}
	public void eat() {print("i eat �");}
	
	//������ ������
	private void print(String str){System.out.println(str);}
	public void printpub(String str){System.out.println(str);}
	public void showInfo() {print("���������� � ��������:\n"+"���: "+name+"\n"+"�������: "+age+"\n"+"����: "+height+"\n"+"���: "+weight);}
}
