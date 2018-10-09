/**
 * 
 */
package org.drools.tutorial.model;

import java.util.Date;

/**
 * @author a2g
 *
 */
public class Person {
	private Long id;
	private Long points;
	private Date registrationDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPoints() {
		return points;
	}

	public void setPoints(Long points) {
		this.points = points;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

}
