import com.atlassian.jira.issue.Issue
import com.atlassian.jira.component.ComponentAccessor

Issue parent =issue.getParentObject()
def issueTypes = ["Reimbursement"]
log.warn("#####" + parent.status.name)
if ((parent.status.name == "Submitted")&&(issueTypes.contains(parent.issueType.name))){
    return true
}
return false
