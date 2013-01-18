package org.tomochika1985.wicket_sample;

import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.tomochika1985.wicket_sample.addressbook.pages.AddressBookPage;
import org.tomochika1985.wicket_sample.common.pages.BaseWebPage;
import org.tomochika1985.wicket_sample.echo.Echo;
import org.tomochika1985.wicket_sample.forminput.FormInput;
import org.tomochika1985.wicket_sample.helloworld.HelloWorld;

public class HomePage extends BaseWebPage {
	private static final long serialVersionUID = 1L;

    public HomePage(final PageParameters parameters) {
		add(new BookmarkablePageLink<HelloWorld>("helloWorldLink", HelloWorld.class));
		add(new BookmarkablePageLink<Echo>("echoLink", Echo.class));
		add(new BookmarkablePageLink<FormInput>("forminputLink", FormInput.class));
		add(new BookmarkablePageLink<AddressBookPage>("addressBookLink", AddressBookPage.class));
    }
}
