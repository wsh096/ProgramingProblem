#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);
    int arr[N];
    int idx = 0;
    int sum = 0;

    for (int i = 0; i < N; i++) {
        int temp;
        scanf("%d", &temp);
        if (temp == 0 && idx != 0) {
            idx--;
            sum -= arr[idx];
        } else {
            arr[idx] = temp;
            sum += arr[idx++];
        }
    }

    printf("%d\n", sum);
    return 0;
}
