#include <stdio.h>

int main()
{
	int score[5] = {90, 100, 70, 60, 80};
	int rank;

	for (int i = 0; i < 5; i++)
	{
		rank = 1;
		for (int j = 0; j < 5; j++)
		{
			if (score[i] < score[j])
				rank++;
		}
		printf("score:%d, rank:%d\n", score[i], rank);
	}
}
