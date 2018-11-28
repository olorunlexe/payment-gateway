package com.interswitch.paymentgateway.dao;

import com.interswitch.paymentgateway.model.User;

import java.sql.Types;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserDaoTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate parameterJdbcTemplate;

    @Test
    public void test() {
//        User user = this.jdbcTemplate.queryForObject(
//                "select * from users where id = ?",
//                new  Object[]{1},
//                (rs, rowNum) -> {
//                    User user1 = new User();
//                    user1.setFirstName((rs.getString("first_name")));
//                    user1.setLastname(rs.getString("last_name"));
//                    user1.setEmail(rs.getString("email"));
//                    user1.setAccountNo(rs.getString("account_no"));
//                    user1.setPhoneNo(rs.getString("phone_no"));
//                    user1.setPassword(rs.getString("password"));
//                    return user1;
//                });
//        System.out.println(user);

//        List<User> userAll = (List<User>) this.jdbcTemplate.query(
//                "select * from users",
//                new RowMapper<User>() {
//                    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
//                        User user = new User();
//                        user.setFirstName((rs.getString("first_name")));
//                        user.setLastname(rs.getString("last_name"));
//                        user.setEmail(rs.getString("email"));
//                        user.setAccountNo(rs.getString("account_no"));
//                        user.setPhoneNo(rs.getString("phone_no"));
//                        user.setPassword(rs.getString("password"));
//                        return user;
//                    }
//                });
//        System.out.println(userAll);
    }

//    @Test
//    public void testNamed() {
////        SqlParameterSource namedParameters = new MapSqlParameterSource("id", 1);
////        User user=parameterJdbcTemplate.queryForObject("select * from users where id = :id",namedParameters,new BeanPropertyRowMapper<>(User.class));
////        System.out.println(user);
//
//
//        String sql = "select * from users where id = :id";
//
//        SqlParameterSource namedParameters = new MapSqlParameterSource("id", 1);
//
//        System.out.println((parameterJdbcTemplate.queryForObject(sql, namedParameters, new BeanPropertyRowMapper<>(User.class))));
//
//    }

    @Test
    public void testProc(){
        jdbcTemplate.setResultsMapCaseInsensitive(true);
        SimpleJdbcCall testProc = new SimpleJdbcCall(jdbcTemplate).withProcedureName("sp_users").returningResultSet("id", BeanPropertyRowMapper.newInstance(User.class));
        SqlParameterSource params = new MapSqlParameterSource("NID", 2);
        Map<String, Object> m = testProc.execute(params);
        if (!((List<User>) m.get("id")).isEmpty()) {
            System.out.println(((List<User>) m.get("id")).get(0));
        }

    }
}
