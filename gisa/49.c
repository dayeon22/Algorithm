#include <stdio.h>
#include <stdlib.h>

int main()
{
	int **arr;
	int **res;
	int row, col;
	int cnt = 1;
	int i, j;
	int k = 0, l = 0;

	scanf("%d %d", &row, &col);
	arr = (int **)malloc(sizeof(int *) * row);
	for (i = 0; i < row; i++)
		arr[i] = (int *)malloc(sizeof(int) * col);
	for (i = 0; i < row; i++)
	{
		for (int j = 0; j < col; j++)
			arr[i][j] = cnt++;
	}
	res = (int **)malloc(sizeof(int *) * col);
	for (i = 0; i < col; i++)
		res[i] = (int *)malloc(sizeof(int) * row);
	
	for (i = 0; i < row; i++)
	{
		for (j = 0; j < col; j++)
		{
			res[k][l] = arr[i][j];
			l++;
			if (l >= row)
			{
				l = 0;
				k++;
			}
		}
	}

	for (k = 0; k < col; k++)
	{
		for (l = 0; l < row; l++)
			printf("%3d", res[k][l]);
		printf("\n");
	}
}
