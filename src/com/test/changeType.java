package com.test;
public class changeType {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		//����Integer���󣬱�ʾָ����intֵ��String����ָʾ��intֵ
		Integer x=new Integer(6);
		Integer y=new Integer("666");
		//��Integer��װ��ת��Ϊdouble��float��int
		double m =y.doubleValue();//�ֶ�����
		//�Զ����� ---double m=y;
		float n=x.floatValue();
		int z=x.intValue();
		System.out.println("n="+n+"m="+m+"z="+z);
		//�ֶ�װ��
//		Integer m=new Integer(i);
		//�Զ�װ��
//		double m=y;
	}

}
