//C program to implement merge sort.

#include <stdio.h>

void mergeSort(int [], int, int, int);// declaring merge sort

void partition(int [],int, int);//declaring the partition

int main()
{
    int list[50];
    int i, size;

    printf("Enter the array size:");
    scanf("%d", &size);
    printf("Enter the array elements:\n");
    for(i = 0; i < size; i++)
    {
         scanf("%d", &list[i]);
    }
    partition(list, 0, size - 1);// calling the partition

    printf("After merge sort:\n");
    //printing the list.
    for(i = 0;i < size; i++)
    {
         printf("%d   ",list[i]);
    }

   return 0;
}//end of main

 // Partitioning the list from middle every time

void partition(int list[],int low,int high)
{
    int mid;

    if(low < high)
    {
        mid = (low + high) / 2;
        partition(list, low, mid);
        partition(list, mid + 1, high);// adding 1 cell to the mid value
        mergeSort(list, low, mid, high);
    }
}// end of paritioning

// performing merge sort

void mergeSort(int list[],int low,int mid,int high)
{
    int i, mi, k, lo, temp[50];

    lo = low;
    i = low;
    mi = mid + 1;
    while ((lo <= mid) && (mi <= high))
    {
        if (list[lo] <= list[mi])
        {
            temp[i] = list[lo];
            lo++;
        }
        else
        {
            temp[i] = list[mi];
            mi++;
        }
        i++;
    }// end while of lo and hi

    if (lo > mid)
    {
        for (k = mi; k <= high; k++)
        {
            temp[i] = list[k];
            i++;
        }
    }// end of comparison bet lo & mid

    else
    {// Final else statement
        for (k = lo; k <= mid; k++)
        {
             temp[i] = list[k];
             i++;
        }
    }

    for (k = low; k <= high; k++)
    {
        list[k] = temp[k];
    }// storing the larger value in k
}// end merge sort
