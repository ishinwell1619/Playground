#include<stdio.h>
 
int fact(int n)
{
	int i,fac=1;
	
	for(i=1;i<=n;++i){
		fac*=i;
	}
	
	return fac;
}
 
int main(){
	int n,t,sum,m;
	
	
	scanf("%d",&n);
	
	m=n;
	
	while(m!=0){
		t=m%10;
		sum+=fact(t);
		m=m/10;
	}
		
	if(sum==n){
		printf("Yes");
	}
	else{
		printf("No");
	}
	
	return 0;
}