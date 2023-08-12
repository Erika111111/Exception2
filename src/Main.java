import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    Human h = new Human();
    FileWriter writer;

    {
        try {
            writer = new FileWriter(new File(h.surname + ".txt"), true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        System.out.println("Введите данные, разделенные пробелом: ");
        System.out.println("Фамилия Имя Отчество датарождения номертелефона пол");
    }



}
