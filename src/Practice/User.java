package Practice;

public class User {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameLengtsExeption {
        this.name = name;

        if (name.length() > 20){
            throw new IllegalNameLengtsExeption("Длина не может быть больше 20ти знаков");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;

        if (age < 1 || age > 100){
            throw new IllegalAgeException("Возраст должен быть от 1 до 100");
        }
    }

    public String getInfo(String name, int age){
        return "Name: " + name + "\n" + "Age: " + age + "\n";
    }
}
