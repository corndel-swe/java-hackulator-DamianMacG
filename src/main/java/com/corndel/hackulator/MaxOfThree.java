package com.corndel.hackulator;

import java.util.ArrayList;
import java.util.Collections;

public class MaxOfThree {

  static int maxOfThree(int x, int y, int z) {

    ArrayList<Integer> nums = new ArrayList<Integer>();
    nums.add(x);
    nums.add(y);
    nums.add(z);

    return Collections.max(nums);

   
    
    

  }
}
