#include <iostream>
using namespace std;
long long fibonaciiArr[50] = {0, 1, };

long long fiboFunction(int N)
{
    if(N == 0 || N == 1)
    {
        return fibonaciiArr[N];
    }
    else if(fibonaciiArr[N] == 0)
    {
        fibonaciiArr[N] = fiboFunction(N - 1) + fiboFunction(N - 2);
    }
    return fibonaciiArr[N];
}

int main()
{
    int T;
    cin >> T;
    int temp;
    for(int i = 0; i < T; i++)
    {
        cin >> temp;
        if(temp == 0)
        {
            cout << "1 0" << endl;
        }
        else
        {
            cout << fiboFunction(temp - 1) << ' ' << fiboFunction(temp) << endl;
        }
    }
}