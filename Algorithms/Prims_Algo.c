#include<stdio.h>
void main()
{
    int a,b,u,v,n,i,j,ne=1;
    int vis[10]={0},min,mincost=0,cost[10][10];
	printf("Enter the number of nodes:");
	scanf("%d",&n);
	printf("\nEnter the adjacency matrix:\n");
	for(i=1;i<=n;i++)
	for(j=1;j<=n;j++)
	{
        scanf("%d",&cost[i][j]);
		if(cost[i][j]==0)
			cost[i][j]=999;
	}
	vis[1]=1;
	printf("\n");
	while(ne < n)
	{
		for(i=1,min=999;i<=n;i++)
		for(j=1;j<=n;j++)
		if(cost[i][j]< min)
		if(vis[i]!=0)
		{
 			min=cost[i][j];
			a=u=i;
			b=v=j;
		}
		if(vis[u]==0 || vis[v]==0)
		{
			printf("\n Edge %d:(%d %d) cost:%d",ne++,a,b,min);
			mincost+=min;
			vis[b]=1;
		}
		cost[a][b]=cost[b][a]=999;
	}
	printf("\n Minimun cost is=%d",mincost);
}
