const plusOne = (digits) => {
    let carry = 1;

    for (let i = digits.length - 1; i >= 0; i--) {
        digits[i] = (digits[i] + carry) % 10;
        carry = Math.floor((digits[i] + carry) / 10);
    }
    if (carry > 0) {
        digits.unshift(carry);
    }
    return digits;
    
}