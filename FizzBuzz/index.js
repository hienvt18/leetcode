const fizzBuzz = (n) => {
    var answer = [];
    for (var i = 1; i <= n; i++) {
        var divisible3 = i % 3 === 0;
        var divisible5 = i % 5 === 0;
        var curStr = "";
        if (divisible3) {
            curStr += "Fizz";
        }
        if (divisible5) {
            curStr += "Buzz";
        }
    
        if (curStr === "") {
            curStr += String(i);
        }
        answer.push(curStr);
    }
    return answer;
}