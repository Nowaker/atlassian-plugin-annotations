package net.nowaker.atlassian.annotations.compiler;

import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.declaration.*;
import com.sun.mirror.util.SourcePosition;
import net.nowaker.atlassian.annotations.jira.AtlasJiraServlet;

import java.util.Map;

public class JiraAnnotationProcessor implements AnnotationProcessor {

	private final AnnotationProcessorEnvironment env;

	public JiraAnnotationProcessor(AnnotationProcessorEnvironment env) {
		this.env = env;
	}

	public void process() {
		final AnnotationTypeDeclaration type = (AnnotationTypeDeclaration) env.getTypeDeclaration(AtlasJiraServlet.class.getCanonicalName());
		for (Declaration declaration : env.getDeclarationsAnnotatedWith(type)) {
			for (AnnotationMirror annotationMirror : declaration.getAnnotationMirrors()) {
				SourcePosition position = annotationMirror.getPosition();
				Map<AnnotationTypeElementDeclaration, AnnotationValue> values = annotationMirror.getElementValues();

				System.out.println("Declaration: " + declaration.toString());
				System.out.println("Position: " + position);
				System.out.println("Values:");
				for (Map.Entry<AnnotationTypeElementDeclaration, AnnotationValue> entry : values
					.entrySet()) {
					AnnotationTypeElementDeclaration elemDecl = entry.getKey();
					AnnotationValue value = entry.getValue();
					System.out.println("    " + elemDecl + "=" + value);
				}
			}
		}
	}

}
