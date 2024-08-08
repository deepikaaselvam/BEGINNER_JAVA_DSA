package TwoPointer;
public class ChReplace {
    public static void main(String[] args) {
        String str="AABABBC";int n=str.length();
        int k=2,maxfreq=0;int changes=0;int maxLen=0;
        for(int i=0;i<n;i++)
        {
            int hash[]=new int[26];
            for(int j=i;j<n;j++)
            {
                hash[str.charAt(j)-'A']++;
                maxfreq=Math.max(maxfreq,hash[str.charAt(j)-'A']);
                changes=(j-i+1)-maxfreq;
                if(changes<=k)
                {
                maxLen=Math.max(maxLen,j-i+1);
                }
                else
                {
                    break;
                }
            }
        }
        System.out.println(maxLen+" ");
    }
    
}
