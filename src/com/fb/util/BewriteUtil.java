package com.fb.util;

public class BewriteUtil {
	/**
	 * ����������С��ȡ���������Ļ���
	 * @param degree
	 * @return
	 */
	public  String goBewrite(int degree) {
		if (degree<10) {
			return "�����Ļ���";
		}if (degree>10&&degree<20) {
			return "�ӱ�ĵδ𻷾�";

		}if (degree>20&&degree<30) {
			return "��ͼ��ݻ���";
		}if (degree>30&&degree<40) {
			return "��԰���ʻ���";
		}if (degree>40&&degree<50) {
			return "���׵�С������";
		}if (degree>50&&degree<60) {
			return "�����Ľ������ۻ���";
		}if (degree>60&&degree<70) {
			return "��æ�Ľֵ���Ļ���";
		}if (degree>70&&degree<80) {
			return "�ֻ���������Ļ���";
		}
		if (degree>80&&degree<90) {
			return "ҡ�����ֵľۻ�������";
		}if (degree>90&&degree<100) {
			return "�̶�����������";
		}
		if (degree>100) {
			return "���޷����ܵĻ���";
		}
		return "���ڻ�ȡ����...";

	}
	public int getVip(Integer degree) {
		if (degree<10) {
			return 0;
		}if (degree>10&&degree<20) {
			return 1;

		}if (degree>20&&degree<30) {
			return 2;
		}if (degree>30&&degree<40) {
			return 3;
		}if (degree>40&&degree<50) {
			return 4;
		}if (degree>50&&degree<60) {
			return 5;
		}if (degree>60&&degree<70) {
			return 6;
		}if (degree>70&&degree<80) {
			return 7;
		}
		if (degree>80&&degree<90) {
			return 8;
		}if (degree>90&&degree<100) {
			return 9;
		}
		if (degree>100) {
			return 10;
		}
		return 0;
	}
}
