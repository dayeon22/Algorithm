#include <stdio.h>

int main()
{
	int input, i, j;

	scanf("%d", &input);
	i = input - 1;
	j = 2;
	
	while (1)
	{
		if (j <= i)
		{
			if ((input % j) == 0)
			{
				printf("소수아님");
				break;
			}
			else
				j++;
		}
		else
		{
			printf("소수");
			break;
		}
	}
}
