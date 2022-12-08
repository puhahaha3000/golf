package edu.global.golf.command;

import edu.global.golf.dao.ClassDao;
import edu.global.golf.dao.MemberDao;
import edu.global.golf.dao.TeacherDao;
import edu.global.golf.dto.ClassDto;
import edu.global.golf.dto.MemberDto;
import edu.global.golf.dto.TeacherDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class ClassInsertViewCommand implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        MemberDao memberDao = new MemberDao();
        ClassDao classDao = new ClassDao();
        TeacherDao teacherDao = new TeacherDao();

        ArrayList<MemberDto> memberDtoArrayList = memberDao.getList();
        ArrayList<ClassDto> classDtoArrayList = classDao.getList();
        ArrayList<TeacherDto> teacherDtoArrayList = teacherDao.getList();

        request.setAttribute("member_list", memberDtoArrayList);
        request.setAttribute("class_list", classDtoArrayList);
        request.setAttribute("teacher_list", teacherDtoArrayList);
    }
}
