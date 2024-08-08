package StringsConcept;
class SubString {
    static void subString(char str[], int n) {
            for (int len = 1; len <= n; len++) {
               for (int i = 0; i <= n - len; i++) {
                   int j = i + len - 1;
                    for (int k = i; k <= j; k++) {
                        System.out.print(str[k]);
                    }
                    System.out.println();
                }
            }
        }
        public static void main(String[] args) {
            char str[] = {'a', 'b', 'c','d'};
            subString(str, str.length);
    
        }
    }
   
    
