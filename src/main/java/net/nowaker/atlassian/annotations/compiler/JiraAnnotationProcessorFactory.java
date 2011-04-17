package net.nowaker.atlassian.annotations.compiler;

import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.apt.AnnotationProcessorFactory;
import com.sun.mirror.apt.AnnotationProcessors;
import com.sun.mirror.declaration.AnnotationTypeDeclaration;
import net.nowaker.atlassian.annotations.jira.AtlasJiraServlet;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class JiraAnnotationProcessorFactory implements AnnotationProcessorFactory {

	public Collection<String> supportedOptions() {
		return Collections.emptyList();
	}

	public Collection<String> supportedAnnotationTypes() {
		return Collections.singletonList(AtlasJiraServlet.class.getCanonicalName());
	}

	public AnnotationProcessor getProcessorFor(Set<AnnotationTypeDeclaration> declarations, AnnotationProcessorEnvironment env) {
		AnnotationProcessor result;
		if (declarations.isEmpty()) {
			result = AnnotationProcessors.NO_OP;
		} else {
			result = new JiraAnnotationProcessor(env);
		}
		return result;
	}

}
