package net.nowaker.atlassian.annotations.jira;

import javax.servlet.http.HttpServlet;

@AtlasJiraServlet(
	urlPattern = "/jira/test"
)
public class AtlasJiraServletTest extends HttpServlet {
}
