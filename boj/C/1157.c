#include <stdio.h>

int main()
{
	char str[1000000];
	int arr[26];
	int i;
	int max = 0;
	int cnt = 0;

	for (i = 0; i < 26; i++)
		arr[i] = 0;
	scanf("%s", str);
	i = 0;
	while (str[i])
	{
		if ('A' <= str[i] && str[i] <= 'Z')
			arr[str[i] - 'A']++;
		else if ('a' <= str[i] && str[i] <= 'z')
			arr[str[i] - 'a']++;
		i++;
	}
	for (i = 0; i < 26; i++)
	{
		if (arr[i] > max)
			max = arr[i];
	}
	for (i = 0; i < 26; i++)
	{
		if (arr[i] == max)
			cnt++;
		if (cnt == 2)
		{	
			printf("?");
			return 0;
		}
	}
	for (i = 0; i < 26; i++)
	{
		if (arr[i] == max)
			printf("%c", i + 'A');
	}
}
