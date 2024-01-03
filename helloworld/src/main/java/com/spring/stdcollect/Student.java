package com.spring.stdcollect;
import java.util.*;
public class Student {
	private List<String>list;
	private Map<String,Integer>map;
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Map<String, Integer> getMap() {
		return map;
	}
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "Student [list=" + list + ", map=" + map + "]";
	}

	
	
}
