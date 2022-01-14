#include <stdio.h>

int main()
{
	int arr[5][5];
	int cnt = 1;
	
	for (int i = 0; i < 5; i++)
	{
		for (int j = 0; j < 5; j++)
			arr[i][j] = cnt++;
	}

	for (int i = 0; i < 5; i++)
	{
		for (int j = 0; j < 5; j++)
			printf("%3d", arr[i][j]);
		printf("\n");
	}
}
