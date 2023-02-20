#include <stdio.h>

int get_num(char *str, int index)
{
	if (index < 0)
		return 0;
	return str[index] - '0';
}

int main()
{
	char input1[10001];
	char input2[10001];
	char result[10001];
	int i = 0, j = 0, k = 0; 
	int add = 0, olim = 0;

	scanf("%s %s", input1, input2);
	while (input1[i])
		i++;
	while (input2[j])
		j++;

	while (i > 0 || j > 0 || olim)
	{
		i--;
		j--;
		add = get_num(input1, i) + get_num(input2, j) + olim;
		olim = 0;
		if (add > 9)
		{
			olim = add / 10;
			add = add % 10;
		}
		result[k++] = add + '0';
	}
	result[k] = 0;
	while (--k >= 0)
		printf("%c", result[k]);
}
