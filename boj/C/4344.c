#include <stdio.h>

int main()
{
	int line;
	int stu_num;
	int score[1000];
	int total = 0;
	double avg;
	int count;

	scanf("%d", &line);
	for (int i=0; i<line; i++)
	{
		scanf("%d", &stu_num);
		total = 0;
		count = 0;
		for(int j=0; j<stu_num; j++)
		{
			scanf("%d", &score[j]);
			total += score[j];
		}
		avg = (double)total / stu_num;
		for (int j=0; j<stu_num; j++)
		{
			if (score[j] > avg)
				count++;
		}
		printf("%.3lf%%\n", (double)count / stu_num * 100);
	}
}
