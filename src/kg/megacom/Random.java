package kg.megacom;

import java.util.*;

public class Random {

    Scanner scan = new Scanner(System.in);
    LinkedHashSet<String> hashSet = new LinkedHashSet<>();


   public void addCity(){
       do{
           System.out.print("Введите города : ");
           String city = scan.next();
           hashSet.add(city);
       }while (hashSet.size()!=4);
    }
    public void   outputRandomCity(){
        LinkedList<String> LinkedList = new LinkedList<>(hashSet);
        int j = (int)(Math.random()*(hashSet.size()));
        System.out.println(hashSet);
        System.out.println(j);
        System.out.println(LinkedList.get(j));
    }




}
