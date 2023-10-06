//package Springbook.user.dao;
////JDBC를 이용한 등록과 조회 기능이 있는 UserDao 클래스
//
//import Springbook.user.domain.User;
//import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
//
//import java.sql.*;
//
//public class UserDao {
//    public void add(User user) throws ClassNotFoundException, SQLException{
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection c = DriverManager.getConnection(
//                "jdbc:mysql://localhost/springbook","spring","book"
//        );
//        PreparedStatement ps = c.prepareStatement("insert into users(id, name, password) valuses(?,?,?)");
//
//        ps.executeUpdate();
//        c.close();
//
//
//    }
//
//    public User get(String id) throws ClassNotFoundException,SQLException {
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection c = DriverManager.getConnection(
//                "jdbc:mysql://localhost/springbook","spring","book");
//
//
//        PreparedStatement ps = c.prepareStatement(
//                "select * from user where id = ? ");
//        ps.setString(1, id);
//        ResultSet rs = ps.executeQuery();
//    rs.next();
//    User user = new User();
//    user.setId(rs.getString("Id"));
//    user.setName(rs.getString("name"));
//    user.setPassword(rs.getString("password"));
//
//    rs.close();
//    ps.close();
//    c.close();
//
//    return user;
//
//
//    }
//}
