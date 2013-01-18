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

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.IClusterable;

/**
 * @author t_hara
 *
 */
public class FormInputModel implements IClusterable {

	private static final long serialVersionUID = 7790959388706206493L;

	public final class Line implements IClusterable {
		private static final long serialVersionUID = 7748021675240750121L;
		
		private String text;

		/**
		 * @param text
		 */
		public Line(String text) {
			super();
			this.text = text;
		}
		
		/**
		 * @return the text
		 */
		public String getText() {
			return text;
		}
		
		/**
		 * @param text the text to set
		 */
		public void setText(String text) {
			this.text = text;
		}
		
		@Override
		public String toString() {
			return text;
		}
	}
	
	private String stringProperty = "test";
	private Boolean booleanProperty;
	private Double doubleProperty = 20.5;
	private Integer integerInRangeProperty = 50;
	private Integer integerProperty = 100;
	private List<Line> lines = new ArrayList<Line>();
	private Integer multiply = 0;
    
    /**
	 * 
	 */
	public FormInputModel() {
		super();
		
        lines.add(new Line("line one"));
        lines.add(new Line("line two"));
        lines.add(new Line("line three"));
	}
	
	/**
	 * @return the stringProperty
	 */
	public String getStringProperty() {
		return stringProperty;
	}
	
	/**
	 * @param stringProperty the stringProperty to set
	 */
	public void setStringProperty(String stringProperty) {
		this.stringProperty = stringProperty;
	}

	/**
	 * @return the booleanProperty
	 */
	public Boolean getBooleanProperty() {
		return booleanProperty;
	}

	/**
	 * @param booleanProperty the booleanProperty to set
	 */
	public void setBooleanProperty(Boolean booleanProperty) {
		this.booleanProperty = booleanProperty;
	}

	/**
	 * @return the doubleProperty
	 */
	public Double getDoubleProperty() {
		return doubleProperty;
	}

	/**
	 * @param doubleProperty the doubleProperty to set
	 */
	public void setDoubleProperty(Double doubleProperty) {
		this.doubleProperty = doubleProperty;
	}

	/**
	 * @return the integerInRangeProperty
	 */
	public Integer getIntegerInRangeProperty() {
		return integerInRangeProperty;
	}

	/**
	 * @param integerInRangeProperty the integerInRangeProperty to set
	 */
	public void setIntegerInRangeProperty(Integer integerInRangeProperty) {
		this.integerInRangeProperty = integerInRangeProperty;
	}

	/**
	 * @return the integerProperty
	 */
	public Integer getIntegerProperty() {
		return integerProperty;
	}

	/**
	 * @param integerProperty the integerProperty to set
	 */
	public void setIntegerProperty(Integer integerProperty) {
		this.integerProperty = integerProperty;
	}

	/**
	 * @return the lines
	 */
	public List<Line> getLines() {
		return lines;
	}

	/**
	 * @param lines the lines to set
	 */
	public void setLines(List<Line> lines) {
		this.lines = lines;
	}

	/**
	 * @return the multiply
	 */
	public Integer getMultiply() {
		return multiply;
	}

	/**
	 * @param multiply the multiply to set
	 */
	public void setMultiply(Integer multiply) {
		this.multiply = multiply;
	}
}
