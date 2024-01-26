import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Создаем объект Scanner для считывания ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Создаем список для хранения информации о студентах
        StringBuilder studentsData = new StringBuilder();
        //список для хранения студентов
        String input1;
        String input2;
        String input3;
        //пользователь вводит стринговые данные
        do
        {
            System.out.print("Введите имя студента или 'end' 3 раза для завершения ввода: ");
            input1 = scanner.nextLine();
            //пользователь вводит имя студента
            System.out.print("Введите возвраст студента: ");
            input2 = scanner.nextLine();
            //пользователь вводит возраст студента
            System.out.print("Введите средний балл студента: ");
            input3 = scanner.nextLine();
            //пользователь вводит ср. балл студента
            if (!input1.equalsIgnoreCase("end"))
            {
                studentsData.append(input1).append(" ");
                //сохранение введённых данных
            }
            if (!input2.equalsIgnoreCase("end"))
            {
                studentsData.append(input2).append(" ");
                //сохранение введённых данных
            }
            if (!input3.equalsIgnoreCase("end"))
            {
                studentsData.append(input3).append("\n");
                //сохранение введённых данных
            }
        }
        while (input3.equalsIgnoreCase("end"));
        {
            try
            {
                //алгоритм для записи информации о студентах в students.txt
                FileWriter writer = new FileWriter("students.txt");
                writer.write(studentsData.toString());
                writer.close();
                System.out.println("Информация о студентах сохранена в файле students.txt");
            }
            catch (IOException e)
            //выдаст ошибку если файл не записался
            {
                System.out.println("Ошибка при записи в файл: " + e.getMessage());
            }
        }
    }
}