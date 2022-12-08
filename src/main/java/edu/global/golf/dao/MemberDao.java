package edu.global.golf.dao;

import edu.global.common.Constant;
import edu.global.golf.dto.MemberDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao implements ConvertableFromResultSet<MemberDto> {
    public ArrayList<MemberDto> getList() {
        String query = Constant.QUERY_MEMBER_LIST;
        return CommonDao.getArrayListFromQuery(query, this);
    }

    @Override
    public MemberDto convertToOneRecord(ResultSet resultSet) {
        MemberDto memberDto;
        try {
            memberDto = new MemberDto(
                    resultSet.getString("C_NO"),
                    resultSet.getString("C_NAME"),
                    resultSet.getString("PHONE"),
                    resultSet.getString("ADDRESS"),
                    resultSet.getString("GRADE")
            );
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return memberDto;
    }
}
