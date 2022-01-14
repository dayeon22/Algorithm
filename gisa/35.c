#include <stdio.h>

int main()
{
	int data[10] = {8, 15, 35, 55, 60, 61, 70, 80, 92, 99};
	int find = 53;
	int s = 0;
	int e = 9;
	int m;

	while (1)
	{
		m = (s + e) / 2;
		if (data[m] == find)
		{
			printf("%d", m);
			break;
		}
		else if (data[m] > find)
			e = m - 1;
		else if (data[m] < find)
			s = m + 1;
		if (s > e)
		{
			printf("NOT FOUND");
			break;
		}
	}
}
