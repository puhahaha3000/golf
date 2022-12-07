package edu.global.golf.command;

import edu.global.golf.dao.TeacherSaleDao;
import edu.global.golf.dto.TeacherSaleDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class TeacherSaleListCommand implements Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        TeacherSaleDao teacherSaleDao = new TeacherSaleDao();
        ArrayList<TeacherSaleDto> teacherSaleDtoArrayList = teacherSaleDao.getList();
        request.setAttribute("list", teacherSaleDtoArrayList);
    }
}
