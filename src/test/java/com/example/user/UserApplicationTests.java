//package com.example.user;
//
//import Springbook.user.dao.UserDao;
//import Springbook.user.domain.User;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.sql.SQLException;
//
//@SpringBootTest
//class UserApplicationTests {
//
//    @Test
//    void contextLoads() {
//    }
//
//
//     public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        UserDao dao = new UserDao();
//
//            User user = new User(); user.setId("whiteship");
//            user.setName("박태우"); user.setPassword("married");
//            dao.add(user);
//            System.out.println(user.getId() + "등록 성공");
//         User user2 = dao.get(user.getId()); System.out.println(user2.getName()); System.out.println(user2.getPassword());
//         System.out.println(user2.getId() + " 조회 성공");
//    }
//
//}
