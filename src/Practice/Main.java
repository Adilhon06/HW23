package Practice;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IllegalNameLengtsExeption {

        User user = new User();
        Scanner scanner = new Scanner(System.in);

        while(true){
            user.setName(scanner.nextLine());
            user.setAge(scanner.nextInt());
            System.out.println(user.getInfo(user.getName(), user.getAge()));
            break;
        }
    }
}