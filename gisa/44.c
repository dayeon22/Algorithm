#include <stdio.h>
#include <stdlib.h>

int main()
{
	int **arr;
	int input;
	int cnt = 1;

	scanf("%d", &input);
	arr = (int **)malloc(sizeof(int *) * (input * 2 - 1));
	for (int i = 0; i < input * 2 - 1; i++)
		arr[i] = (int *)malloc(sizeof(int) * input);
	for (int i = 0; i < input * 2 - 1; i++)
	{
		for (int j = 0; j < input; j++)
			arr[i][j] = 0;
	}

	for (int j = 0; j < input; j++)
	{
		for (int i = input - 1 - j; i <= input - 1 + j; i++)
			arr[i][j] = cnt++;
	}

	for (int i = 0; i < input * 2 - 1; i++)
	{
		for (int j = 0; j < input; j++)
			printf("%3d", arr[i][j]);
		printf("\n");
	}
}
