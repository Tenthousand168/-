package com.test;
public class mathTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个double变量
		double a=12.88;
		//将double类型强转为int 
		int b=(int) a;
		System.out.println(b);
		//调用round方法，进行四舍五入
		long c=Math.round(a);
		System.out.println(c);
		//调用floor方法，返回小于参数的最大整数
		double d =Math.floor(a);
		System.out.println(d);
		//调用ceil方法，返回大于参数的最小整数
		double e=Math.ceil(a);
		System.out.println(e);
		//调用random方法，返回【0-1】之间的随机浮点数
		double f=Math.random();
		System.out.println(f);
		//产生0-99之间的随机整数
		int g=(int)(Math.random()*99);
		System.out.println(g);
		//功能：定义一个包含 10 个元素的整型数组，通过随机产生 10 以内的随机数，给数组中的每个元素赋值，并输出结果。
		int shuzu[]=new int[10];
		//如何赋值？ 通过循环给数组赋值
		for(int i=0;i<shuzu.length;i++) {
			int x=(int)(Math.random()*10);
			shuzu[i]=x;
		}
		//使用foreach循环输出数组中的元素
//		for(int i:shuzu) {
//			System.out.print(i);
//		}
		//通过遍历数组循环输出
		for(int j=0;j<shuzu.length;j++) {
			System.out.print(shuzu[j]);
		}
	}

}
