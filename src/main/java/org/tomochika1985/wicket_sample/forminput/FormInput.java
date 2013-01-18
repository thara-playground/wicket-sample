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
package org.tomochika1985.wicket_sample.forminput;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.validation.validator.RangeValidator;
import org.tomochika1985.wicket_sample.common.pages.BaseWebPage;

/**
 * @author t_hara
 *
 */
public class FormInput extends BaseWebPage {

	private static final long serialVersionUID = 1L;

	public FormInput() {
		super();
		FeedbackPanel feedback = new FeedbackPanel("feedback");
		add(feedback);
		add(new InputForm("inputForm"));
	}
	
	private class InputForm extends Form<FormInputModel> {

		private static final long serialVersionUID = 1L;

		/**
		 * @param id
		 */
		public InputForm(String id) {
			super(id, new CompoundPropertyModel<FormInputModel>(new FormInputModel()));
			
			add(new TextField<String>("stringProperty").setRequired(true).setLabel(
					new Model<String>("String")));
			add(new TextField<Integer>("integerProperty", Integer.class).setRequired(true).add(
					new RangeValidator<Integer>(1, 999)));
			add(new TextField<Double>("doubleProperty", Double.class).setRequired(true));
			
//			add(new TextField<Integer>("integerInRangeProperty").setRequired(true));
			add(new CheckBox("booleanProperty"));
			
			add(new LinesListView("lines"));
			
			add(new Multiply("multiply"));
			
			Label multiplyLabel = new Label("multiplyLabel", new PropertyModel<Integer>(getDefaultModel(), "multiply"));
			multiplyLabel.add(new BeforeAndAfterBorder());
			add(multiplyLabel);
			
		}
		
		@Override
		protected void onSubmit() {
			// Form validation successful. Display message showing edited model.
			info("Saved Model" + getDefaultModelObject());
		}
	}
	
	private static class LinesListView extends ListView<String> {

		private static final long serialVersionUID = 280801867376413594L;

		/**
		 * @param id
		 */
		public LinesListView(String id) {
			super(id);
		}
		
		@Override
		protected void populateItem(ListItem<String> item) {
			item.add(new TextField<String>("lineEdit", new PropertyModel<String>(item.getDefaultModel(), "text")));
		}
	}
}
