import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {

        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("Blue");
        arrList.add("Red");
        arrList.add("Green");
        arrList.add("BLack");
        for (int j = 0; j < arrList.size(); j++) {
            System.out.println(arrList.get(j));
            arrList.set(j, arrList.get(j) + "!");
        }
        System.out.println("2. Добавим к каждому элементу ! :");
        for (String i : arrList) {
            System.out.println(i);
        }
        System.out.println("3. Добавим  элемент на первую позицию  :");
    
        arrList.add(0,"Orange");
        for (String i : arrList) {
            System.out.println(i);
        }
        System.out.println("4. Элемент на позиции 3 будет: "+arrList.get(3) );
        System.out.println("5. Оновление 3 элемента на  Gray: " );
        arrList.set(3,"Gray");
        System.out.println(arrList);
        System.out.println("6. Удаляем 3 элемент:");
        arrList.remove(3);
        System.out.println(arrList);
        System.out.print("7. Что бы найти индекс элемента Orange применим  метод indexOf : ");
        System.out.println(arrList.indexOf("Orange"));
        ArrayList<String> arr2List = new ArrayList<String>();
        arr2List.add("1");
        arr2List.add("2");
        arr2List.add("3");
        arrList.addAll(arr2List);
        System.out.print("9. Скопируем 2-й лист в первый :  "  );
        System.out.println(arrList);
    }}
