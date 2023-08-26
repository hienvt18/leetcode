const translate = (c) => {
    switch(c) {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        default:
            return 0;
    }
}

const romanToInt = (s) => {
    let sum = 0;
    let cur = translate(s.charAt(0));

    for(let i = 1; i < s.length(); i++) {
        let next = translate(s.charAt(i));

        if(cur < next) {
            sum -= cur;
        }else {
            sum += cur;
        }
    }

    sum += cur;
    return sum;
}   