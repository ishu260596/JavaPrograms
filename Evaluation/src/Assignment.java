public abstract class Assignment {

    protected String assignmentName;
    protected String assignmentLink;
    protected String assignmentPassword;
    protected int noOfQuestions;

   abstract public void setAssignmentName(String assignmentName);

    abstract public void setAssignmentLink(String assignmentLink);

    abstract void setAssignmentPassword(String assignmentPassword);

    abstract public void setNoOfQuestions(int noOfQuestions);
}
