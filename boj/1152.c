#include <stdio.h>

int main()
{
	char str[1000000];
	int i = 0;
	int cnt = 0;

	scanf("%[^\n]", str);
	while (str[i])
		i++;
	while (str[--i] == ' ')
		str[i] = 0;
	i = 0;
	while (str[i] && str[i] == ' ')
		i++;
	while (str[i])
	{
		if (str[i] == ' ')
			cnt++;
		i++;
	}
	printf("%d", cnt + 1);
}
