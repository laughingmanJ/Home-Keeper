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
public class User 
{
	@Id
	@GeneratedValue
	private Long id;
	
	private String username;
	
	private String name;
	
	protected User() {}
	
	public User(String name, String username)
	{
		this.name = name;
		this.username = username;
	}

}
