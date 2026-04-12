class Solution {
        public boolean isPalindrome(String s) {
                // Step 1: Initialize two pointers at the ends
                        int left = 0;
                                int right = s.length() - 1;

                                        while (left < right) {
                                                    // Step 2: Skip non-alphanumeric characters from the left
                                                                if (!Character.isLetterOrDigit(s.charAt(left))) {
                                                                                left++;
                                                                                            } 
                                                                                                        // Step 3: Skip non-alphanumeric characters from the right
                                                                                                                    else if (!Character.isLetterOrDigit(s.charAt(right))) {
                                                                                                                                    right--;
                                                                                                                                                } 
                                                                                                                                                            // Step 4: Compare valid characters (case-insensitive)
                                                                                                                                                                        else {
                                                                                                                                                                                        if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                                                                                                                                                                                                            return false;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            left++;
                                                                                                                                                                                                                                                            right--;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                        return true;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            }


