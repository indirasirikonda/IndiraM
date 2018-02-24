package Domain;

import java.time.LocalDate;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Data
@AllArgsConstructor
public class Tasks {

	
	
	private  Long id;
	private String name;
	@JsonFormat(pattern = "mm/dd/yyyy")
	private LocalDate date;
	private Boolean completed;
	
	public Tasks( ) {
		
	}
	
	
	
}
