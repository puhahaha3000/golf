package edu.global.golf.dao;

import edu.global.common.Constant;
import edu.global.golf.dto.TeacherDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TeacherDao implements ConvertableFromResultSet<TeacherDto> {

    public ArrayList<TeacherDto> getList() {
        String query = Constant.QUERY_TEACHER_LIST;
        return CommonDao.getArrayListFromQuery(query, this);
    }

    @Override
    public TeacherDto convertToOneRecord(ResultSet resultSet) {
        TeacherDto teacherDto = null;
        try {
            if(resultSet.next()) {
                teacherDto = new TeacherDto(
                    resultSet.getString("TEACHER_CODE"),
                    resultSet.getString("TEACHER_NAME"),
                    resultSet.getString("CLASS_NAME"),
                    resultSet.getInt("CLASS_PRICE"),
                    resultSet.getString("TEACHER_REGIST_DATE")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return teacherDto;
    }
}
