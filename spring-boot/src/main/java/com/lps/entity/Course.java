package com.lps.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="COURSE")
public class Course extends BaseEntity{

	/**
	 * 任课老师
	 */
	@ManyToOne
	@JoinColumn(name="teacherId")
	private User teacher;
	
	/**
	 * 课程名称
	 */
	@Column(name="courseName")
	private String courseName;

	/* get,set方法*/
	public User getTeacher() {
		return teacher;
	}
	

	public void setTeacher(User teacher) {
		this.teacher = teacher;
	}
	

	public String getCourseName() {
		return courseName;
	}
	

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
