/**
 * 
 */
package io.homekeeper.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author JC
 *
 */
@Entity
public class Person 
{
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	protected Person() {}
	
	public Person(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}
