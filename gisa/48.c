#include <stdio.h>

int main()
{
	int arr[5][5];
	int cnt = 1;
	int i = 0;
	int j = 2;

	while (cnt <= 25)
	{
		arr[i][j] = cnt++;
		if (cnt != 1 && cnt % 5 == 1)
			i++;
		else
		{
			i--;
			j++;
			if (i < 0)
				i = 4;
			if (j > 4)
				j = 0;
		}
	}

	for (int i = 0; i < 5; i++)
	{
		for (int j = 0; j < 5; j++)
			printf("%3d", arr[i][j]);
		printf("\n");
	}
}
