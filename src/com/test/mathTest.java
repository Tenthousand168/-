package com.test;
public class mathTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��double����
		double a=12.88;
		//��double����ǿתΪint 
		int b=(int) a;
		System.out.println(b);
		//����round������������������
		long c=Math.round(a);
		System.out.println(c);
		//����floor����������С�ڲ������������
		double d =Math.floor(a);
		System.out.println(d);
		//����ceil���������ش��ڲ�������С����
		double e=Math.ceil(a);
		System.out.println(e);
		//����random���������ء�0-1��֮������������
		double f=Math.random();
		System.out.println(f);
		//����0-99֮����������
		int g=(int)(Math.random()*99);
		System.out.println(g);
		//���ܣ�����һ������ 10 ��Ԫ�ص��������飬ͨ��������� 10 ���ڵ���������������е�ÿ��Ԫ�ظ�ֵ������������
		int shuzu[]=new int[10];
		//��θ�ֵ�� ͨ��ѭ�������鸳ֵ
		for(int i=0;i<shuzu.length;i++) {
			int x=(int)(Math.random()*10);
			shuzu[i]=x;
		}
		//ʹ��foreachѭ����������е�Ԫ��
//		for(int i:shuzu) {
//			System.out.print(i);
//		}
		//ͨ����������ѭ�����
		for(int j=0;j<shuzu.length;j++) {
			System.out.print(shuzu[j]);
		}
	}

}
