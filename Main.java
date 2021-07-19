/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasyntaxpro8l2;

/**
 *
 * @author David-pc
 * Приведение типов в Java
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static byte a;
    public static short b;
    public static int c;
    public static long d;
    
    public static void main(String[] args) {
        /* 1
        Правильные типы
        Реализуй метод setValues(long value), 
        чтобы он устанавливал полученное значение параметра value переменным a, b, c и d.
        Изменять типы переменных a, b, c и d нельзя.
        */
        setValues(100);   
        
        
        /* 2
        Очень правильные типы
        Расставь операторы приведения типов в выражениях таким образом, чтобы код компилировался.
        Изменять типы переменных a, b, c и d нельзя.
        */
        long a = 109 + 15;
        int b = (int) a * 2;
        short c = (short) ((short) a / b);
        byte d = (byte) ((byte) a + b - c);
    }
    
    public static void setValues(long value){
        a = (byte) value;
        b = (short) value;
        c = (int) value;
        d = (long) value;
    }
    
}
