package com.jlc.prog49;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class AccoliteQonCollection {

	public static void main(String[] args) {

		Employee e1=new Employee(1, "Ram");
		Employee e2=new Employee(2, "Shyam");
		Employee e3=new Employee(3, "Mohan");
		Employee e4=new Employee(1, "Ram");
		Employee e5=new Employee(1, "Ram");

		ArrayList<Employee> al=new ArrayList<>();
		al.add(e1); al.add(e2); al.add(e3); al.add(e4); al.add(e5);
		
		Map<String, Integer> result=sortEmployee(al);
		Set<Entry<String, Integer>> set=result.entrySet();
		for (Entry<String, Integer> entry : set) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

	public static Map<String,Integer> sortEmployee(ArrayList<Employee> al){
		Map<String, Integer> map=new TreeMap<>();
		Employee[] emp=new Employee[al.size()];
		for (int i = 0; i < al.size(); i++) {
			emp[i]=al.get(i);
		}
		for(int i = 0; i < al.size(); i++) {
			if(!map.containsKey(emp[i].name)) {
				map.put(emp[i].name,1);
			}else
				map.put(emp[i].name,map.get(emp[i].name)+1);
		}
		return map;
	}
}
class Employee{
	int eid;
	String name;

	public Employee(int eid, String name) {
		this.eid = eid;
		this.name = name;
	}
}