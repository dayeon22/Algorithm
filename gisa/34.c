#include <stdio.h>

int main()
{
	int score[5] = {90, 100, 70, 60, 80};
	int rank[5] = {1, 1, 1, 1, 1};

	for (int i = 0; i < 5; i++)
	{
		for (int j = 0; j < 5; j++)
		{
			if (score[i] < score[j])
				rank[i]++;
		}
	}

	for (int i = 0; i < 5; i++)
		printf("%d ", rank[i]);
}
