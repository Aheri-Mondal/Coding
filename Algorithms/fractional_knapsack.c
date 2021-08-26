//Fractional Knapsack Problem

# include<stdio.h>

void knapsack(int n, float weight[], float profit[], float capacity)
{
   float x[20] , tp = 0; // tp holds the total profit valur or the maximum profit value
   int i, j, u; // u is the total capacity
   u = capacity; // knapsack capacity

   for (i = 0; i < n; i++)
      x[i] = 0.0;
   for (i = 0; i < n; i++)
   {
      if (weight[i] > u)
        break;

      else
      {
         x[i] = 1.0;
         tp = tp + profit[i];
         u = u - weight[i]; // remaining capacity by substracting the weight
      }
   }
 // Calculating the fraction
   if (i < n)
      x[i] = u / weight[i];

   tp = tp + (x[i] * profit[i]); // Calculating the maximum profit

   printf("\nThe vector is:- \n");
      for (i = 0; i < n; i++)
      printf("%f\t", x[i]); // result vector

   printf("\nMaximum profit is:- %f\n", tp);

}

int main()
{
   float weight[20], profit[20], capacity;
   int num, i, j;
   float ratio[20], temp;

   printf("\nEnter the no. of objects:- ");
   scanf("%d", &num);

   printf("\nEnter the weights and profits of each object:- \n");
   for (i = 0; i < num; i++) // entering the elements into the knapsack
   {
      scanf("%f %f", &weight[i], &profit[i]);
   }

   printf("\nEnter the capacity of the knapsack:- ");
   scanf("%f", &capacity);

   for (i = 0; i < num; i++)
   {
      ratio[i] = profit[i] / weight[i];
   }
  // Swapping the 3 elements using 1 tempory variable temp.
   for (i = 0; i < num; i++)
   {
      for (j = i + 1; j < num; j++)
      {
         if (ratio[i] < ratio[j])
         {
            temp = ratio[j];
            ratio[j] = ratio[i];
            ratio[i] = temp;

            temp = weight[j];
            weight[j] = weight[i];
            weight[i] = temp;

            temp = profit[j];
            profit[j] = profit[i];
            profit[i] = temp;
         }
      }
   }
   knapsack(num, weight, profit, capacity);
   return(0);
}
