//Implement graph coloring for the given graph. Let maximum color be 3.

#include <stdbool.h>
#include <stdio.h>
 
// Number of vertices in the graph
#define V 4
 
void printSolution(int color[]);
 
// check if the colored graph is safe or not
bool isSafe(bool graph[V][V], int color[])
{
    // check for every edge
    for (int i = 0; i < V; i++)
        for (int j = i + 1; j < V; j++)
            if (graph[i][j] && color[j] == color[i])
                return false;
    return true;
}
 
/*It returns false if the m colours cannot be assigned, otherwise, return true.There may be more than
  one solutions, this function prints one of the feasible solutions.*/
bool graphColoring(bool graph[V][V], int m, int i, int color[V])
{
    // if current index reached end
    if (i == V) {
        // if coloring is safe
        if (isSafe(graph, color)) {
            // Print the solution
            printSolution(color);
            return true;
        }
        return false;
    }
 
    // Assign each color from 1 to m
    for (int j = 1; j <= m; j++) {
        color[i] = j;
 
        // Recur of the rest vertices
        if (graphColoring(graph, m, i + 1, color))
            return true;
 
        color[i] = 0;
    }
 
    return false;
}
 
/* A utility function to print solution */
void printSolution(int color[])
{
    printf("\nSolution Exists: "
           "\nFollowing are the assigned colors \n");
    for (int i = 0; i < V; i++)
        printf("%d  ", color[i]);
    printf("\n");
}
 
// Driver program to test above function
int main()
{
    //adjacency matrix of the graph
    bool graph[V][V] = {
        { 0, 1, 1, 1 },
        { 1, 0, 1, 0 },
        { 1, 1, 0, 1 },
        { 1, 0, 1, 0 },
    };
    int m = 3; // Number of colors
 
    // Initialize all color values as 0.
    int color[V];
    for (int i = 0; i < V; i++)
        color[i] = 0;
 
    if (!graphColoring(graph, m, 0, color))
        printf("Solution does not exist");
 
    return 0;
}