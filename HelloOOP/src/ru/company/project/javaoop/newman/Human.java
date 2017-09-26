package ru.company.project.javaoop.newman;


public class Human {
    private String phoneModel;
    
    public String getPhoneModel() {
        return phoneModel;}
    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;}
    
    public void call(){
        print("Я звоню по телефону " + phoneModel);
    }
    
    
    public void print(String str) {
        System.out.println(str);}
}
    
