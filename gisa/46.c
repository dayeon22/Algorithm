#include <stdio.h>

int main()
{
	int arr[5][5];
	int cnt = 1;
	int k = 5;
	int i = 0, j = -1;
	int add = 1;

	while (k > 0)
	{
		for (int num = 0; num < k; num++)
		{
			j += add;
			arr[i][j] = cnt++;
		}
		k--;
		for (int num = 0; num < k; num++)
		{
			i += add;
			arr[i][j] = cnt++;
		}
		add = add * -1;
	}

	for (int i = 0; i < 5; i++)
	{
		for (int j = 0; j < 5; j++)
			printf("%3d", arr[i][j]);
		printf("\n");
	}
}
