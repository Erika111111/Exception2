public class Human {
    String surname;
    String name;
    String middleName;
    String birthday;
    String numberPhone;
    String sex;


    public Human() {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.birthday = birthday;
        this.numberPhone = numberPhone;
        this.sex = sex;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public String getSex() {
        return sex;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>",surname, name, middleName, birthday, numberPhone, sex);

    }
}
