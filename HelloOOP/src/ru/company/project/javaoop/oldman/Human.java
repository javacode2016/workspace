package ru.company.project.javaoop.oldman;


public class Human {
    
//констуктоp
    public Human() {} 
    public Human(String name, int height,int weight,int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }     
    
    
//переменные класса
    private String name;//Name
    private int height;//рост
    private int weight;//вес
    private int age;//возраст


    
//гетер
    public int getHeight() {return height;}
    public int getWeight() {return weight;}
    public int getAge() {return age;}
    public String getName() {return name;}
//сетер
    public void setWeight(int str) {this.weight = str;}
    public void setHeight(int str) {this.height = str;}
    public void setAge(int str) {this.age = str;}
    public void setName(String str) {this.name = str;}

//методы
    public void go() {//логика метода
        print("Я иду домой");}
    public String speak() {return "Привет, я человек!";}
    public void eat() {print("я ем");}
    public void showInfo() {//логика метода
        print("Info oldman:");
        if (name != null && name != "") {print("Имя: " + name);} 
        //else {print("Имя отсутствует");}
        if (weight > 0) {print("Вес: " + weight);}
        //else {print("Вес не может быть меньше 0");}
        if (height > 0) {print("Рост: " + height);}
        //else {print("Рост не может быть меньше 0");}
        if (age > 0) {print("Возраст; " + age + " лет\n");}
        //else {print("Возраст не может быть меньше 0");}
        print("-------------------------------");
    }
    
    //печать
    private void print(int Str) {System.out.println(Str);}//инкапсуляция
    public void pubprint(String Str) {System.out.println(Str);}//инкапсуляция
    private void print(String str){System.out.println(str);}
}
