package krasa.grepconsole.integration;

import com.intellij.execution.filters.ConsoleFilterProvider;
import com.intellij.execution.filters.Filter;
import com.intellij.openapi.project.Project;
import krasa.grepconsole.plugin.GrepConsoleApplicationComponent;
import org.jetbrains.annotations.NotNull;

public class GrepConsoleFilterProvider implements ConsoleFilterProvider {

	@NotNull
	@Override
	public Filter[] getDefaultFilters(@NotNull Project project) {
		GrepConsoleApplicationComponent applicationComponent = GrepConsoleApplicationComponent.getInstance();
		return new Filter[]{applicationComponent.getHighlightService(project)};
	}
}
