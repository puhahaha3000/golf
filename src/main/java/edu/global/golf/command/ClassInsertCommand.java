package edu.global.golf.command;

import edu.global.golf.dao.ClassDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClassInsertCommand implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        String[] params = {
                request.getParameter("REGIST_MONTH"),
                request.getParameter("C_NO"),
                request.getParameter("CLASS_AREA"),
                request.getParameter("TUITION"),
                request.getParameter("TEACHER_CODE")
        };
        ClassDao classDao = new ClassDao();
        classDao.insert(params);
    }
}
