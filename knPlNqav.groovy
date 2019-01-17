import com.atlassian.jira.issue.Issue
import com.atlassian.jira.component.ComponentAccessor

Issue parent =issue.getParentObject()
def issueTypes = ["Release"," Recruitment"]
if(issueTypes continue(parent.issueType.)){
    return true
}
return false