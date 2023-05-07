/*Задача 1. Реализуйте структуру телефонной книги с помощью HashMap, 
учитывая, что 1 человек может иметь несколько телефонов.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class task5_1{
    public static void main(String[] args) {
        HashMap <String, ArrayList<Integer>> book = new HashMap<>();
        Scanner sc = new Scanner(System.in, "cp866");
        while (true){
            System.out.println();
            System.out.println("Добавить номер: '1';");
            System.out.println("Посмотреть справочник: '2';");
            System.out.println("Выход: '3'");
            int com = sc.nextInt();
            sc.nextLine();
            if (com==1){
                add(book,sc);
            }
            if (com==2){
                printall(book);
                System.out.println();
            }
            if (com==3){
                break;
            }
        }
        sc.close();
    }
    public static void add(HashMap <String, ArrayList<Integer>> book, Scanner sc){
        System.out.println("Введите фамилию: ");
        String name = sc.nextLine();
        System.out.println("Введите номер телефона: ");
        int num = sc.nextInt();
        if(!book.containsKey(name)){
            book.put(name, new ArrayList<>());
        }
        book.get(name).add(num);
        }
    public static void printall(HashMap <String, ArrayList<Integer>> book){
        book.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString().replaceAll("\\[", "").replaceAll("\\]",""));
        });
    }
    }
    