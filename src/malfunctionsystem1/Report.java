
package malfunctionsystem1;


public class Report {
     private int id;

    private String issue;
    private String location;

    private String status;

    private String submittedBy;

    public Report(int id, String issue,
                  String location, String submittedBy) {
        this.id = id;
        this.issue = issue;
        this.location = location;
        this.submittedBy = submittedBy;
        this.status = "NEW"; // default status
    }

    public int getId() {
        return id;
    }

    public String getIssue() {
        return issue;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               " | Issue: " + issue +
               " | Class number: " + location +
               " | Status: " + status +
               " | By: " + submittedBy;
    }
    
}
