#include <stdio.h>

int main()
{
	int arr[5][5] = {0};
	int res[5][5] = {0};
	int cnt = 1;

	for (int i = 4; i >= 0; i--)
	{
		for (int j = i; j < 5; j++)
			arr[i][j] = cnt++;
	}

	for (int i = 0; i < 5; i++)
	{
		for (int j = 0; j < 5; j++)
			res[i][j] = arr[4 - j][i];
	}

	for (int i = 0; i < 5; i++)
	{
		for (int j = 0; j < 5; j++)
			printf("%3d", res[i][j]);
		printf("\n");
	}
}
