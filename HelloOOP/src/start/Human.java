package start;


public class Human {
    
    public Human() {}
    
    private String hand;
    private String leg;
    private String head;
    private int age;
    private String name;

    public String getHand(){return hand;}
    public String getLeg(){return leg;}
    public String getHead(){return head;}
    public int getAge(){return age;}
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
    public void setHand(String hand){this.hand = hand;}
    public void setLeg(String leg){this.leg = leg;}
    public void setHead(String head){this.head = head;}
    public void setAge(int age){this.age = age;}
    
      public void showInfo() {//логика метода
        print("Info start:");
        if (getName() != null && getName() != "") {print("Имя: " + getName());} 
        if (getHand() != null && getHand() != "") {print("Имя: " + getHand());} 
        if (getLeg() != null && getLeg() != null) {print("Имя: " + getLeg());} 
        if (age > 0) {print("Возраст; " + age + " лет\n");}
        //else {print("Возраст не может быть меньше 0");}
        print("-------------------------------");
    }
    
    
    public void print(String str) {System.out.println(str);}

   
    
}
