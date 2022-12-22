package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        System.out.println("1 -> добавить студента" + "\n" + "2 -> удалить студента" + "\n" + "3 -> все студенты \n 4 -> удалить всех студентов \n 5 -> to finish");
        int num = scanner.nextInt();
        while (num!=5){
            if (num == 1) {
                students.add(new Student(scanner.next(), scanner.next(), scanner.nextInt()));
                System.out.println("1 -> добавить студента" + "\n" + "2 -> удалить студента" + "\n" + "3 -> все студенты \n 4 -> удалить всех студентов \n 5 -> to finish");
                num = scanner.nextInt();
            }
           else if (num==2){
                System.out.println("Index:");
                int a = scanner.nextInt();
                students.remove(a);
                System.out.println("1 -> добавить студента" + "\n" + "2 -> удалить студента" + "\n" + "3 -> все студенты \n 4 -> удалить всех студентов \n 5 -> to finish");
                num = scanner.nextInt();
            }
           else if (num == 3){
                System.out.println("\n"+students);
                System.out.println("1 -> добавить студента" + "\n" + "2 -> удалить студента" + "\n" + "3 -> все студенты \n 4 -> удалить всех студентов \n 5 -> to finish");
                num = scanner.nextInt();
            } else if (num == 4) {
                students.clear();
                System.out.println("1 -> добавить студента" + "\n" + "2 -> удалить студента" + "\n" + "3 -> все студенты \n 4 -> удалить всех студентов \n 5 -> to finish");
                num = scanner.nextInt();
            }
        }
        System.out.println("finish \uD83C\uDFC1");
    }
}