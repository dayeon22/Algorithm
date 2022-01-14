#include <stdio.h>

int main()
{
	int arr[5] = {8, 5, 6, 2, 4};
	int i, j, key;

	for (i = 1; i < 5; i++)
	{
		key = arr[i];
		for (j = i - 1; j >= 0; j--)
		{
			if (key < arr[j])
				arr[j + 1] = arr[j];
			else
				break;
		}
		arr[j + 1] = key;
	}

	for (i = 0; i < 5; i++)
		printf("%d ", arr[i]);
}
