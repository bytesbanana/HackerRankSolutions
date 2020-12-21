#include <bits/stdc++.h>

using namespace std;

// Complete the diagonalDifference function below.
int diagonalDifference(vector<vector<int>> arr) {
    int j = 0;
    int k = arr.at(0).size()-1;
    int a = 0,b = 0;
    for(int i = 0;i<arr.size();i++){
      vector<int> v = arr.at(i);
      if(j < v.size() && k >= 0){
        cout << " " << v.at(k);
        a += v.at(j);
        b += v.at(k);
        j ++;
        k --;
      }
    }
   
    return abs(a-b);
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    vector<vector<int>> arr(n);
    for (int i = 0; i < n; i++) {
        arr[i].resize(n);

        for (int j = 0; j < n; j++) {
            cin >> arr[i][j];
        }

        cin.ignore(numeric_limits<streamsize>::max(), '\n');
    }

    int result = diagonalDifference(arr);

    fout << result << "\n";

    fout.close();

    return 0;
}
