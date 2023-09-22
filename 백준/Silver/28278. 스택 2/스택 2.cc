#include <cstdio>
#include <algorithm>
#include <stack>
using namespace std;


int main()
{
    stack<int> s;
    int n;
    scanf("%d",&n);

    for(int i = 0; i < n; i++)
    {
        int type = 0;
        scanf("%d",&type);
        if(type == 1)
        {
            int x;
            scanf("%d",&x);
            s.push(x);
        }
        else if(type == 2)
        {
            if(s.empty() == 0)
            {
                int save = s.top();
                s.pop();
                printf("%d\n",save);
            }
            else
                printf("-1\n");
        }
        else if(type == 3)
        {
            printf("%d\n",s.size());
        }
        else if(type == 4)
        {
            printf("%d\n",(s.empty() != 0));
        }
        else if(type == 5)
        {
            if(s.empty() != 0)
                printf("-1\n");
            else
                printf("%d\n",s.top());
        }
    }
    return 0;
}