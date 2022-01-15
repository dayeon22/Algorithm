#include <stdio.h>

int main()
{
	char num1[4];
	char num2[4];
	int i = 3;
	int big = 0;

	scanf("%s", num1);
	scanf("%s", num2);
	while (--i >= 0)
	{
		if (num1[i] > num2[i])
		{
			big = 1;
			break ;
		}
		else if (num1[i] < num2[i])
		{
			big = 2;
			break ;
		}
	}

	i = 3;
	if (big == 1)
	{
		while (--i >= 0)
			printf("%c", num1[i]);
	}
	else
	{
		while (--i >= 0)
			printf("%c", num2[i]);
	}
}
