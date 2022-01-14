#include <stdio.h>
#include <stdlib.h>

int main()
{
	int **arr;
	int input;
	int cnt = 1;

	scanf("%d", &input);
	int max = input;
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
		for (int j = 0; j < max; j++)
 			arr[i][j] = cnt++;

		if (i < input / 2)
			max--;
		else
			max++;
	}

	for (int i = 0; i < input; i++)
	{
		for (int j = 0; j < input; j++)
			printf("%3d", arr[i][j]);
		printf("\n");
	}
}
