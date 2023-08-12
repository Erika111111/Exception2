import java.util.Scanner;

public class PersonalData {

    public static void getHumanData(Human human) throws  RuntimeException{

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] data = input.split(" ");
        String surname = data[0];
        String name = data[1];
        String middleName = data[2];
        String birthday = data[3];
        String numberPhone = data[4];
        String sex = data[5];
// проверка на колличество входных данных
        if(data.length !=6){
            throw new RuntimeException("Вы ввели неверное колличество данных");
        }
// проверка на заполненность каждого поля
        if(surname.isEmpty()){
            throw new RuntimeException("Введите фамилию. Это обязательное поле.");
        }
        if(name.isEmpty()){
            throw new RuntimeException("Введите имя");
        }
        if(middleName.isEmpty()){
            throw new RuntimeException("Введите отчество");
        }
        // проверка номера телефона по кол-ву цифр
        numberPhone = "\\d{11}";
        if(numberPhone.length() !=11){
            throw new RuntimeException("номер телефона должен состоять из 11 цифр");
        }


    }


}
