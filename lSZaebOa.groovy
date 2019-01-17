def issueTypes = ["Reimbursement"]
log.warn("#######" + sourceIssue.status.name)
if ((sourceIssue.status.name == "Submitted")&&(issueTypes.contains(sourceIssue.issueType.name))){
    return true
}
return false

