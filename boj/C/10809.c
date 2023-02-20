#include <stdio.h>

int main()
{
	int arr[26];
	char str[100];
	int i;

	for (i = 0; i < 26; i++)
		arr[i] = -1;
	scanf("%s", str);
	i = -1;
	while (str[++i])
	{
		if (arr[str[i] - 'a'] == -1)
			arr[str[i] - 'a'] = i;
	}
	for (i = 0; i < 26; i++)
		printf("%d ", arr[i]);
}
