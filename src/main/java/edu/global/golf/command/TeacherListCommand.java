package edu.global.golf.command;

import edu.global.golf.dao.TeacherDao;
import edu.global.golf.dto.TeacherDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class TeacherListCommand implements Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        TeacherDao teacherDao = new TeacherDao();
        ArrayList<TeacherDto> teacherDtoArrayList = teacherDao.getList();
        request.setAttribute("list", teacherDtoArrayList);
    }
}
