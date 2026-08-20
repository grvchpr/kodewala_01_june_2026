package com.kodewala.entity;

import java.lang.Long;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author:GOURAV CHOPRA 
 *  Generated F/w:SHWR-Framework 
 */
@Entity
@Table(
		name = "employee_tab"
)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	@GeneratedValue
	@Column(
			name = "id"
	)
	private Long id;
}
