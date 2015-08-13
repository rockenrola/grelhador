package pt.radiozero.pages;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

import pt.radiozero.WicketApplication;
import pt.radiozero.pages.ProgramsPage;

/**
 * Simple test using the WicketTester
 */
public class TestProgramsPage
{
	private WicketTester tester;

	@Before
	public void setUp()
	{
		tester = new WicketTester(new WicketApplication());
	}

	@Test
	public void programspageRendersSuccessfully()
	{
		//start and render the test page
		tester.startPage(ProgramsPage.class);

		//assert rendered page class
		tester.assertRenderedPage(ProgramsPage.class);
	}
}
