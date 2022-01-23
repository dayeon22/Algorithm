#include <stdio.h>
#include <stdlib.h>

int count_people(int k, int n)
{
	int i, j;
	int *arr;

	arr = (int *)malloc(sizeof(int) * n);
	for (i = 0; i < n; i++)
		arr[i] = i + 1;
	for (i = 1; i < k + 1; i++)
	{
		for (j = 1; j < n; j++)
		{
			arr[j] = arr[j - 1] + arr[j];
		}
	}
	return arr[j - 1];
}

int main()
{
	int tc, i, k, n;

	scanf("%d", &tc);
	for (i = 0; i < tc; i++)
	{
		scanf("%d", &k);
		scanf("%d", &n);
		printf("%d\n", count_people(k, n));
	}
}
