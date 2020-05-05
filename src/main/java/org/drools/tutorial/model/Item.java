/**
 * 
 */
package org.drools.tutorial.model;

import java.math.BigDecimal;

/**
 * @author a2g
 *
 */
public class Item {

	private BigDecimal price;
	private Long amount;
	private Item.Type type;
	
	public enum Type {
		TECHNOLOGY, CLOTHES, HOME, MEATS
	}

	public Item(BigDecimal price, Long amount, Type type) {
		super();
		this.price = price;
		this.amount = amount;
		this.type = type;
	}

	public Item.Type getType() {
		return type;
	}

	public void setType(Item.Type type) {
		this.type = type;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

}
