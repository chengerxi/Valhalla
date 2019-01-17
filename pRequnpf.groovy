import com.atlassian.jira.component.ComponentAccessor
import com.atlassian.jira.security.roles.ProjectRoleManager

def getProjectRole(String projectRoleName) {
    def projectRoleManager = ComponentAccessor.getComponent(ProjectRoleManager)
    projectRoleManager.getProjectRole(projectRoleName)
}

def getUsersOnProjectRole(project, role) {
    def projectRoleManager = ComponentAccessor.getComponent(ProjectRoleManager)
    projectRoleManager.getProjectRoleActors(role, project)?.getApplicationUsers()
}

def role = getProjectRole('Manager')

def adminManagers = getUsersOnProjectRole(issue.getProjectObject(), role)
log.warn("######## the adminManagers are: " + adminManagers)
log.warn("######## issue.assignee is: " + issue.assignee)

adminManagers.contains(issue.assignee)
