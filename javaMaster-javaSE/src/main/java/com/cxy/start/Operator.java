package com.cxy.start;

import static java.lang.System.out;

import java.util.Random;
/**
 * @author cxy
 * @version None
 * 关于操作符的操作
 * */
public class Operator {
	public static void main(String[] args) {
		//1，静态导入
		//使用 import static 静态类名。
		out.println("你好，我就是传说中的静态导入");
		
		//2，操作符
		//2.1 操作符的优先级,先乘除后加减.操作符最好使用括号。
		out.println(5*3/5+2-1);//结果应该等于4
		out.println(2-1+24/4*7);
		
		int x=1,y=2,z=3;
		int a=x+y-2/2+z;
		int b=(x+y)/(2+x);
		out.println(a+","+b);
		//计算速度
		new Operator().getSpeed(100.0, 11);
		
		Operator.getIcon();
		
		//直接常量
		int i1=0x2f;
		out.println("i1:"+Integer.toBinaryString(i1));
		int i2=0X2F;
		out.println("i2:"+Integer.toBinaryString(i2));
		int i3=0177;
		out.println("i3:"+Integer.toBinaryString(i3));
		char c=0xffff;
		out.println("c:"+Integer.toBinaryString(c));
		byte _b=0x7f;
		out.println("b:"+Integer.toBinaryString(_b));
		short s=0x7fff;
		out.println("s:"+Integer.toBinaryString(s));

		long n1=200L;
		long n2=200l;
		long n3=200;
		out.println(n1+","+n2+","+n3);
		
		float f1=1;
		float f2=1F;
		float f3=1f;
		out.println(f1+","+f2+","+f3);
		
		double d1=1d;
		double d2=1D;
		out.println(d1+","+d2);
		
		new Operator().getBiggestNum();
	}
	
	private void getSpeed(double distance,int times) {
		// TODO Auto-generated method stub
		System.out.println(distance/times);
	}
	
	public static void getIcon(){
		Random random=new Random();
		out.println(random.nextBoolean());
	}
	
	public static void getBiggestNum(){
		//获取float指数技术法所能表示的最大和最小数字
		float a=Float.MAX_VALUE;
		int n=0;
		while(a>0){
			n++;
			a=a/10;
		}
		out.println(n);
	}
}
