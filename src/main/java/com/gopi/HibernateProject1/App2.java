package com.gopi.HibernateProject1;

import java.util.ArrayList;
import java.util.List;

import com.gopi.HibernateProject1.entity.College;
import com.gopi.HibernateProject1.entity.Dept;
import com.gopi.HibernateProject1.repository.CollegeRepository;

public class App2 {
	public static void main(String[] args) {
		
		College college = new College("SV Arts College", "517502");
		Dept dept1 = new Dept("Zoology", "Vani", college);
		Dept dept2 = new Dept("Chemisty", "Siva", college);
		Dept dept3 = new Dept("Botany", "Surekha", college);
		Dept dept4 = new Dept("Maths", "Sasi", college);
		Dept dept5 = new Dept("Stats", "Reddy", college);
		
		List<Dept> list=new ArrayList<>();
		list.add(dept1);
		list.add(dept2);
		list.add(dept3);
		list.add(dept4);
		list.add(dept5);
		
		college.setDepts(list);
		
		CollegeRepository repo = new CollegeRepository();
//		repo.saveCollege(college);
		
		College college2 = repo.getCollegeById(1);
		List<Dept> depts = college2.getDepts();
		for(Dept d:depts) System.out.println(d.getCollege());
	}
}
