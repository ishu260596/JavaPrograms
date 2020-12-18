public class Spartans extends Assignment {
    private String batchName;

    @Override
    public void setAssignmentName(String assignmentName) {

        this.assignmentName = assignmentName;
    }

    @Override
    public void setAssignmentLink(String assignmentLink) {
        this.assignmentLink = assignmentLink;

    }

    @Override
    void setAssignmentPassword(String assignmentPassword) {
        this.assignmentPassword = assignmentPassword;
    }

    @Override
    public void setNoOfQuestions(int noOfQuestions) {
        this.noOfQuestions=noOfQuestions;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public void display() {
        System.out.println("The Assignment Name is " + assignmentName);
        System.out.println("The Assignment Link is "+assignmentLink);
        System.out.println("The Assignment Password is "+assignmentPassword);
        System.out.println("Total number of questions are "+noOfQuestions);
        System.out.println("Batch Name is "+batchName);
    }
}
