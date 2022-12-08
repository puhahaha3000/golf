package edu.global.golf.command;

public enum CommandList {
    TEACHER_LIST("/teacher_list.do", new TeacherListCommand(), "teacher_list.jsp"),
    CLASS_INSERT("/class_insert.do", new ClassInsertCommand(), "GolfMain.jsp"),
    CLASS_INSERT_VIEW("/class_insert_view.do", new ClassInsertViewCommand(), "class_insert_view.jsp"),
    CLASS_LIST("/class_list.do", new ClassListCommand(), "class_list.jsp"),
    TEACHER_SALE_LIST("/teacher_sale_list.do", new TeacherSaleListCommand(), "teacher_sale_list.jsp");

    private final String com;
    private final Command command;
    private final String viewPage;

    CommandList(String com, Command command, String viewPage) {
        this.com = com;
        this.command = command;
        this.viewPage = viewPage;
    }

    public String getCom() {
        return com;
    }

    public Command getCommand() {
        return command;
    }

    public String getViewPage() {
        return viewPage;
    }
}
