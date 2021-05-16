//File: Number_Table.java
// model class, java representation of SQL table.
package com.glaucus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*This class is model class which is nothing but the class representation of a Table from the database.
 * 
 * @see #@Entity to identify the class as entity to the spring application.
 * @see #@Table denotes the call as a table with the name.
 * 
 * @author Sidharth Pradhan
*/
@Table(name = "Number_Table")
@Entity
public class Number_Table {

	@Id // for identify the field as primary Key.
	@Column(name = "ID") // for identify the fiels as column with name.
	private int id;
	
	@Column(name = "NUM_TO_INCREMENT")
	private long num_to_Increment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getNum_to_Increment() {
		return num_to_Increment;
	}

	public void setNum_to_Increment(long num_to_Increment) {
		this.num_to_Increment = num_to_Increment;
	}
}
