
const removeDuplicates = (nums) => {
    let curIndex = 0;

    for (let i = 0; i < nums.length; i++) {
        if(nums[i] != nums[curIndex]) {
            curIndex++;
            a[curIndex] = a[i];
        }
    }
    return curIndex + 1;
}