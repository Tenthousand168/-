package com.test;
public class changeType {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		//创建Integer对象，表示指定的int值、String参数指示的int值
		Integer x=new Integer(6);
		Integer y=new Integer("666");
		//将Integer包装类转换为double、float、int
		double m =y.doubleValue();//手动拆箱
		//自动拆箱 ---double m=y;
		float n=x.floatValue();
		int z=x.intValue();
		System.out.println("n="+n+"m="+m+"z="+z);
		//手动装箱
//		Integer m=new Integer(i);
		//自动装箱
//		double m=y;
	}

}
