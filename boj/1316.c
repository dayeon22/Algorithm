#include <stdio.h>
#include <string.h>

int main()
{
	int n;
	int i, j, cnt = 0;
	int arr[27];
	char str[101];
	char c;

	scanf("%d", &n);
	for (i = 0; i < n; i++)
	{
		for (j = 0; j < 27; j++)
		{
			arr[j] = 0;
		}
		scanf("%s", str);
		j = 0;
		while (str[j])
		{
			c = str[j];
			if (arr[c - 'a'] == 1)
				break ;
			arr[c - 'a'] = 1;
			while (str[j] == c)
			{
				j++;
			}
		}
		if (j == (int)strlen(str))
			cnt++;
	}
	printf("%d", cnt);
}
