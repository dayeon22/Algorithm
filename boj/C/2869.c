#include <stdio.h>
#include <math.h>

int main()
{
	int a, b, v;

	scanf("%d %d %d", &a, &b, &v);
	printf("%.lf", ceil((double)(v - b) / (a - b)));
}
