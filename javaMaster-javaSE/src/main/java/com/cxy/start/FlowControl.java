package com.cxy.start;

import java.util.ArrayList;
import java.util.List;

public class FlowControl {
	public static void main(String[] args) {
		FlowControl control=new FlowControl();
		//foreach demo
		control.foreachDemo();
		
		//lable demo
		control.lableDemo();
	}
	
	private void lableDemo() {
		outer:
		for (int i = 0; i < 10; i++) {
			System.out.println("outer loop:"+i);
			inner:
			for (int j = 0; j < 10; j++) {
				System.out.println("inner loop:"+j);
				if(i==5){
					break outer;
				}
				if(j==6){
					continue outer;
				}
			}
		}
		System.out.println("out loop");
	}

	private void foreachDemo(){
		List<String> tempList=new ArrayList<String>();
		tempList.add("1");
		tempList.add("1");
		tempList.add("1");
		tempList.add("1");
		
		for (String str : tempList) {
			System.out.println(str);
		}
	}
}
