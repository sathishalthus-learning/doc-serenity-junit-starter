package starter.navigations;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class NavigationActions extends UIInteractions{

	@Step("Navigate to the duckgo homepage")
	public void toDuckDuckGoSearchPage() {
		openUrl("https://duckduckgo.com/");
	}
}
