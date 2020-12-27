package com.assignment.base;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootTest
class BaseApplicationTests {

    String URL = "jdbc:mysql://localhost:3306/mysql?serverTimezone=UTC&characterEncoding=UTF-8";
    String USER = "root";
    String pw = "tiger";
    @Test
    void contextLoads() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection connection = DriverManager.getConnection(URL, USER, pw)) {
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
