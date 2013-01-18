package org.tomochika1985.wicket_sample;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.wicket.RuntimeConfigurationType;
import org.apache.wicket.guice.GuiceComponentInjector;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.util.file.IResourceFinder;
import org.apache.wicket.util.file.WebApplicationPath;
import org.tomochika1985.core.wicket.dispatcher.AnnotationEventDispatcher;
import org.tomochika1985.core.wicket.markup.MarkupPathResourceFinder;

import com.google.inject.Module;

/**
 * Application object for your web application. If you want to run this
 * application without deploying, run the Start class.
 * 
 * @see org.tomochika1985.wicket_sample.Start#main(String[])
 */
public class WicketApplication extends WebApplication {
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<HomePage> getHomePage() {
		return HomePage.class;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	@Override
	public void init() {
		super.init();

		// add your configuration here
		getRequestCycleSettings().setResponseRequestEncoding("UTF-8");
		getMarkupSettings().setDefaultMarkupEncoding("UTF-8");
		
		getFrameworkSettings().add(new AnnotationEventDispatcher());
		
		List<? extends Module> modules = getModules();
		GuiceComponentInjector injector = new GuiceComponentInjector(this, modules.toArray(new Module[modules.size()]));
		getComponentInstantiationListeners().add(injector);
		getBehaviorInstantiationListeners().add(injector);
	}

	@Override
	protected IResourceFinder getResourceFinder() {
		ServletContext sc = getServletContext();
		return new MarkupPathResourceFinder(sc, new WebApplicationPath(sc));
	}
	
	/**
	 * @return
	 */
	List<? extends Module> getModules() {
		List<? extends Module> moduels = new ArrayList<Module>();
		return moduels;
	}
	
	@Override
	public RuntimeConfigurationType getConfigurationType() {
		return RuntimeConfigurationType.DEVELOPMENT;
	}
}
