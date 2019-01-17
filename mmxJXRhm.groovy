import com.atlassian.jira.issue.Issue
import com.atlassian.jira.component.ComponentAccessor
import com.atlassian.jira.event.type.EventDispatchOption
import com.atlassian.jira.issue.ModifiedValue
import com.atlassian.jira.issue.util.DefaultIssueChangeHolder

log.warn("########")
def findAllRelevantSubtasksFor(Issue parent) {
    parent.getSubTaskObjects().findAll { (it.status.name != 'Rejected')&&(it.status.name != 'Returned') }
}
def getCustomFieldValue(Issue issue, Long fieldId) {
    def fieldValue = issue.getCustomFieldValue(ComponentAccessor.customFieldManager.getCustomFieldObject(fieldId))
    log.warn("!!!!!!!!" + fieldValue)
    return fieldValue
    //ComponentAccessor.customFieldManager.getCustomFieldObject(fieldId)?.getValue(issue)
}
def parentIssue = issue.getParentObject()
def totalQuantity = getCustomFieldValue(parentIssue,10314)
log.warn(totalQuantity)
def subTasks = findAllRelevantSubtasksFor(parentIssue)
log.warn(subTasks)
def listUniteQuantity = subTasks.collect{it -> getCustomFieldValue(it,10314)}
log.warn("##" + listUniteQuantity)
def sumQuantity = listUniteQuantity.sum(0)
def sumValue = getCustomFieldValue(issue,10314) + sumQuantity
log.warn("########" + sumValue)
if (totalQuantity < sumValue){
    return false
}
return true