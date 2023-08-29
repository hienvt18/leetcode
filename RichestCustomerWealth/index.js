const maximumWealth = (a) => {
    let soHang = a.length;
    let soCot = a[0].length;
    let max = 0;

    for(let i = 0; i < soHang; i++) {
        let tongHangI = 0;
        for (let j = 0; j < soCot; j++) {
            tongHangI += a[i][j];
        }

        if(tongHangI > max) {
            max = tongHangI;
        }
    }
    return max;
}