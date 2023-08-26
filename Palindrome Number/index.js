
const isPalindrome = (x) => {
    let s = x.toString();
    let chuoiDao = s.split('').reverse().join('');

    if (s.toLowerCase() === chuoiDao.toLowerCase()) {
        return true;
    }
    return false;
}