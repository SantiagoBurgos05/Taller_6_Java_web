package model.repository;

import model.User;

import java.sql.SQLException;

public class TestUserRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        Repository<User> repository = new UserRepositoryImpl();

        System.out.println("========saveObj Insert===========");
        User userInsert = new User();
        userInsert.setUser_firstname("santiago");
        userInsert.setUser_lastname("burgos");
        userInsert.setUser_email("santiago@mail.com");
        userInsert.setUser_password("nbvbgsdbf56130");
        repository.saveObj(userInsert);
        userInsert.setUser_firstname("CeSar");
        userInsert.setUser_lastname("SalazaR");
        userInsert.setUser_email("cesar@mail.com");
        userInsert.setUser_password("gdsaefra1561");
        repository.saveObj(userInsert);

        System.out.println("========== listaObj =========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ===========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("============== saveObj ===========");
        User userUpdate = new User();
        userUpdate.setUser_firstname("Michael");
        userUpdate.setUser_lastname("laiton");
        userUpdate.setUser_email("laiton123@mail.com");
        userUpdate.setUser_password("asgfsg5631");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== deleteObj ============");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);

    }
}
