import com.atlassian.jira.issue.Issue
import com.atlassian.jira.component.ComponentAccessor
import com.atlassian.jira.component.ComponentAccessor
import com.atlassian.jira.util.JiraUtils
import com.atlassian.jira.workflow.WorkflowTransitionUtilImpl
import com.atlassian.jira.workflow.TransitionOptions

log.warn("############" + sourceIssue.getAciton()?.id)

Issue parent =issue.getParentObject()
def issueTypes = ["Recruitment","Reimbursement"]
log.warn("############" + sourceIssue.getAciton()?.id)
def isRecruitmentState = (sourceIssue.getAction()?.id == 1)&&(issueTypes.contains(parent.issueType.name))
def isReimbursementState = (parent.getAciton()?.id == 111)&&(issueTypes.contains(parent.issueType.name))
log.warn("############" + parent.getAciton()?.id)

return isRecruitmentState||isReimbursementState