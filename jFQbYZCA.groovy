import com.atlassian.jira.component.ComponentAccessor
import com.atlassian.jira.event.type.EventDispatchOption
import com.atlassian.jira.issue.ModifiedValue
import com.atlassian.jira.issue.util.DefaultIssueChangeHolder

def getCustomFieldValue(issue, Long fieldId) {
    issue.getCustomFieldValue(ComponentAccessor.customFieldManager.getCustomFieldObject(fieldId))
    //ComponentAccessor.customFieldManager.getCustomFieldObject(fieldId)?.getValue(issue)
}
def sourceIssueReproter = getCustomFieldValue("Resume && Interview", 10346)
if(currentUser ==sourceIssueReproter){
    return true
}
return false