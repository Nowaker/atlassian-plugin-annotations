package net.nowaker.atlassian.annotations.jira;

public @interface AtlasJiraProjectTabPanel {

	String name() default "Project Tab Panel";

	String key() default "autogenerated"; // required

	/**
	 * Either raw text to print or resource bundle key if i18nBundle is specified.
	 */
	String label();

	/**
	 * This is a number defining the order of all panels.
	 * The system panels are 10, 20, 30 and 40.
	 */
	int order() default 100;

	String description() default "";

	String i18nBundle() default "";

	String velocityTemplate();

}
