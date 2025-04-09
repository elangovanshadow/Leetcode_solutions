#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    int countPrimes(int n) {
        vector<bool> pr(n,false);
        for(int i = 2; i < n; i++) pr[i] = true;
        for(int i = 0;i*i < n; i++){
            if(pr[i]){
                for(int  j = i*i; j < n; j+=i){
                    pr[j] = false;
                }
            }
        }
        int count = 0;
        for(int i = 2; i < n; i++) {
            if(pr[i]){
                count++;
            }
        }
        return count;

    }
};