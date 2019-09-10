package com.kerryliang.mytest.type;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;
import org.junit.jupiter.api.Test;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TypeReferenceTest {

    @Test
    public void test1() {
        TypeHandler<User[]> type = new UserTypeHandler();
    }

    class User {
    }
    class UserTypeHandler extends BaseTypeHandler<User[]> {
        @Override
        public void setNonNullParameter(PreparedStatement ps, int i, User[] parameter, JdbcType jdbcType) throws SQLException {
        }

        @Override
        public User[] getNullableResult(ResultSet rs, String columnName) throws SQLException {
            return new User[0];
        }

        @Override
        public User[] getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
            return new User[0];
        }

        @Override
        public User[] getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
            return new User[0];
        }
    }
}
