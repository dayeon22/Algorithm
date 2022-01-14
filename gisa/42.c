#include <stdio.h>
#include <stdlib.h>

int main()
{
	int **arr;
	int cnt = 1;
	int s = 0;
	int e;
	int input;

	scanf("%d", &input);
	e = input - 1;
	arr = (int **)malloc(sizeof(int *) * input);
	for (int i = 0; i < input; i++)
		arr[i] = (int *)malloc(sizeof(int) * input);
	for (int i = 0; i < input; i++)
	{
		for (int j = 0; j < input; j++)
			arr[i][j] = 0;
	}

	for (int i = 0; i < input; i++)
	{
		for (int j = s; j <= e; j++)
			arr[i][j] = cnt++;
		if (i < input / 2)
		{
			s++;
			e--;
		}
		else
		{
			s--;
			e++;
		}
	}

	for (int i = 0; i < input; i++)
	{
		for (int j = 0; j < input; j++)
			printf("%3d", arr[i][j]);
		printf("\n");
	}
}
