package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateTest {
	public static void main(String[] args) throws ParseException{		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// ʹ��format()����������ת��Ϊָ����ʽ���ı�
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		// ����Date���󣬱�ʾ��ǰʱ��      
		Date time= new Date();
		// ����format()������������ת��Ϊ�ַ��������
		System.out.println(sdf1.format(time));
		System.out.println(sdf2.format(time));
		System.out.println(sdf3.format(time));
		// ʹ��parse()�������ı�ת��Ϊ����
		String d="2019-08-12 15:29:53";
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// ����parse()���������ַ���ת��Ϊ����
		Date date =sdf.parse(d);  
		System.out.println(date);			
	}
}
