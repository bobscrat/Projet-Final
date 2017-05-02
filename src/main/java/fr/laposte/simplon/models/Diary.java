package fr.laposte.simplon.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Diary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private Date startdate;
	
	private Date enddate;
	
	private String introduction;
	
	@ManyToOne
	private Promo promo;
	
	@OneToMany(mappedBy = "diary")
	private List<Question> questions;
	
	@OneToMany(mappedBy = "diary")
	private List<Conclusion> conclusions;

}