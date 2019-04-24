//package Integrations;
//
//public class JiraIntegrations {
//
//    JiraClient jira = new JiraClient("<JiraUrl>", "<creds>");
//
//    public void createNewJiraIssue(ITestResult result, String projectName, String defectType, String defectSummary,
//                                   String defectDescription, String defectReporter, String defectAssignee) {
//        try {
//            if (result.getStatus() == ITestResult.FAILURE) {
//
//                /* Create new issue */
//                Issue newIssue = jira.createIssue(projectName, defectType).field(Field.SUMMARY, defectSummary)
//                        .field(Field.DESCRIPTION, defectDescription).field(Field.REPORTER, defectReporter)
//                        .field(Field.ASSIGNEE, defectAssignee).execute();
//            }
//        } catch (JiraException ex) {
//            System.err.println(ex.getMessage());
//
//            if (ex.getCause() != null)
//                System.err.println(ex.getCause().getMessage());
//        }
//    }
//
//    //request
//    curl \
//            -D- \
//            -u charlie:charlie \
//            -X POST \
//            --data {see below} \
//            -H "Content-Type: application/json" \
//            http://localhost:8080/rest/api/2/issue/
//
//
//    //input data
//    {
//        "fields": {
//        "project":
//        {
//            "key": "TEST"
//        },
//        "summary": "Who seeks a faultless friend RESTs friendless.",
//                "description": "Creating an issue and setting time tracking fields",
//                "issuetype": {
//            "name": "Bug"
//        },
//        "timetracking":
//        {
//            "originalEstimate": "1d 2h",
//            "remainingEstimate": "3h 25m"
//        }
//    }
//    }
//
//
//    //response
//    {
//        "id":"39000",
//            "key":"TEST-101",
//            "self":"http://localhost:8080/rest/api/2/issue/39000"
//    }
//
//
//}
