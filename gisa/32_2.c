#include <stdio.h>

int main()
{
	int arr[5] = {5, 4, 3, 2, 1};
	int temp;
	int right = 4;
	int left = 0;

	for (int i = 0; i < 5 / 2; i++)
	{
		for (int j = left; j < right; j++)
		{
			if (arr[j] > arr[j + 1])
			{
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
		right = right - 1;
		for (int j = right; j > left; j--)
		{
			if (arr[j] < arr[j - 1])
			{
				temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
		left = left + 1;
	}

	for (int i = 0; i < 5; i++)
		printf("%d ", arr[i]);
}
