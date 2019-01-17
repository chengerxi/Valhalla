import com.atlassian.jira.issue.Issue
import com.atlassian.jira.component.ComponentAccessor

Issue parent =issue.getParentObject()
def issueTypes = ["Recruitment"]
if((sourceIssue.getAction()?.id == 1)&&(issueTypes.contains(parent.issueType.name)){
    return true
}
return false