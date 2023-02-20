#include <stdio.h>

int main()
{
	char str[101];
	int cnt = 0;
	int i = -1;

	scanf("%s", str);
	while (str[++i])
	{
		if (str[i] == '=')
		{
			if (str[i - 1] && str[i - 2] && str[i - 1] == 'z' && str[i - 2] == 'd')
			{
				cnt -= 2;
			}
			else if (str[i - 1] && (str[i - 1] == 'c' || str[i - 1] == 's' || str[i - 1] == 'z'))
				cnt--;

		}
		else if (str[i] == '-')
		{
			if (str[i - 1] && (str[i - 1] == 'c' || str[i - 1] == 'd'))
				cnt--;
		}
		else if (str[i] == 'j')
		{
			if (str[i - 1] && (str[i - 1] == 'l' || str[i - 1] == 'n'))
				cnt--;
		}
		cnt++;
	}
	printf("%d", cnt);
}
