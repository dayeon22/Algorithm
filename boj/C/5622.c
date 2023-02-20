#include <stdio.h>

int get_seconds(char phone[8][5], char c)
{
	int i, j;

	i = -1;
	while (++i < 8)
	{
		j = -1;
		while (phone[i][++j])
		{
			if (phone[i][j] == c)
				return (i + 3);
		}
	}
	return (0);
}

int main()
{
	int i = 0;
	int time = 0;
	char str[16];
	char phone[8][5] = {{'A', 'B', 'C', 0, 0},
						{'D', 'E', 'F', 0, 0},
						{'G', 'H', 'I', 0, 0},
						{'J', 'K', 'L', 0, 0},
						{'M', 'N', 'O', 0, 0},
						{'P', 'Q', 'R', 'S', 0},
						{'T', 'U', 'V', 0, 0},
						{'W', 'X', 'Y', 'Z', 0}};

	scanf("%s", str);
	while (str[i] != 0)
	{
		time += get_seconds(phone, str[i++]);
	}
	printf("%d", time);
}
