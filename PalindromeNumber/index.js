const isPalindrome = (x) => {
    let s = s.toString();
    let chuoiDao = s.split('').reverse().join('');

    if(s.toLowerCase() === chuoiDao.toLowerCase())
        return true;

    return false;
}