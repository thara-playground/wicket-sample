/*
* Copyright 2011 Tomochika Hara.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.tomochika1985.wicket_sample.echo;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;
import org.tomochika1985.wicket_sample.common.pages.BaseWebPage;

/**
 * @author t_hara
 *
 */
public class Echo extends BaseWebPage {

	private String message = "[type your message to the world here.]";
	
	private static final long serialVersionUID = 1L;

	public Echo() {
		super();
		
		PropertyModel<String> messageModel = new PropertyModel<String>(this, "message");
		add(new Label("msg", messageModel));
		
		Form<?> form = new Form<Void>("msgForm");
		form.add(new TextField<String>("msgInput", messageModel));
		add(form);
	}
	
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
