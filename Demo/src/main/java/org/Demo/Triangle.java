package org.Demo;

import java.util.List;

public class Triangle {
	List<Integer> list;
	
	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public void Draw() {
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
