#include <stdio.h>

int main()
{
	int arr[5][5];
	int cnt = 1;
	int j;

	for (int k = 0; k < 9; k++)
	{
		for (int i = 0; i < 5; i++)
		{
			j = k - i;
			if (j < 0)
				continue;
			if (j > 4)
				continue;
			arr[i][j] = cnt++;
		}
	}

	for (int i = 0; i < 5; i++)
	{
		for (int j = 0; j < 5; j++)
			printf("%3d", arr[i][j]);
		printf("\n");
	}
}
