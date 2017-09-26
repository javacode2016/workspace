package ru.company.portal.users.oldman;

public class Human {

	//конструктор
	public Human() {

	}
	
	public Human(String name, int age, int height,int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	private String name; //имя
	public String getName() {return name;}//Гетер, возвращает имя
	public void setName(String name) {this.name = name;}//сетер, назначает имя приватной переменной
	
	private int age;//возраст
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	
	private int height;	//рост
	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}
	
	private int weight;	//вес
	public int getWeight() {return weight;}
	public void setWeight(int weight) {this.weight = weight;}
	
	public void go() {print("i go home!"+" my name is "+name+" and my age is "+age);}
	public String speak() {return "Hi, i am a man!";}
	public void eat() {print("i eat о");}
	
	//печать строки
	private void print(String str){System.out.println(str);}
	public void printpub(String str){System.out.println(str);}
	public void showInfo() {print("Информация о человеке:\n"+"Имя: "+name+"\n"+"Возраст: "+age+"\n"+"Рост: "+height+"\n"+"Вес: "+weight);}
}
