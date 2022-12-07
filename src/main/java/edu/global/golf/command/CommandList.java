package edu.global.golf.command;

public enum CommandList {
    TEACHER_LIST("/teacher_list.do", new TeacherListCommand(), "teacher_list.jsp");

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
