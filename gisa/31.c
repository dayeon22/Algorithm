#include <stdio.h>

//Selection sort
int main()
{
	int arr[5] = {8, 5, 6, 2, 4};
	int temp;

	for (int i = 0; i < 4; i++)
	{
		for (int j = i + 1; j < 5; j++)
		{
			if (arr[i] > arr[j])
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}

	for (int i = 0; i < 5; i++)
		printf("%d ", arr[i]);
}
