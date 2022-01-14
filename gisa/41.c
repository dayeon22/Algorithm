#include <stdio.h>

int main()
{
	int arr[5][5] = {0};
	int cnt = 1;
	int s = 2;
	int e = 2;
	int sign = 1;

	for (int i = 0; i < 5; i++)
	{
		for (int j = s; j <= e; j++)
			arr[i][j] = cnt++;
		if (s == 0)
			sign = sign * -1;
		s = s - sign;
		e = e + sign;
	}

	for (int i = 0; i < 5; i++)
	{
		for (int j = 0; j < 5; j++)
			printf("%3d", arr[i][j]);
		printf("\n");
	}
}
