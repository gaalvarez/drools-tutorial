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
	private Long miles;

	public Person(Long id, Long points, Date registrationDate) {
		super();
		this.id = id;
		this.points = points;
		this.registrationDate = registrationDate;
		this.miles = 0L;
	}

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

	public Long getMiles() {
		return miles;
	}

	public void setMiles(Long miles) {
		this.miles = miles;
	}

}
