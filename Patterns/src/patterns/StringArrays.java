
package patterns;

public class StringArrays {
 
//---------------------------------STRINGS---------------------------------
    
    String S = "Привет";

//Определить длину строки можно методом length():
    int x = S.length(); // Переменная x получит значение 12

//Получение отдельных символов строки
    char ch = S.charAt(2); // Переменная ch будет иметь значение 'и'

//Метод toCharArray() преобразует строку в массив символов:
    char[] che = S.toCharArray(); // ch будет иметь представлять собой массив {'П','р','и','в','е','т',' ',',',' ','м','и','р','!'}

//Замена отдельного символа
    String SS = S.replace('и', 'ы'); // SS = "Прывет, мыр!"

//Получение подстроки  /  Метод substring(int begin, int end) 
    String S2 = S.substring(4,7); // S2 = "ет,"
    //S2 = S.substring(4); // S2 = "ет, мир!"

//Разбиение строки на подстроки/ Метод split(String regExp)    
    String parts[] = S.split(" "); // Разбили строку S на отдельные слова, используя пробел в качестве разделителя, 
                                //в результате получили массив parts, где parts[0] = "Привет,", а parts[1] = "мир!"
    String part[] = S.split(" и"); // Разбили строку S на отдельные слова, используя в качестве разделителя пробел и букву и, 
                                //в результате parts[0] = "Пр", parts[1] = "вет,", parts[2] = "м", parts[3] = "р!"
//Сравнение строк    
    boolean i = SS.equals(S2); // Вернет true, если строки S1 и S2 идентичны
    boolean i1 = S2.equals(SS); // Абсолютно то же самое
    boolean y = S.equals("Привет, мир!"); // b = true
    //Метод equalsIgnoreCase(Object obj) работает аналогично, но строки, записанные в разных регистрах, считает совпадающими.

//Поиск подстроки
    int pos = S.indexOf('в'); // pos = 3
    int pos1 = "Вася".indexOf('с'); // pos = 2
    int pos2 = "Корова".indexOf('о', 2); // pos = 3
    int pos3 = "Корова".indexOf('К', 2); // pos = -1, поиск ведется с учетом регистра
    int pos4 = "Корова".indexOf("ор"); // pos = 1
    
//Изменение регистра символов в строке
    String S8 = S.toUpperCase(); // S = "ПРИВЕТ, МИР!"
    //toLowerCase()
    
    
//---------------------------------ARRAYS---------------------------------
    
    int[] a; // Создается ссылка на массив типа int
    double[] b, d; // Создаются две ссылки на массивы типа double
    double[] c = new double[]{2.3, 1.02, 8}; // В памяти выделяется место под массив из трех действительных элементов, 
                                //на него указывает переменная с, элементы массива сразу получают нужные значения    
    int[] p = new int[5]; // В памяти выделяется место под массив из пяти целочисленных элементов, переменная a будет указывать на этот массив
    double[] p1 = new double[4]; // В памяти выделяется место под массив из четырех действительных элементов, на него указывает переменная b
    
   
    
    public void arrays() {
        //перебор массива
for (int i8 = 0; i8 < p.length; i8++) {
// здесь можно что-нибудь сделать с элементом a[i]
    
}



}


}