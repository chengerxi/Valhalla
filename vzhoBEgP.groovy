import com.atlassian.jira.issue.Issue
import com.atlassian.jira.component.ComponentAccessor
import com.atlassian.jira.component.ComponentAccessor
import com.atlassian.jira.util.JiraUtils
import com.atlassian.jira.workflow.WorkflowTransitionUtilImpl
import com.atlassian.jira.workflow.TransitionOptions

Issue parent =issue.getParentObject()
def issueTypes = ["Recruitment","Reimbursement"]
def isRecruitmentState = (sourceIssue.getAction()?.id == 1)&&(issueTypes.contains(parent.issueType.name))
def isReimbursementState = (parent.ac()?.id == 111)&&(issueTypes.contains(parent.issueType.name))
return isRecruitmentState||isReimbursementState