package collec_prac;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.Vector;
import java.util.Map;
import java.util.TreeMap;

public class Collec_prac {
        
    public static void main(String[] args) {
//        HashSet<Integer> hs=new HashSet<>();
//        hs.add(10);
//        hs.add(51);
//        hs.add(15);
//        hs.add(14);
//        hs.add(20);
//        hs.size();
//        hs.remove(10);
//        Iterator i=hs.iterator();
//           while(i.hasNext())
//                {
//                    System.out.println(i.next());
//                }
        
//        TreeSet<Integer> ts=new TreeSet<>();
//        ts.add(15);
//        ts.add(50);
//        ts.add(22);
//        ts.add(65);
//        ts.add(26);
//        ts.remove(22);
//        Iterator i=ts.iterator();
//           while(i.hasNext())
//                {
//                    System.out.println(i.next());
//                }

//        ArrayList<String> al=new ArrayList<>();
//        al.add("karan");
//        al.add("nitesh");
//        al.add("sanat");
//        al.add("aryan");
//        al.add("vivek");
//        al.remove("sanat");
//        ListIterator li=al.listIterator();
//            while(li.hasNext())
//            {
//                System.out.println(li.next());
//            }
        
//        LinkedList<Integer> ls=new LinkedList<>();
//        ls.add(45);
//        ls.add(65);
//        ls.add(32);
//        ls.add(51);
//        ls.add(55);
//        ls.remove(65);
//        System.out.println(ls);
//        ListIterator li=ls.listIterator();
//            while(li.hasNext())
//            {
//              System.out.println(li.next());
//            }

//        Vector <Double> v=new Vector();
//        v.add(25.5);
//        v.add(62.6);
//        v.add(96.65);
//        v.add(55.6);
//        v.addElement(65.23);
//        v.add(88.21);
//        v.removeElement(65.23);
//        Enumeration e=v.elements();
//            while(e.hasMoreElements())
//            {
//                System.out.println(e.nextElement());
//            }
//        HashMap<String,Integer> hm=new HashMap<>();
//        hm.put("Karan", 7);
//        hm.put("Nitesh", 14);
//        hm.put("Mrinmoy", 21);
//        hm.put("Sahil", 28);
//        hm.put("Khuswan", 35);
//        hm.remove("Mrinmoy", 21);
//        System.out.println(hm);
//        for(Map.Entry<String,Integer>m:hm.entrySet())
//        {
//            System.out.println(m.getKey()+" "+m.getValue());
//        }
    
        
//        TreeMap<String,Integer> tm=new TreeMap<>();
//        tm.put("Karan",1);
//        tm.put("Anuj", 2);
//        tm.put("Himanshu", 3);
//        tm.put("Ashish", 4);
//        tm.remove("Ashish", 4);
//        for(Map.Entry<String,Integer>m:tm.entrySet())
//            {
//                System.out.println(m.getKey()+" "+m.getValue());
//            }
       
//        Hashtable<Integer,Double> ht=new Hashtable<>();
//        ht.put(25, 65.55);
//        ht.put(45,75.23);
//        ht.put(124, 61.33);
//        ht.put(63, 96.21);
//        ht.remove(25, 65.55);
//        for(Map.Entry<Integer,Double>m:ht.entrySet())
//            {
//                System.out.println(m.getKey()+" "+m.getValue());
//            }
        ArrayDeque<Double> ad=new ArrayDeque<>();
        ad.add(25.22);
        ad.add(12.23);
        ad.add(15.56);
        ad.add(23.45);
        ad.add(125.32);
        ad.remove(125.32);
        System.out.println(ad);
    }   
}