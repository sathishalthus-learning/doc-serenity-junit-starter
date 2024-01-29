package starter.tests;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import starter.actions.SearchActions;
import starter.navigations.NavigationActions;
import starter.pages.SearchResultSidebar;

@ExtendWith(SerenityJUnit5Extension.class)
public class DuckDuckSearchCarrot {
	
	@Managed(driver = "chrome")
	WebDriver driver;
	
	NavigationActions navigate;
	SearchActions search;
	SearchResultSidebar  result;
	
	@Test
	void theKeywordShouldAppearInTheResultsSideBar() {
		//
		navigate.toDuckDuckGoSearchPage();
		search.byKeyword("carrot");
		Serenity.reportThat("Cucumber Found", 
				()-> Assertions.assertThat(result.heading()).isEqualTo("Cucumber")
			);
	}
}
