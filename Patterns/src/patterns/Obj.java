
package patterns;


public class Obj {
    int iu;

//Класс Character/2 метода проверки символов
    boolean a = Character.isJavaIdentifierPart('9');
        //является ли символ буквой-цифрой-знак_подчеркивания(_)-знак_доллара($)
    boolean b = Character.isJavaIdentifierStart('i');
        //является ли символ буквой Java
    
    public void start() {
        for(int i=1; i<=iu;i++){
            System.out.println(":start");
        }
        
        
    }
    
}
