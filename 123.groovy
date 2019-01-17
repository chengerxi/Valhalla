import com.atlassian.jira.issue.Issue
import com.atlassian.jira.component.ComponentAccessor

Issue parent =issue.getParentObject()
def issueTypes = ["Reimbursement"]
if ((parent.status.name == "Open")&&(issueTypes.contains(parent.issueType.name))){
    return true
}
return false