#include <stdio.h>

int main()
{
	int arr[5] = {0};
	int top = 0;
	int input;
	int menu;

	while (1)
	{
		printf("메뉴 선택(1:push, 2:pop): ");
		scanf("%d", &menu);

		if (menu == 1)
		{
			if (top >= 5)
			{
				printf("OVERFLOW!\n");
				break;
			}
			printf("push할 값 입력: ");
			scanf("%d", &input);
			arr[top++] = input;
		}
		else
		{
			if (top <= 0)
			{
				printf("UNDREFLOW!\n");
				break;
			}
			printf("%d를 pop하였습니다.\n", arr[--top]);
			arr[top] = 0;
		}
	}
}
