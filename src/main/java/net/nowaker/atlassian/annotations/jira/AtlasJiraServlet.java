package net.nowaker.atlassian.annotations.jira;

import java.lang.annotation.*;


@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
@Inherited
public @interface AtlasJiraServlet {

	// attributes

	String key() default "autogenerate"; // required

	String name() default "Servlet";

	boolean disabled() default false;

	boolean system() default false;

	String i18nNameKey() default "";

	// elements

	String description() default "";

	String[] resource() default {};

	String urlPattern(); // required

	// <init-param><param-name /><param-value /></init-param>

}
