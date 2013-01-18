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
package org.tomochika1985.wicket_sample.common.pages;

import jp.javelindev.wicket.markup.MarkupPath;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * @author t_hara
 */
public class BaseWebPage extends WebPage {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public BaseWebPage() {
		super();
	}

	/**
	 * @param model
	 */
	public BaseWebPage(IModel<?> model) {
		super(model);
	}

	/**
	 * @param parameters
	 */
	public BaseWebPage(PageParameters parameters) {
		super(parameters);
	}

	protected String getTitle() {
		return getString("pageName");
	}
}
