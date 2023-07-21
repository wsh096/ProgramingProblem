#include <stdio.h>

char stack[101];
int top = -1;

int emptyStack()
{
	return top == -1;
}

void push(char ch)
{
	stack[++top] = ch;
}

char pop() 
{
	return stack[top--];
}



int isOk(char *str)
{
	char ch, chs;
	
	top = -1;
	
	for (int i = 0; str[i] != '\0'; i++) {
		ch = str[i];
		if (ch == '(' || ch == '[') push(ch);
		else if (ch == ')' || ch == ']') {
			if (emptyStack()) return 0;
			chs = pop();
			if (ch == ')' && chs != '(' ||
				ch == ']' && chs != '[') return 0;
		}
	}
	
	if (emptyStack()) return 1;
	return 0;
}

int main()
{
	int n;
	char str[101];
	
	gets(str);
	while (str[0] != '.') {
		if (isOk(str)) puts("yes");
		else puts("no");
		
		gets(str);
	}
	

}