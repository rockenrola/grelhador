package pt.radiozero;

import org.apache.wicket.guice.GuiceComponentInjector;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

import com.google.inject.Binder;
import com.google.inject.Module;

import pt.radiozero.pages.ProgramsPage;
import pt.radiozero.services.ProgramsService;
import pt.radiozero.services.impl.ProgramsServiceImpl;

/**
 * Application object for your web application.
 * If you want to run this application without deploying, run the Start class.
 * 
 * @see pt.radiozero.Start#main(String[])
 */
public class WicketApplication extends WebApplication
{
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends WebPage> getHomePage()
	{
		return ProgramsPage.class;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	@Override
	public void init()
	{
		super.init();

		getComponentInstantiationListeners().add(new GuiceComponentInjector(this, new Module() {
			
			@Override
			public void configure(Binder binder) {
				binder.bind(ProgramsService.class).to(ProgramsServiceImpl.class);
				
			}
		}));
	}
}
