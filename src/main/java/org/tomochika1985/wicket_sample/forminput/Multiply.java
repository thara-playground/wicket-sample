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

import org.apache.wicket.markup.html.form.FormComponentPanel;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.PropertyModel;

/**
 * @author t_hara
 *
 */
public class Multiply extends FormComponentPanel<Integer> {

	private static final long serialVersionUID = -8684243004607556392L;

	private TextField<Integer> left;
	
	private int lhs = 0;
	
	private int rhs = 0;
	
	private TextField<Integer> right;

	/**
	 * @param id
	 */
	public Multiply(String id) {
		super(id);
		init();
	}

	/**
	 * @param id
	 * @param model
	 */
	public Multiply(String id, IModel<Integer> model) {
		super(id, model);
		init();
	}
	
	void init() {
		add(left = new TextField<Integer>("left", new PropertyModel<Integer>(this, "lhs")));
		add(right = new TextField<Integer>("right", new PropertyModel<Integer>(this, "rhs")));
		
		left.setRequired(true);
		right.setRequired(true);
	}

	/**
	 * @return the left
	 */
	public TextField<Integer> getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(TextField<Integer> left) {
		this.left = left;
	}

	/**
	 * @return the lhs
	 */
	public int getLhs() {
		return lhs;
	}

	/**
	 * @param lhs the lhs to set
	 */
	public void setLhs(int lhs) {
		this.lhs = lhs;
	}

	/**
	 * @return the rhs
	 */
	public int getRhs() {
		return rhs;
	}

	/**
	 * @param rhs the rhs to set
	 */
	public void setRhs(int rhs) {
		this.rhs = rhs;
	}

	/**
	 * @return the right
	 */
	public TextField<Integer> getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(TextField<Integer> right) {
		this.right = right;
	}
	
	
}
