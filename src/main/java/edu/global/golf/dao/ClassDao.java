package edu.global.golf.dao;

import edu.global.common.Constant;
import edu.global.golf.dto.ClassDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClassDao implements ConvertableFromResultSet<ClassDto> {
    public void insert(String[] params) {
        String query = Constant.QUERY_INSERT_CLASS;
        CommonDao.execute(query, params);
    }

    public ArrayList<ClassDto> getList() {
        String query = Constant.QUERY_CLASS_LIST;
        return CommonDao.getArrayListFromQuery(query, this);
    }

    @Override
    public ClassDto convertToOneRecord(ResultSet resultSet) {
        ClassDto classDto = null;
        try {
            if (resultSet.next()) {
                classDto = new ClassDto(
                        resultSet.getString("REGIST_MONTH"),
                        resultSet.getString("C_NO"),
                        resultSet.getString("C_NAME"),
                        resultSet.getString("CLASS_NAME"),
                        resultSet.getString("CLASS_AREA"),
                        resultSet.getString("TUITION"),
                        resultSet.getString("GRADE")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return classDto;
    }
}
