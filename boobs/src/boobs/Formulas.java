package boobs;


    
public class Formulas {
    public Formulas() {}
    public String IntegerToBinary(int a) {//перевод целых чисел в бинарный код
        int a2;
        String b ="", binary="";
        for(int i=0; a>0;i++) {
            a2=a%2;
            a=a/2;
            b+=a2;
        }
        for(int i=b.length() - 1; i>=0; i--) {
            binary += b.charAt(i);
        }
        return binary;
    }
    public int BinaryToInteger(String binary) {//двоичный в десятичный
        int b = 0;
        int a = 1;
        for(int x=binary.length()-1; x>=0; x--) { // возведение в степень 
            char c = binary.charAt(x);
            if(c == '1') {b+=a;}
            a+=a;
        }   
    return b;
    }
    public void GeoProgress(long a, int b) {//геометрическая прогрессия
        for(int x=1; x<=b; x++) {        
            System.out.println(x +" - "+ a);
            a+=a;
        }
    }
    public void IncreaseFromOn(int a, int b) {//увеличение числа а на на число b
        for(int x=a; x<=100; x+=b) {
            System.out.println(x);
        }
    }
    public long SquearSum(int x, int y) {
        return x*x + y*y;
    }
    public int PercentIntFrom(int a, int b){//перевод в проценты
        int c = a*100/b;
        return c;
    }
    public void FibonachiFromHow(int a, int i) {//ряд Фибоначи
        int b = 0;
        int y=1;
        for(int x=1; y<=i; x++) {
            a=a+b;
            b+=a;            
            System.out.println(y+" - " + a);
            y++;
            if(y<=i) {
                System.out.println(y +" - "+ b);
                y++;
            }   
        }
    }
    
    
    
    
    
    
    
    
    
    
}
