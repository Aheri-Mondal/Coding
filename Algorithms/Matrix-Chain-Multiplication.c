#include <stdio.h>
int Matrix_Chain(int p[], int n)
{
    int j, q;
    int min[n][n];
    for (int i = 1; i <n; i++)
      min[i][i] = 0;
    for (int L = 2; L < n; L++) 
    {
      for (int i = 1; i < n - L + 1; i++) 
      {
         j = i + L - 1;
         min[i][j] = 999;
        for (int k = i; k <= j - 1; k++) {
            q = min[i][k] + min[k + 1][j] + p[i - 1] * p[k] * p[j];
            if (q < min[i][j])
            {
                min[i][j] = q;
            }            
         }
      }
   }
    return min[1][n - 1];
}

int main()
{
    int n, i, res=0;
    printf("Enter the no. of matrices:\n");
    scanf("%d", &n);
    n++;
    int p[n];
    printf("Enter the dimensions:\n");
    for(i=0; i<n; i++)
    {
        scanf("%d", &p[i]);
    }
    res = Matrix_Chain(p, n);
    printf("Minimum number of multiplications required = %d" , res);

    return 0;
}