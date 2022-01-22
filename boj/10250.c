#include <stdio.h>

int main()
{
	int num, h, w, n, i;

	scanf("%d", &num);
	for (i = 0; i < num; i++)
	{
		scanf("%d %d %d", &h, &w, &n);
		printf("%d%.2d\n", (n - 1) % h + 1, (n - 1) / h + 1);
	}
}
