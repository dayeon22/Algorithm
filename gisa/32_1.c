#include <stdio.h>

//Bubble sort
int main()
{
	int arr[5] = {4, 5, 1, 2, 3};
	int temp;
	int flag;

	for (int i = 0; i < 4; i++)
	{
		flag = 0;
		for (int j = 0; j < 4 - i; j++)
		{
			if (arr[j] > arr[j + 1])
			{
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				flag = 1;
			}
		}
		if (flag == 0)
			break;
	}

	for (int i = 0; i < 5; i++)
		printf("%d ", arr[i]);
}
