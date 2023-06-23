package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    private static final UserService userService = new UserServiceImpl();
    public static void main(String[] args) {

        userService.createUsersTable();
        userService.saveUser("Ivan","Ivanov",(byte) 32);
        userService.saveUser("Peter","Ivanov",(byte) 32);
        userService.saveUser("Sergey","Kalibin",(byte) 50);
        userService.saveUser("Andrey","Petrov",(byte) 32);
        userService.removeUserById(1);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
