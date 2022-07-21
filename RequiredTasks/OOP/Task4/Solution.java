package RequiredTasks.OOP.Task4;

import java.util.Arrays;

/*
Напишите метод filter, который принимаетна вход массив(любого типа) и реализацию интерфейса Filter c методом apply(Object o), чтобы убрать из массива лишнее.
Проверьте как он работает на строках или других объектах.

у вас должен быть реализован следующий интерфейс

interface Filter {
    boolean apply(Object o);
}

реализация должна выглядеть так

String[] newArray =  (String[]) filter(array, new Filter() {
            @Override
            public boolean apply(Object o) {
                // you code
            }
        });

где метод фильтер - метдо класса Main и выглядит так

 public static Object[] filter(Object[] array, Filter filter)

 */
public class Solution {
    public static void main(String[] args) {
        String[] str = new String[]{"a","s","d","v","f","g"};
        var check = filter(str, obj -> (int) obj % 2 == 0);
        for (var now : check){
            System.out.println(now);
        }
    }
    static Object[] filter (Object[] arr, Filter filter){
        return Arrays.stream(arr).filter(filter::apply).toArray();
    }
}
