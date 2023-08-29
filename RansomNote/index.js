const canConstruct = (ransomNote, magazine) => {
    let map = {};
    for(let i = 0; i < magazine.length; i++) {
        let m = magazine.charAt(i);

        let currentCount = map[m] || 0;
        map[m] = currentCount + 1;
    }

    for(let i = 0; i < ransomNote.length; i++) {
        let r = ransomNote.charAt(i);

        let currentCount = map[r] || 0;
        if(currentCount === 0) return false;
        map[r] = currentCount - 1;
    }
    return true;
}