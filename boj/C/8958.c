#include <stdio.h>

int main()
{
	int line;
	int score;
	int result;
	char str[80];
	int j;

	scanf("%d", &line);
	for (int i=0; i<line; i++)
	{
		result = 0;
		score = 0;
		j = 0;
		scanf("%s", str);
		while (str[j])
		{
			if (str[j] == 'O')
			{
				score++;
				result += score;
			}
			else
				score = 0;
			j++;
		}
		printf("%d\n", result);
	}
}
