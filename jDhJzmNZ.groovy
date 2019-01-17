import com.atlassian.jira.issue.Issue
import com.atlassian.jira.component.ComponentAccessor

Issue parent =issue.getParentObject()
def issueTypes = ["Recruitment","Reimbursement"]
def isRecruitmentState = (sourceIssue.getAction()?.id == 1)&&(issueTypes.contains(parent.issueType.name))
def isReimbursementState = (sourceIssue.getAction()?.id == 111)&&(issueTypes.contains(parent.issueType.name))
return isRecruitmentState||isReimbursementState
return true