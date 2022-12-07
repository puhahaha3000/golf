package edu.global.golf.command;

import edu.global.golf.dao.ClassDao;
import edu.global.golf.dto.ClassDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class ClassListCommand implements Command{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        ClassDao classDao = new ClassDao();
        ArrayList<ClassDto> classDtoArrayList = classDao.getList();
        request.setAttribute("list", classDtoArrayList);
    }
}
