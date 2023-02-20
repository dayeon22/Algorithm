#include <stdio.h>

int main()
{
	int a, b;
	int i = 0, cnt = 1, x;

	scanf("%d", &x);
	while (1)
	{
		i++;
		a = 1;
		b = i;
		while (b >= 1)
		{
			if (cnt == x)
			{
				if (i % 2 == 0)
					printf("%d/%d", a, b);
				else
					printf("%d/%d", b, a);
				return 0;
			}
			a++;
			b--;
			cnt++;
		}
	}
}
