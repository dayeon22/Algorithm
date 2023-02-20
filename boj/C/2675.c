#include <stdio.h>

int main()
{
	int tc;
	char str[20];
	int i, j, k;
	int re;

	scanf("%d", &tc);
	for (i = 0; i < tc; i++)
	{
		scanf("%d %s", &re, str);
		j = 0;
		while (str[j])
		{
			for (k = 0; k < re; k++)
				printf("%c", str[j]);
			j++;
		}
		printf("\n");
	}
}
