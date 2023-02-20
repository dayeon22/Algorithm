#include <stdio.h>

int main()
{
	int count;
	int max;
	int num;

	scanf("%d %d", &count, &max);
	for(int i = 0; i < count; i++)
	{
		scanf("%d", &num);
		if (num < max)
			printf("%d ", num);
	}
}
