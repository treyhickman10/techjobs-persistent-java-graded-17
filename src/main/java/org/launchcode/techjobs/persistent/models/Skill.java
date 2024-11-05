package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

	@ManyToMany(mappedBy = "skills")
	private List<Job> jobs = new ArrayList<>();

	@Size(max = 255, message = "Description is too long")
	private String description;

	public Skill () {}

	public @Size(max = 255) String getDescription() {
		return description;
	}

	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	public void setDescription(@Size(max = 255) String description) {
		this.description = description;
	}
}
