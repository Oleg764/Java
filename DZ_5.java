import java.lang.foreign.VaList;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.stream.Stream;

public class DZ_5 {

 

  public static void main(String[] args) {
    HashMap<String,String>hMap =new HashMap<>();
// 1.
hMap.put ("Толстой","Война и мир");
hMap.put ("Пушкин","Е.Онегин");
hMap.put ("Стивенсон","Остров сокровищ");
hMap.put ("Чехов","Вишнёвый сад");
hMap.put ("Достоевский","Преступление и наказание");
hMap.put ("Некрасов","Кому на руси жить хорошо");
hMap.put ("Грибоедов","Горе от ума");
hMap.put ("Герцен","Кто виноват?");
hMap.put ("Чернышевский","Что делать");
hMap.put ("Шолохов","Тихий дон");
//2,3
hMap.forEach((k,v) -> hMap.replace(k, v+'!') );  
hMap.forEach((k,v)-> System.out.println(k+":"+v));
//4.
hMap.putIfAbsent("Толкиен","Властелин колец");
System.out.println(hMap);
System.out.println("5.");
//5
hMap.computeIfPresent("Некрасов", (key,value )-> value = value.substring(value.indexOf(' ')+1));
System.out.println(hMap.get("Некрасов"));
//hMap.forEach((k,v)-> System.out.println(k+":"+v));
System.out.println("6.");
//6.
Iterator<String> iterator = hMap.keySet().iterator();
while(iterator.hasNext()) 
    {String key = iterator.next();
      String value =hMap.get(key);
      //hMap.replace(key, value, value + '&') ;
      System.out.println(key+':'+value);
    }
   System.out.println("7.");

// 7. 
Stream<String>str = hMap.values().stream();
str.forEach((value) -> {
System.out.println(  value +"просмотрен" );
   });
   
  }}



  



    

