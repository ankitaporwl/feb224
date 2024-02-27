#include<stdio.h>
void display(int x[],int n){
	int i;
	for(i=0;i<n;i++){
		printf("%d\t",x[i]);
	}
	printf("\n");
}
void show(int x[],int n,int div){
	int i;
	int a[10]={0};
	int y[n];
	for(i=0;i<n;i++){
		a[x[i]/div%10]++;
	}
	for(i=1;i<10;i++){
		a[i]+=a[i-1];
	}
	for(i=n-1;i>=0;i--){
		y[a[x[i]/div%10]-=1]=x[i];
	}
	for(i=0;i<n;i++){
		x[i]=y[i];
	}
}
void rsort(int x[],int n){
	int i,min=x[0];
	for(i=1;i<n;i++){
		if(min>x[i])min=x[i];
	}
	for(i=0;i<n;i++){
		x[i]-=min;
		
	}
	
	int max=x[0];
	for(i=1;i<n;i++){
		if(max<x[i])max=x[i];
	}
	printf("%d\n",max);
	for(i=1;i<=max;i*=10){
		show(x,n,i);
		
	}
	for(i=0;i<n;i++){
		x[i]+=min;
	}
}
void main(){
	int x[]={-400,-45,-34,2,-447,14000,3567};
	int n=7;
	rsort(x,n);
	display(x,n);
}