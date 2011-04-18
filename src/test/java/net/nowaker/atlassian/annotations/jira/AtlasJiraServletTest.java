package net.nowaker.atlassian.annotations.jira;

import org.junit.Test;

import javax.servlet.http.HttpServlet;

@AtlasJiraServlet(
	urlPattern = "/jira/test"
)
public class AtlasJiraServletTest extends HttpServlet {

	@Test
	public void should() throws Exception {
		// given
		
		// when

		// then
	}
	
}
