
package strexp;

public class Strexp {

    public static void main(String[] args) {
        String s="hello";
        String s2="HELLO";
        String i="india is my country";
        String s1=new String("india");
        char [] s3=new char[10];
        System.out.println(s1.concat(s));
        System.out.println(s.length());
        System.out.println(s1.charAt(2));
        i.getChars(12, 19, s3, 0);
        System.out.println(s3);
        System.out.println(s.equalsIgnoreCase(s2));
        System.out.println(i.startsWith("india"));
        System.out.println(s2.indexOf("L"));
        System.out.println(i.lastIndexOf('a'));//
        System.out.println(i.substring(9));
        System.out.println(i.replace('m','M' ));
        System.out.println(i.toUpperCase());
        System.out.println(i.toCharArray());
        
        
        
        
        
        StringBuilder d1=new StringBuilder("Hello");
        d1.append("World");
        System.out.println(d1);
        System.out.println(d1.delete(5, 9));
        System.out.println(d1.insert(0, s1));
        
    }
    
}
