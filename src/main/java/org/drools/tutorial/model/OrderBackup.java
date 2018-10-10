/**
 * 
 */
package org.drools.tutorial.model;

import java.math.BigDecimal;

/**
 * @author a2g
 *
 */
public class OrderBackup {

	public OrderBackup(BigDecimal value) {
		super();
		this.value = value;
	}

	private BigDecimal value;

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
}
