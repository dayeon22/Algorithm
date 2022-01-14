#include <stdio.h>

//Bubble sort
int main()
{
	int arr[5] = {8, 5, 6, 2, 4};
	int temp;

	for (int i = 0; i < 4; i++)
	{
		for (int j = 0; j < 4 - i; j++)
		{
			if (arr[j] > arr[j + 1])
			{
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}

	for (int i = 0; i < 5; i++)
		printf("%d ", arr[i]);
}
