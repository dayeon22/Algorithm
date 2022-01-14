#include <stdio.h>

int main()
{
	int a[10] = {1, 3, 5, 6, 0};
	int b[10] = {2, 3, 5, 8, 9, 10, 12, 13, 0};
	int c[20] = {0};
	int aidx = 0;
	int bidx = 0;
	int cidx = 0;

	while (a[aidx] != 0 || b[bidx] != 0)
	{
		if (a[aidx] == 0)
			c[cidx++] = b[bidx++];
		else if (b[bidx] == 0)
			c[cidx++] = a[aidx++];
		else if (a[aidx] < b[bidx])
			c[cidx++] = a[aidx++];
		else if (a[aidx] > b[bidx])
			c[cidx++] = b[bidx++];
		else
		{
			c[cidx++] = a[aidx++];
			bidx++;
		}
	}
	c[cidx] = 0;

	for (int i = 0; i < 20; i++)
		printf("%d ", c[i]);
}
