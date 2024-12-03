package com.company;

public class multiarray {

    public static void main(String[] args){
        int nums[][] = new int[3][];
        int sum =0;

        nums[0] = new int[3];
        nums[1] = new int[2];
        nums[2] = new int[4];

        for (int i=0;i< nums.length;i++)
        {
        for (int j=0;j< nums[i].length;j++){
            nums[i][j]= (int) (Math.random()*10);
           System.out.println(nums[i][j]);
    }
        }
       /* for (int i=0;i<1;i++)
        {
            for (int j=0;j<2;j++)
            {
                System.out.println(nums[i][j] + " ");
               sum+=nums[i][j];
            }
            System.out.println(sum);
            System.out.println();
        }

        */
        for(int n[]:nums)
        {
            for (int m:n){
                System.out.println(m+"");
            }
            System.out.println();
        }

        char[] vowels = {'a','e','i','0','u'};
        for(char vow :vowels)
        {
        System.out.println(vow);
        }
    }
}
