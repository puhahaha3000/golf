package edu.global.golf.dao;

import edu.global.common.Constant;
import edu.global.golf.dto.TeacherSaleDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TeacherSaleDao implements ConvertableFromResultSet<TeacherSaleDto> {
    public ArrayList<TeacherSaleDto> getList() {
        String query = Constant.QUERY_TEACHER_SALE_LIST;
        return CommonDao.getArrayListFromQuery(query, this);
    }

    @Override
    public TeacherSaleDto convertToOneRecord(ResultSet resultSet) {
        TeacherSaleDto teacherSaleDto = null;
        try {
            if (resultSet.next()) {
                teacherSaleDto = new TeacherSaleDto(
                        resultSet.getString("TEACHER_CODE"),
                        resultSet.getString("CLASS_NAME"),
                        resultSet.getString("TEACHER_NAME"),
                        resultSet.getString("TUITION")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return teacherSaleDto;
    }
}
