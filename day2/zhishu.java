package com.lizuyao.demo;

public class zhishu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=3,j,num=0;
		for(;i<=100;i++){
		for(j=2;j<i;j++){
		if(i%j==0){
		break;
		}if(j+1==i)
		{num++;}
		}
		}
		num=num+1;
		System.out.println("质数的个数"+num);
	}

}
